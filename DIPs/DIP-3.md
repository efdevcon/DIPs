---
DIP: 3
Title: Flight and hotel bookings sourced from decentralized open-source travel marketplace
Status: Accepted
Themes: Ticketing, Purchases & ID
Tags: Attendee Experience
Authors: <Maksim Izmaylov> max@windingtree.com
Resources Required: Some Devcon dev time, connecting about hotels in Bogota
Discussion: https://forum.devcon.org/t/flights-and-hotels-sourced-via-decentralized-marketplace/42
Created: 2020-07-29
---

## Summary

Winding Tree offers Devcon attendees to book their flights and hotels directly from suppliers with discount. Winding Tree is 100% open-source and we aim to be as decentralized as it is possible.

## Abstract

Winding Tree is Ethereum-based decentralized B2B travel marketplace. We've also built a set of open source tools, including a [travel agency](https://glider.travel), which we could integrate directly into Devcon website. We'll also take on the responsibility of finding discounted hotel rates in Bogota, and also discounted flight tickets.

## Motivation & Rationale

It would be great if Devcon attendees were able to book their flight and hotel immediately after purchasing their Devcon ticket, and 10-20% cheaper than on any other travel booking website!

Hopefully no one would even notice that travel booking was facilitated by our smart contracts, that would be the greatest compliment. At the same time, curious minds will be able to learn about our identity solution for organizations.

## Implementation

We haven't done anything like that at other events, but our open source travel agency is live: https://glider.travel.

For this to work we'll have to spin up a separate Glider Aggregator module, which will be combining data streams from different hotels and airlines. It will expose a REST API that the Devcon website will be able to talk to.

Post-event, it would be amazing to learn about attendees' travel booking experience, if possible, but it is optional.

What's great is that we don't need to build anything from scratch, we'll just modify our existing Glider components.

## Operational Requirements & Ownership

### 1. What actions are required to implement the proposal at Devcon?

- we need to get a list of hotels Devcon team planned to target for room blocks
- Contingent on the Devcon team's approval (which will be based in part on *seeing* a [stellar UX and thorough customer service plan](https://github.com/efdevcon/DIPs/pull/33) in action), we would like to integrate our interface into the Devcon website

### 2. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)

Maksim Izmaylov <max@windingtree.com>

### 3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))

We're already working with solutions like Kleros and zkSync. There is an opportunity to integrate with CO2ken and feed our flight and accommodation data into their system to allow attendees to offset their carbon footprint.

## Links & Additional Information

- https://windingtree.com
- https://orgid.tech
- https://glider.travel
- https://github.com/windingtree
