---
DIP: 64
Title: Universal Checkout for Devcon[nect]
Status: Accepted
Themes: Ticketing, Payments
Tags: Software, Payments
Instances: Devconnect2025
Authors: dc@daimo.com
Resources Required: Tech support, Communication support
Discussion: https://forum.devcon.org/t/dip-64-universal-checkout-for-devcon-nect/5346
Created: 2025-02-14
---

## Abstract

Use an updated Pretix payments plugin for streamlined ticket purchases on Ethereum. This plugin uses Daimo Pay for any-chain checkout and Peanut Protocol for refunds.

## Rationale

### Background

Devcon[nect] uses Pretix for ticketing, along with the `pretix-eth-payment-plugin` to accept Ethereum payments.

This plugin has gone through many iterations, most recently using 3cities for Devcon 7; see [DIP-37](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-37.md). However, 3cities has been discontinued, so we need a new solution.

Meanwhile, Ethereum is rapidly improving. We have one-cent, one-second transactions. Stablecoins are a key instrument of global permissionless commerce. Friction between the growing set of apps, chains, and coins remains a challenge.

We've built Daimo Pay, an open source SDK to accept any chain on any coin. We would like to integrate Daimo Pay into Pretix to provide universal checkout for Devcon[nect].

Our goals for this proposal are twofold:

- Make it as easy as possible for attendees to buy a ticket. In our ideal world, everyone attending Devconnect this year would buy a ticket on Ethereum rather than fiat rails.
- Raise the bar for real-world Ethereum UX.

Finally, we want to provide a system that's simple and operationally robust for event organizers.

## Implementation

In the spirit of "rough consensus and running code," we've built a prototype Pretix integration. [See the code here.](https://github.com/daimo-eth/pretix-eth-payment-plugin/)

Visual demo: [Pretix x Daimo Pay Integration](https://www.loom.com/share/8c71876a9d5348f6a07a8d7e687368b6?sid=5b19c2a2-7502-4cf2-9afe-a865fd04e003)

The [Daimo Pay SDK and contracts](https://github.com/daimo-eth/paykit) are open source under BSD and GPLv3, respectively.

Pay uses Intent Addresses to accept payment from any chain, non-custodially, in a single transfer. This allows for a clean user experience that's also operationally clean for organizers. Funds arrive immediately in a single rollup address, no manual collecting and swapping required.

The underlying intent contracts ensure that any funds sent to a CREATE2 intent address will be swapped, bridged, and forwarded correctly to a specific destination. For bridging, the contracts rely on a combination of CCTP, Across and Axelar.

Pay supports all liquid tokens on major EVM bytecode-compatible rollups, plus Polygon. Users can also pay directly from custodial apps including Coinbase and Binance.

We want to offer a faster and more widely compatible on-chain payment flow than any past Devcon. Our mission is an Ethereum-native checkout that meets or exceeds the experience set by fiat checkouts like Apple Pay or Google Pay. Ethereum is a universal settlement system, so people should be able to pay from anywhere.

## Operational Requirements & Ownership

### Deliverables

Daimo will deliver:

- A fully integrated, open source Pretix plugin. [See our Github repo.](https://github.com/daimo-eth/pretix-eth-payment-plugin/)
- Engineering support for setup, validation, and testing
- Technical support before and during the event
- Built-in support for refunds using the open source [Peanut Protocol](https://docs.peanut.to/how-to-use-peanut-links/how-do-peanut-links-work)

### Cost

#### Free for users

The goal-state Ethereum checkout is precisely 1:1 for stablecoin payments.

For example, if an item costs $100, then you can pay in a stablecoin such as DAI, USDC or USDT on any rollup by transferring exactly $100.00. Swapping, bridging and associated gas costs are paid by the merchant. This is much less than the ~3% merchants pay on fiat checkout, illustrating Ethereum's superior properties as a substrate for commerce. Users get a clean, 1:1 experience.

Paying from L1 is not 1:1 --- the gas can be far higher, in some cases $5+. Thus, paying a $100 checkout might cost $105 DAI on L1.

The future of Ethereum is rollups. Daimo Pay supports a wide range of chains including L1 (and, optionally at Devcon's discretion, even Bitcoin and Solana), but the destination is always an Ethereum L2 and the system is optimized for goal-state UX when paying from L2.

#### Flat rate for Devcon

Daimo Pay charges 1% on payments. This covers integration, running fast relayers, and all swap/bridge/gas costs described above.

There will be no additional costs. Engineering and technical support are included for free.

### Timeline

We can have a production-ready plugin ready this month (February 2025). We have an end-to-end working prototype already. See repo above.

We're integrating our plugin with other events using Pretix for ticketing. This will ensure production test mileage ahead of the Devconnect ticket launch.

## Conclusion

If this collaboration is successful, we will see:

- A delightful and robust ticketing system for Devconnect
- A clean and operationally smooth payment solution for future Devcons
- Proven success, freeing future events to run entirely on-chain

### Links and additional information

Pretix website https://pretix.eu/about/en/

Previous payment plugin https://github.com/FreePay/pretix-eth-payment-plugin/tree/switch-to-3cities

Prototype Daimo Pay plugin https://github.com/daimo-eth/pretix-eth-payment-plugin

Daimo Pay https://pay.daimo.com

Daimo Pay SDK codebase https://github.com/daimo-eth/paykit

Intent Addresses https://hackmd.io/j80aijVIQCuaLZkQefoVoA
