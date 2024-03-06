---
DIP: 37
Title: Proposal for a new ticket payment plugin for Devcon 7
Status: Draft
Themes: Ticketing, Payments
Tags: Software, Payments
Instances: Devcon 7
Authors: ryanberckmans@gmail.com
Resources Required: Tech support, Communication support
Discussion: https://forum.devcon.org/t/dip-34-proposal-for-a-new-ticket-payment-plugin-for-devcon-7/3350
Created: 2024-03-06
---

## Summary of Proposal

Adopt the 3cities payment app for Devcon 7 ticketing payments. 3cities is a decentralized, open payments app focused on accessibility, credible neutrality, and supporting many wallets, tokens, currencies, and chains.

## Abstract

This proposal outlines a collaboration between the Devcon Team and 3cities to enhance the ticket payment experience for Devcon 7 through a decentralized, open-source payment solution hosted on IPFS (or self-hosted).

3cities aims to address the fragmentation in Ethereum's ecosystem by supporting a wide range of networks, currencies, and tokens, and by offering a user-friendly interface that automatically selects the best payment method based on the user's wallet contents.

The solution is designed to be neutral and free, prioritizing simplicity, automation, and diversity to align with Ethereum's principles. It includes development of a core payment app, a shim SDK for easy integration, a static payment verifier, and a pretix payment plugin to seamlessly connect with the ticketing platform.

The collaboration seeks to provide a delightful UX for ticket purchases, reduce transaction fees to near zero, and set a precedent for future payment solutions across various applications.

This initiative represents a step towards unifying Ethereum's payment landscape while supporting the broader goal of minimizing the cost of global transactions.

## Motivation & Rationale

### Background

The Devcon Team uses Pretix as the ticketing platform for Devcon 7 and pretix-eth-payment-plugin to accept ticket payments on Ethereum.

The Devcon Team’s goal for ticket payments is a delightful UX that embraces Ethereum’s neutrality and diversity.

In recent years, Ethereum’s large & growing number of chains and tokens, as well as the rise of smart contract wallets, has made it burdensome for pretix-eth-payment-plugin to fully deliver on this goal.

In response, the Devcon Team searched for a next-gen payment provider. 3cities seeks to be that provider in a collaboration with the Devcon Team.

### Proposed ticket payments solution

We propose that the Devcon Team collaborate with 3cities 3 to facilitate ticket payments for Devcon 7.

3cities is decentralized, released on IPFS, and depends only on commodity ethrpc data and fungible open (auth-less) price feeds.

3cities is free and open. All components will be open-sourced under MIT license.

3cities embraces Ethereum pluralism, with maximal coverage of eligible payment methods

- Networks supported today: Ethereum Mainnet, OP Mainnet, Arbitrum One, Arbitrum Nova, zkSync Era, Scroll, Linea, Zora, Base, Polygon zkEVM, Polygon.
- Currencies supported today: ETH, USD, EUR.
- Tokens supported today: ETH, WETH, STETH, USDC, USDT, DAI, LUSD, USDP, PYUSD, GUSD. No EUR tokens are supported today, with the intention to add some before launch.
- Support for EOAs, smart contract wallets, and AA.
- 3cities defragments L2s via auto-selection of payment pathways. 3cities scans the sender’s wallet and automatically discovers the best token & network for any given payment.

### Why is 3cities a good solution for Devcon?

Collaborating with 3cities can help the Devcon Team achieve the goal of ticket payments having a delightful UX that embraces Ethereum’s neutrality and diversity.

The 3cities solution touches on all aspects of the Devcon Team’s ticket payment goal:

1. Having a delightful UX focused on polish, simplicity, automation, and desktop & mobile views.
1. Being a neutral solution via being open source and free, with no tracking or fees, as well as by having a thin, modular, flexible deployment profile on IPFS, via SDK, or compiled into a codebase, and in terms of runtime dependencies, requiring only commodity ethrpc data and fungible open (auth-less) price feeds, with no dependency on offchain indexers or centralized APIs.
1. Embracing diversity via a commitment to Ethereum’s plurality of wallets, tokens, and chains.

### Why work on this? Why this approach?

I am working on this project because I believe that free, open, Ethereum-based payments can help unlock many new economic connections for the world, as well as make obsolete high transaction fees charged by payment service providers.

Ethereum’s permissionless growth has yielded a wonderful Cambrian explosion of chains, tokens, wallets, and centralized crypto payment software-as-a-service.

But, this Cambrian explosion means we can’t solve global payments without solving onchain fragmentation. And Ethereum needs a unified payment solution that’s as credibly neutral as Ethereum itself; centralized solutions replicate tradfi gatekeeping and fee structures and are insufficient to meet the world’s payment needs.

