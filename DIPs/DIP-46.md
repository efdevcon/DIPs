DIP: 46
Title: POD-Based Ticketing At Devcon
Status: Draft
Themes: Ticketing, Social, Purchases & ID, Community Involvement
Tags: Event Production, Software
Instances: Devcon7
Authors: Richard Liu (richard@0xparc.org)
Resources Required: Operations Support
Discussion: https://forum.devcon.org/t/dip-46-pod-based-ticketing-at-devcon/3850

---

# Summary of Proposal

We propose to issue Devcon 7 tickets as PODs, enabling attendees to plug into a network of applications and cryptographic gadgets. If tickets are issued as provable object data, Devcon community members can generate ZKPs about their activity that are portable across other platforms—event host websites, Devcon-native applications, and more.

# Abstract

Devcon tickets are sold, distributed, and checked at the door using Pretix. Similar to Devconnect last year (DIP-31), we propose modifying the ticket distribution and checkin part of the process to make use of Zupass rather than Pretix. Zupass is a flexible, open-source, E2E encrypted storage mechanism for ZK-friendly data (PODs)—data that you can make cryptographic proofs about. After purchasing a Devcon ticket via Pretix, an attendee would be able to access their cryptographic POD via Zupass, and event staff would be able to check attendees in at the door via a scanning app like PretixSCAN. By issuing tickets as PODs, event attendees would be empowered to use their tickets later on to access additional services, and builders at events would be able to build applications or community infrastructure interacting with event attendee data.

# Motivation & Rationale

