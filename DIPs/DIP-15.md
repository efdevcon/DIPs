---
DIP: 15
Title: Travel insurance
Status: Draft
Themes: Travel, Safety
Tags: DeFi, Insurance, Peer2Peer
Authors: christoph@etherisc.com
Resources Required: CustomerSupportBooth at DevConVI
Discussion: https://forum.devcon.org/t/dip-15-travel-insurance/176
Created: 2020-11-27
---

## Summary of Proposal

A lot of people will travel to DevConVI. This will impose a number of risks to these people:
flight Delays, baggage loss, theft, and others. We will build a decentralized travel insurance for DevConVI participants. 

## Abstract
We will offer a FlightDelay Insurance for DevconVI attendees. 

After registering, people select their flight(s) and pay a small premium (about USD 10$-25$) in some stablecoin,
e.g. USDC, DAI etc. 
Via an oracle, the risk of the flight being late is calculated. 
After landing, the actual delay is determined by a second oracle call and in case of a delay, the payout is calculated
and immediately transferred to the customers wallet.
We are currently talking to [Team WindingTree](https://windingtree.com) to integrate the insurance in windingtree's travel agency solution.
The oracle is provided by [Chainlink](https://chain.link). The core business process runs on our 
"[Generic Insurance Framework](https://github.com/etherisc/GIF)" and does
not necessarily need any off-chain components, which are, however, provided for convenience. 

We will explore if other travel related insurance products can be implemented in a similar way, e.g. baggage loss,
theft, and others, depending on availability of reliable loss data. 

Claims are paid out from risk pools. Investors can provide liquidity for risk pools. Liquidity providers receive
those premiums which are not used to pay out claims. To become a liquidity provider, investors need to 
stake [DIP (Decentralized Insurance Protocol) tokens](https://etherscan.io/token/0xc719d010b63e5bbf2c0551872cd5316ed26acd83).

The economic model together with the staking model will be tested in Q1/2021.   

## Motivation & Rationale
Attendees get peace of mind when travelling to DevConVI. This will increase their well-being
and will also attract people who otherwise would abstain from participation.
DevConVI attendees will most likely be willing to use blockchain based insurance because it fits
best in their DeFi engagement. Payouts can be immediate and no paperwork is needed.
While we have offered FlightDelay Insurance at DevConII in Shanghai and got a lot of good feedback, 
we believe that a full featured travel insurance would be even more attractive for Devcon VI attendees.
The connection with WindingTree will further improve the user experience because travellers can buy 
flight tickets, hotel and other services and pay in a single transaction. 

## Implementation
FlightDelay Insurance has been live at DevConII and DevConIII. It will be implemented using our
[Generic Insurance Framework](https://github.com/etherisc/GIF) and it will live on the Ethereum mainnet.

## Operational Requirements & Ownership
Implementation and operation will be provided by Etherisc.
We are talking with [DIP-3 author WindingTree](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-3.md) to integrate in their travel agency.

## Links & Additional Information
- https://etherisc.com
- https://github.com/etherisc/GIF
- https://windingtree.com
- https://github.com/windingtree
- https://chain.link
- [Blog describing the Chainlink Integration of FlightDelay Oracles](https://blog.etherisc.com/etherisc-to-leverage-chainlink-oracles-for-decentralized-flight-insurance-product-9559b64d79c7)