Solving for onchain fragmentation can only be done in the UX layer because only offchain can unite Ethereum’s many disparate payment technologies, liquidity layers, currencies, tokens, networks, architectures, etc. into a single seamless, delightful, automatic payment experience. This is why an idealized payment solution must be rooted in offchain end-user software and not only in onchain protocols.

Last year, the world spent $2.2 trillion in payment fees (McKinsey). That’s approximately the GDP of Canada spent only on payment fees.

In the future, the world will benefit from no correlation between the amount of value transferred in a payment and the fee paid by the sender and/or receiver. This is the rise of the zero-fee payment stack.

Today, in every country, payments are affected by the permissioned global tree structure of the tradfi correspondent banking system. This creates pricing power, enabling incumbent payment providers to often take a percentage of payment value, especially for purchases. Ethereum changes all that.

Now, all global payments can be charged based on the marginal cost of pure software, which is near zero.

We propose development of an open payment system that can be used by merchants globally, to support the long-term ecosystem goal of reducing the size of the payments industry by 99%+ from $2.2 trillion in annual transaction fees down to ~$20 billion in software cloud fees.

This collaboration with the Devcon Team is important to 3cities because 3cities spent the past year building our core technology and developing five different go-to-market approaches in parallel, representing an intentional lack of focus during our discovery phase. Thanks to our early discussions with the Devcon Team, we now see that focusing on a zero-fee ecommerce payment stack is the most productive current focus for our project.

3cities proposes to collaborate with the Devcon team to launch our neutral ecommerce payment solution and grow the legitimacy of a zero-fee, decentralized, pluralistic approach to payments.

## Implementation

### Proposed end-user UX

1. Alice is ready to pay for her Devcon 7 tickets. Alice clicks “Pay Now” in the sales page.
1. 3cities pops up an in-page modal to run the checkout payment process, allowing Alice to pay without leaving the ticketing page.
1. Alice clicks “Connect Wallet” in the modal. A large number of ecosystem wallets are supported.
1. Upon wallet connection, 3cities silently and automatically scans Alice’s address on all supported networks to discover the best payment method. This scan is run directly by Alice’s browser via direct connection to (configurable) ethrpc endpoints.
1. Alice clicks “Pay Now” to automatically pay with the discovered best payment method. Alternatively, Alice may select from the list of discovered payment methods.
1. Alice is prompted to sign a message that securely associates her sender address with her Pretix order ID. In the future, with CAIP-222, we can gradually remove the signature where supported.
1. Alice is then prompted to sign the payment transaction, including 3cities handling any required network switching and other edge cases. The transaction signing prompt pops up automatically without Alice having to click a button again, since Alice already clicked “Pay Now”.
1. Upon successful payment transaction confirmation, Alice is prompted to click “Continue” to close the payment modal.

### Proposed 3cities deliverable
1. Upgrade core payment app (TypeScript)
    1. This is the current 3cities live product, a client-facing in-browser decentralized app.
    1. New features to be added include
        - Ability to specify a distinct receiver address per network.
        - In-app signatures to securely associate pretix order IDs to expected payment sender addresses.
1. Build new shim SDK (TypeScript)
    - A thin proxy SDK used to embed the core payment app in an iframe modal inside the Devcon ticket sales website. This lets users pay without being redirected to another site.
1. Build new static payment verifier (TypeScript)
    - Used to verify expected payments against actual funds received.
    - To be published as a stand-alone npm module.
1. Build new payment verifier service (TypeScript, gRPC for polylingual service clients)
    - A server-side sidecar service that fulfills payment verification requests from the Devcon ticketing pretix server.
    - A maximally thin wrapper around the static payment verifier, designed to make it convenient to deploy the static verifier as a service.
1. Build new pretix payment plugin to integrate 3cities components with pretix (Python)
    - This plugin orchestrates the overall payment within the pretix system, including
        - Receipt of the customer's signed sender address to associate with customer's order ID in the pretix DB.
        - Delegation of payment verification to a configurable verifier service. By default, the 3cities hosted verifier is used, but anyone may host a verifier as it’s open source. In the future, a 3cities decentralized payment verification network could be developed and become the default.
1. Open-source the entire stack with MIT license.
1. Publish all components with CI/CD verifiable builds to IPFS. The core payment app is already published to IPFS today.
1. Publish pretix plugin for the 3cities integration, so that the pretix community can benefit from & support maintenance of accepting Ethereum payments using 3cities.
1. Publish a report on our use of signatures in the app to securely associate order IDs with sender addresses, with the goal of helping to drive ecosystem adoption of CAIP-222.
1. Assist the Devcon Team in devops of production deployment, product iterations, launch monitoring, etc as needed.
1. Full system live in testnet by **March 22**, and production-ready by **April 26**.

