---
DIP: 32
Title:  Email Welcome Packs with Testnet Tokens for Workshops at DEVCon(nect)
Status: Draft
Themes: Ticketing
Tags: Testnet tokens, Ticketing
Authors: konrad@peanut.to; hugo@peanut.to
Resources Required: Operations support
Discussion: https://forum.devcon.org/t/rfc-dip-for-simplifying-testnet-token-distribution-for-workshops-at-devcon-nect/3233/
Created: 2023-9-29
---

# DIP for Email Welcome Packs with Testnet Tokens for Workshops at DEVCon(nect)

Authors: kkonrad.eth; hugo0.eth. We would like to thank Ligi for the initial inspiration at EthBerlin3 and idea for DIP-32.

---

## Summary of Proposal

This is a proposal for a including testnet tokens in the welcome emails. Specifically, it proposes a method to simplify the process of distributing testnet tokens at hackathons. A token claim link should be send with each registration welcome email, using open source technology (a Pretix plugin and Peanut Protocol). This an incremental improvement over the distribution method developed for EthBerlin3.

## Abstract

At Ethereum hackathons, participants often need testnet Ether for their experiments and prototypes. Currently, obtaining these tokens can be an inconvenient process, detracting from the main objectives of the event. At EthBerlin3, an innovative method was used where scratch cards were handed out to distribute Goerli testnet tokens. However, each gift card corresponded to a new externally owned account (EOA), and users had to manually enter a seed phrase to gain access. 

The proposed method removes the need for physical distribution for the organisers, reduces manual input errors by users, and ensures that participants have access to testnet tokens as soon as they're registered. This will lead to smoother onboarding and a better overall experience at the hackathon. Given that Devconnect is soon, we believe this proposal, if accepted, can be swiftly implemented and tested.

### Comparison to PCDs (DIP-31)

Both approaches have advantages and disadvantages. PCDs seem more ambitious but are a valuable experiment in zk-based identity solutions. Links are just a simple plugin that can be used with the existing setup. Links do require too much infrastructure beyond the Pretix plugin which can be based on a fork of the Pretix Attestation Placeholder Plugin by ligi, nurts, a5net & kvbik. 

In the future, once PCDs are implemented, welcome packs with links could perhaps still be send as PCDs such that there is no association between the email and the welcome pack.

## Specs, Operational Requirements & Ownership

**Proposal:** Distribute testnet tokens by including a link in each registration confirmation email.

**Ownership:**
The team behind Peanut Protocol can either own the entire process, which would require data sharing and is undesirable from a data handling perspective, or only implement the technology and thus own:
1. creating the Pretix Plugin and implementing the Peanut Proctocol SDK in that. 
2. Testing said plugin on a fake test event.
3. Maintain the repo.
4. Helping the DevCon(nect) temas use the new technology.


**Mechanism:**

1. Participants register for the hackathon.
2. Upon successful registration, they receive a confirmation email. This email will contain a unique link.
3. By clicking on the link, participants are taken to a webpage where they can directly claim their testnet tokens to their preferred wallet address. It possible to distribute a single token type on one chain or multiple tokens (including NFTs) across many chains.

**Trust Assumptions:**

1. For Pretix specifically, the emailing server. The emailing server will have access to the contents of the mail merge and could in theory steal the testnet tokens.
2. The frontend, as long as it runs, the Peanut Protocol code (all repos are open source) cannot rug the funds either. The funds are never held in custody and the keypairs are generated on the local devices of the users.

**Data handling:**

1. The Peanut Protocol team would not be collecting emails or anything as this would be a Pretix plugin run by Devcon.

## **Implementation Details:**

We intend to build this functionality as a plugin on the Pretix platform. Pretix already supports merge mailing via Python scripts for attestations (see  https://github.com/efdevcon/pretix-attestation-placeholder-plugin), a similar mechanism can be used to dispatch unique links to participants. This system will allow us to send thousands of emails with individualized token claiming links efficiently.

Each link is a Peanut link. When a link is created, funds that are being sent are deposited into a Peanut smart contract. This contract holds the funds until they are unlocked using the link in the future. Each time tokens are deposited into a contract a seed is created to protect the funds. This is used to deterministically generate an asymmetric key pair, the public key of which is stored along with the funds in the Peanut smart contract. Each link follows the same basic structure: `https://peanut.to/claim?c=CHAIN&i=INDEX&v=VERSION&p=KEY`. See some example links below. You can try generating some yourself [here](http://peanut.to/). The tokens being sent along with the public key are stored by calling `makeDeposit` in the Peanut smart contract. The on chain function emits a `DepositEvent` which contains an index parameter, this is the slot within the Peanut contract where the funds will be stored until claimed. 

The [Peanut SDK](https://docs.peanut.to/integrations/building-with-the-sdk/getting-started-with-the-sdk) and the Peanut App can be used to mass generate such links for the mailing list.

### Steps

The implementation will require:

1. Forking the https://github.com/efdevcon/pretix-attestation-placeholder-plugin and integrating the token distribution system using https://github.com/peanutprotocol/peanut-sdk (see more [here](https://docs.peanut.to/integrations/sdk-quick-start)).
2. Setting up a system to generate unique links for token claims.
3. Implementing the merge mailing script to dispatch these links in registration confirmation emails.

## **Test Cases**

Before final implementation, a smaller test run can be conducted:

1. A mock event can be set up on Devconnect’s Pretix.
2. The pretix merge mailing system can be utilized to send out testnet token links.
3. The links can be tested and other potential issues uncovered.

## **References**

- Ethberlin3 and the scratch card-based token distribution.
- [Community discussion on forum.devcon.org](https://forum.devcon.org/t/rfc-dip-for-simplifying-testnet-token-distribution-for-workshops-at-devcon-nect/3233/4)
- Pretix
    - **[Pretix Documentation](https://docs.pretix.eu/en/latest/)**
    - https://github.com/efdevcon/pretix-attestation-placeholder-plugin
- Peanut Protocol
    - [Peanut Protocol Documentation](https://docs.peanut.to/integrations/sdk-quick-start)
    - https://github.com/peanutprotocol/peanut-sdk

## Example Links

- https://peanut.to/claim#?c=5&v=v4&i=921&p=2qqml7oYgfA1ocSG&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=922&p=oqSR7hDj4DdyJk9L&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=923&p=k4XLuILZ5n99eKwe&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=924&p=XAppXYbMT1M13HeB&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=925&p=2geMJPCAoyMJl8dF&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=926&p=to6j0EFa4irfoGqD&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=927&p=wdASreqwmiwWp3RA&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=928&p=mKfzdgWw8ITA3tQL&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=929&p=k24sjWykbL2avsZl&t=ui
- https://peanut.to/claim#?c=5&v=v4&i=930&p=Nzc6PyCfq5Nlu0Hn&t=ui