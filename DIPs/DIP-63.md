---
DIP: 63
Title: Travel insurance
Status: Accepted
Themes: Travel, Safety
Instances: Devcon7
Tags: DeFi, Insurance, Peer2Peer
Authors: Christoph Mussenbrock <christoph@etherisc.com>
Resources Required: Social Media Support
Discussion: https://forum.devcon.org/t/dip-63-travel-protection-flight-delay-protection/5244
Created: 2024-11-06
---

## Summary of Proposal

A lot of people will travel to Devcon SEA. This will impose a number of risks to these people:
flight Delays, baggage loss, theft, and others. We will build a decentralized travel insurance for Devcon SEA participants. 

## Abstract
We will offer a FlightDelay Insurance for Devcon SEA attendees. 

People can select their flight(s) and pay USDC 15 as a premium.
Via an oracle, the risk of the flight being late is calculated, which determines the maximum amount paid out in case of a delay.

After landing, the actual delay is determined by a second oracle call and in case of a delay, the payout is calculated
and immediately transferred to the customers wallet.
The core business process runs on our 
"[Generic Insurance Framework](https://github.com/etherisc/gif-next)" and does
not necessarily need any off-chain components, which are, however, provided for convenience. 

The Dapp is available via [https://flightdelay.app](https://flightdelay.app) (in production, premiums in USDC) or
via [https://flightdelay.integration.etherisc.com](https://flightdelay.integration.etherisc.com) (for testing, test-tokens available on request).

We will explore if other travel related insurance products can be implemented in a similar way, e.g. baggage loss,
theft, and others, depending on availability of reliable loss data. 

Claims are paid out from risk pools. Investors can provide liquidity for risk pools. Liquidity providers receive
those premiums which are not used to pay out claims. To become a liquidity provider, investors need to 
stake [DIP (Decentralized Insurance Protocol) tokens](https://etherscan.io/token/0xc719d010b63e5bbf2c0551872cd5316ed26acd83).

## Motivation & Rationale
Attendees get peace of mind when traveling to Devcon SEA. This will increase their well-being
and will also attract people who otherwise would abstain from participation.
Devcon SEA attendees will most likely be willing to use blockchain based insurance because it fits
best in their DeFi engagement. Payouts can be immediate and no paperwork is needed.
FlightDelay Insurance has been offered at Devcon SEA in Shanghai and got a lot of good feedback, 
it was the first insurance Dapp on Ethereum - time to bring it back!

## Implementation
FlightDelay has been implemented using our [Generic Insurance Framework](https://github.com/etherisc/gif-next).
It currently lives on Base L2 but can be deployed on any EVM chain.

## Operational Requirements & Ownership
Implementation and operation will be provided by Etherisc.

## Links & Additional Information
- https://etherisc.com
- https://github.com/etherisc/gif-next
- [Blog describing the Chainlink Integration of FlightDelay Oracles](https://blog.etherisc.com/etherisc-to-leverage-chainlink-oracles-for-decentralized-flight-insurance-product-9559b64d79c7)