## Operational Requirements & Ownership

### Things 3cities needs from the Devcon Team

1. Willingness to accept ticket payments on as many L2s possible and in as many stablecoins as possible
    - Create a Devcon Team multisig to receive funds on all 3cities supported networks.
    - Agree together on a maximally broad set of stablecoins to accept for payment. 3cities relies on bluechip.org stablecoin ratings. Today, 3cities accepts DAI, USDC, USDT, LUSD, USDP, PYUSD, and GUSD.
1. A moderate level of time & attention to engage with 3cities progress updates, requested software design & other reviews, and product feedback cycles.
1. Lead production deployment in late April, with 3cities assistance.
1. Provide access to the Devcon Team’s support contract with pretix should the need arise.
1. Publicize use of 3cities for payments and public education of the general model of multichain payment intents with offchain verification. Eg. blog post, tweets, podcast episode if a suitable one becomes available, etc.
1. Solicit feedback from Devcon ticket purchasers on the payment UX on an ongoing basis from May to November, and provide this feedback to 3cities.
1. Be cognizant of an upcoming 3cities rebrand. The name "3cities" predates the project's focus on payments and needs to be changed to maximize impact. All co-marketing to occur after rebrand.
1. Be cognizant of an upcoming 3cities visual redesign. We have received feedback that the current visual design needs work. 3cities is addressing this feedback with a redesign of style but not overall UX.
1. Support a new 3cities point-of-sale payments solution at Devcon 7
    - In the second half of 2024, 3cities seeks to develop a new point-of-sale in-person payment system based on this same technology.
        - The vision for this point-of-sale system is for any Devcon attendee with a mobile wallet can pay for anything in-person by scanning a QR code and sending ETH or stablecoins on over a dozen L2s, with the same delightful UX & auto-selection of payment pathways used for ticket payments.
    - After and only if this project is successful and ticket sales are live with the new system, assist in growing 3cities' new point-of-sale solution with Devcon 7 vendors.
        - For example, including but not limited to introductions, endorsements, feedback, etc, related to encouraging all on-site vendors to accept in-person Ethereum payments using 3cities.
    - Pending success of this ticketing project and the Devcon Team’s approval of the new point-of-sale product design & UX, 3cities to become the Devcon Team’s official crypto point-of-sale payment provider for Devcon 7.
    - Devcon 7 conference passes for the 3cities team (currently just 1 pass for Ryan Berckmans, may grow), as the team will be onsite to grow & support conference vendors using the new point-of-sale system.

### Things 3cities does not need from the Devcon Team

1. No payment.
    - 3cities does not request or expect payment from the Devcon Team for this ticketing payment project or any subsequent point-of-sale project.
    - 3cities did not compensate the Devcon Team in any way for these opportunities.
    - This project is a pure collaboration between the Devcon Team and 3cities, with no pecuniary consideration.
2. No direct software development resources from the Devcon Team for any 3cities deliverables, except where noted above. Ie. Devcon Team to provide design review, product feedback, and lead the production deployment, but Devcon Team not to co-author the above software.

### Conclusion
If this collaboration is successful, we will see:

- A delightful, next-gen ticket payment UX for Devcon 7
    - It’s exciting to automatically accept payment on as many L2s as possible and in as many stablecoins as possible, without needing to rely on a centralized payment processor.
- An enduring payment solution for future Devcons
    - Ongoing evolution via 3cities growing across various payment use cases.
    - Payment method abstraction, where 3cities will add support for new stablecoins, chains, etc, and Devcon can automatically gain these with no action required by the Devcon Team (except to opt-in to these new payment methods and, possibly, deploying a new multisig to receive funds on new chains.)
- The opportunity for the 3cities stack to be used for in-person payments at Devcon 7
    - Pay for your merch with whatever’s in your mobile wallet, on whatever L2!
- The emergence of a credibly neutral payment stack for Ethereum
    - By being a flexible, modular, open, free, pluralistic payment stack, 3cities aspires to achieve software economies of scale to deliver best-in-class UX across many payment use cases, including
        - Ecommerce checkout
        - Point-of-sale
        - Interpersonal payments
        - Tips & donations
        - Paywalls & micropayments
        - Payments as a pluggable feature for wallets & apps
        - Safe & easy user deposits for CEXes

## Links & Additional Information

Pretix website https://pretix.eu/about/en/

Current pretix ethereum payment plugin https://github.com/lassejaco/pretix-eth-payment-plugin/tree/publish-candidate

3cities website https://3cities.xyz/

Bluechip website https://bluechip.org/