Zupass is a cryptographic data manager that lets users store, generate, verify, and share [PODs](https://pod.org) (formerly, we focused on the term PCD), currently implemented as a web application hosted on zupass.org.

POD (Portable Object Datatype) is designed to make cryptographic operations on their content cheap and efficient — even on resource constrained devices like mobile phones & embedded systems. They can be redacted, transformed, and aggregated in a provable way, enabling data to cross trust boundaries.

Zupass is a user's window into a world of applications and experiences that produce and consume PODs. One way to 'consume' a Devcon ticket POD is to get 'checked into' an event by event staff. Once checked in, attendees wouldn't lose access to their POD - it remains in their Zupass, ready to be 'consumed' in other ways. As a result, Devcon attendees would be empowered to use their ticket later on however they want.

Another way to 'consume' a Devcon ticket POD to gate access to unofficial websites to just Devcon attendees. Another thing someone could do is develop their own event check-in flow, which could be used at another in-person event restricted to just attendees of Devcon. Someone else could develop an on-chain smart contract that consumes these Devcon ticket PODs and issues commemorative NFTs to event attendees.

We distilled the concept of POD from our experience building and supporting the development of many different cryptography primitives and cryptography-enabled applications. The R&D process made it clear that we are missing many abstractions and infrastructure that would be necessary to bring our cryptography applications to production.

PODs in Zupass are able to be permissionlessly [verified on Ethereum](https://github.com/BuidlGuidl/zupass-scaffold-eth-2/tree/main). This gives PODs properties that folks have affectionately referred to as EZ Data (Ethereum-ZK Data -- data that is EZ to ZK-verify on Ethereum).

Zupass aims to uphold values within Ethereum and in the broader blockchain ethos by being an open-source project that gives people ownership over their data so that they can use the data in precisely the ways they want. Further, the team is developing not just Zupass and other software abstractions, but also an ecosystem of developers who build applications that plug into the POD abstraction. These applications, by virtue of being developed on top of the POD abstraction, further propagate these values by empowering users in a way that respects their sovereignty and privacy.

# Implementation

Our first use-case for Zupass was a community event called [Zuzalu](https://zuzalu.city/about), which was a “first-of-its-kind pop-up city community” that took place in Montenegro between March and May 25, 2023. You can think of Zuzalu as a long conference for members of the extended Ethereum community.

Under the hood, Zupass is a general-purpose cryptographic data manager. At Zuzalu, Zupass was the primary method of digital and physical authentication. It was used daily to access gated physical event spaces and venues via a QR code. It was also used to authenticate into online digital experiences via an OAuth-like integration flow. For example, event participants could login to the official Zuzalu website using their Zupass, much like one is able to login to the Devcon forum using their Google account. Once logged in, participants were granted access to a private portion of the website - the Zuzalu schedule. There, participants could view the schedule and add events to it. 100% of all Zuzalu residents (~200 users) and Zuzalu visitors (~600 users) onboarded onto Zupass, and used it daily for ZK-based digital and physical authentication over two months.

We designed Zupass with ecosystem development in mind, and seeded/facilitated other identity and community experiments on top of the infrastructure that we built.

It’s important to note that Zupass is ‘permisionlessly interoperable’ - developers of third party applications did not need our permission to integrate with the PCD framework. The entire thing is open source, and exposes easy-to-understand and easy-to-incorporate APIs.

Since Zuzalu, community platforms including [Zuzagora](https://www.zuzagora.com/), [Fora](https://fora.co/) and [Lemonade](https://lemonade.social/) have also built integrations to issue and/or verify cryptographic ID through Zupass. At ZuConnect, Zupass was used to provide tickets, polls, and new features including gated Telegram chat and an [anonymous chat bot](https://t.me/zurat_bot). Hackathon projects were able to leverage Zupass for use-cases including [zero-knowledge clinical trial](https://github.com/seeincodes/zuhack-istanbul) participation, [issuance of tickets](https://github.com/lemonadesocial/lemonade-zupass/) for additional events, and even [sharing of horoscopes](https://github.com/raigal-r/zuAstro).

The most recent [Gitcoin round’s](https://explorer-maci.gitcoin.co/#/round/534352/16) sybil resistance mechanism was completely facilitated through Zupass and cryptographic data — residents had to ZK-prove they had a Zuzalu or ZuConnect ticket in order to donate to a project.

At Devconnect last year, Ethereum and 0xPARC community members launched FROGCRYPTO - a game based around collecting cryptographically-signed frogs. Hundreds of thousands of frogs were collected, and over 400 people received a Frog Hat for collecting more than 50 frogs. More importantly, the aim of showing--not just explaining--the potential of proof-carrying data was achieved. For many people, these were their first tangible experiences of zero-knowledge cryptography, showing how real-world use-cases can be addressed by programmable cryptography.

In 2024, Zupass and the ZK data ecosystem have powered various Zuzalu ecosystem events — Edge City Denver, Edge Esmeralda, and ZuVillage Georgia — among other community-organized events. We’re also excited to see Zupass increasingly being used at Ethereum events that Zuzalu — ETH LATAM, ETHBerlin, ETHPrague. Here are some of the projects that various community developers have built on top of PODs and Zupass.

- [Zumeet](https://github.com/floAr/offuffsaf): A peer-to-peer social network with ZK feeds
- [Zukofi:](https://projects.ethberlin.org/submissions/352) Private qudaratic voting using FHE
- [Voto](https://github.com/Vote-tech/voto-tech): zkMACI (private, bribery resistant voting infrastructure)
- [zk-twitter](https://github.com/ichub/zk-twitter): Peer-to-peer image-sharing website
- [zu-git-proofs](https://github.com/sztok7/zu-git-proofs): ZK badges in social forums
- [Zuum](https://zuum.gg): Strava run data issued as PODs in a competitive leaderboard
- [Testnet ETH Faucet](https://github.com/pk910/PoWFaucet): Claim 500 HolETH via a ZKP of a ticket
- [Safe Bounty Fund](https://projects.ethberlin.org/submissions/312): Streamline bounty payouts using ZK
- [Zupass Collab](https://github.com/vijaykrishnavanshi/ethberlin04): Onchain community identity for Zupass groups
- [Zupass Smart Wallet](https://github.com/BuidlGuidl/zupass-smart-wallet): ERC-4337 + On-Chain ZK verification
- [ETH LATAM Zupass Faucet](https://github.com/crisgarner/zupass-faucet): MACI gatekeeper using ZK verification of ticket
- [BattleFrogz](https://github.com/omurovec/battlefrogz): MPC CLI-based Frog battler

# Operational Requirements & Ownership

## Actions needed for Devcon

- Deploy an on-premise version of PODBox so that tickets purchased on Pretix can be issued as PODs via Zupass.
- Develop a ticket checkin flow so that event staff can check people in on-site.
- Test the end-to-end ticketing flow, from purchase to issuance to check-in to ensure it meets the standards of Devcon event organizers.

The Zupass core team at 0xPARC is responsible for developing, testing, and deploying this project and helping Devcon tech team to set up their self-hosted PODBox instance. The Devcon organizing team is responsible for implementing the operational changes both at event-sale time and on-site at the event to make use of Zupass.

## Hacking on Zupass and PODs

We are excited for teams this year that are already beginning the process of integrating with PODs using the Zupass client:

- [Meerkat](https://forum.devcon.org/t/meerkat-q-a-tool-for-audience-engagement/3805/3)
- [Backpocket](https://forum.devcon.org/t/dip-42-backpocket-mpc-for-human-connection-with-nfc-social-graphs/3667/8)
- FROGCRYPTO team
- Several other teams currently at an earlier stage of integration

If you'd like to start integrating as an app developer, you can get started at the [ZApp template repo](https://github.com/proofcarryingdata/zapp-template). Please also reach out to us at passport@0xparc.org for any questions!

# Links & Additional Information

## Technology Upgrades

Since Devcon, 0xPARC and various Ethereum community members have continued to build out and iterate on the data models, protocols, and user experience of these tools.

### POD Standard

POD (Portable Object Datatype) is the next iteration of the concept formerly known as [PCD](https://github.com/efdevcon/DIPs/blob/267a3538e8e593b4755a53a49f3e92aeeda9a02a/DIPs/DIP-31.md). It is designed to make cryptographic operations on their content cheap and efficient — even on resource constrained devices like mobile phones & embedded systems. They can be redacted, transformed, and aggregated in a provable way, enabling data to cross trust boundaries.

POD significantly shortens the time of development and provability compared to the raw PCD SDK: from 2,000 lines of code to a few lines change in a JSON-like object. Furthermore, various cryptographic gadgets are being designed to ingest PODs in particular, the first of which being General Purpose Circuits (GPC).

You can find more information about the POD standard at [pod.org](http://pod.org) and more detailed documentation on the technical specifics [here](https://zupass.org/pod).

### Zupass Core

Beyond the POD standard, the core team has pushed forward the following technology upgrades (all are completed or nearing completion):

- Low-friction one-click flow
  - Zupass team has developed a simple one-click flow accessible from email that takes users directly to their QR code for checking in.
  - Furthermore, this flow uses the smaller Pretix-style QR codes and is easily scannable by the Devcon team's Sunmi laser scanners.
- Upgrade to Semaphore V4 identities
  - This unlocks the ability for every Devcon attendee to create PODs, as each Semaphore V4 identity is an EdDSA keypair
- Ability to change and add multiple email addresses
  - Beyond the user experience upgrade, this separates the concept of an email (represented by a POD signed from an email attestation server) from your cryptographic identity.
  - Increasingly, we want your a cryptographic identity (Semaphore, PGP, etc) to be the default ‘source of truth’ over a custodied solution such as an account in a centralized email provider.
- PODBox - generic issuance software for PODs
  - PODBox is self-hostable, meaning that Devcon team will be running the issuing server for tickets and custody the private key for generating PODs.
  - Devcon’s signatures (verifiable with the EF Devcon public key) will serve as the root of a valid “chain of trust” that can extend into future events and be useful for discounts, applications, and more.
