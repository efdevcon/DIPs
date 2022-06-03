---
DIP: 3
Title: Book your accommodation on-chain, 0% commissions paid to intermediaries.
Status: Accepted
Themes: Ticketing, Purchases & ID
Tags: Attendee Experience
Authors: Maksim Izmaylov <max@windingtree.com> & Luca Cosivi <luca@windingtree.com>
Resources Required: Local contacts and Promotion on all channels including website
Discussion: https://forum.devcon.org/t/flights-and-hotels-sourced-via-decentralized-marketplace/42
Created: 2020-07-29
---

## Summary

Winding Tree offers Devcon attendees to book their stay directly from accommodation providers with discount. 0% commissions are paid to intermediaries, a 1% treasury contribution is made that fuels the community chest for the development of the platform.

## Abstract

Winding Tree has been building decentralized solutions for the travel industry since 2017, currently focusing on building decentralized marketplaces, the first one being accommodation. In April 2022, we did our Proof of Concept during Devconnect, nearly 100 room nights were booked via a smart contract on the gnosis chain and paid with xDai. Since then we have been building our protocol [Videre](https://github.com/windingtree/videre) that improves the capabilities, efficiency and privacy of the marketplace. We will be testing the [Stays](https://github.com/windingtree/win-stays) implementation of the protocol during the upcoming events of ETHBarcelona, ETHcc Paris, and Dappcon Berlin. 

For Devcon we will find accommodation partners to join the marketplace and offer places to stay for Devcon attendees, which in turn will be able to book their stay via a smart contract on the [gnosis chain](https://poa.gitbook.io/xdai/) and wrap it as an [NFT](https://github.com/ethereum/EIPs/blob/master/EIPS/eip-721.md).

We are currently in a re-branding process, for now these are the key terms:
- Winding Tree: the organization behind the project
- Stays: the decentralized accommodation marketplace
- Videre: protocol for decentralized service exchange

## Motivation & Rationale

It would be great if Devcon attendees were able to book their accommodation without using intermediaries like Booking.com or Expedia that take on average 15-20% commissions on bookings. Additionally, the ability to use cryptocurrency to book and wrapping the booking as an NFT gives a lot of convenience and added benefits such as easy transferability of the booking. 

The use of blockchain to decentralized travel marketplaces is not novel and has been thought about and worked for years, however, the return of travel after the pandemic, the progress on L2s and sidechains, and the track record of some stablecoins like Dai have all made it possible to create a fully-functional decentralized accommodation marketplace.

## Implementation

As mentioned above we did a proof of concept during Devconnect in April 2022. Close to 20 individual travellers made a booking to stay at the DoubleTree Hilton in Amsterdam, booked nearly 100 room nights and generated North of $20.000 commission-free revenue for the accommodation provider. Overall the project was a success and went with minor bugs, however, it was only a proof of concept, now a lot of work is currently being done in implementing an over-arching protocol for the marketplace to increase security, efficiency and reliability. 

[Here](https://blockscout.com/xdai/mainnet/tx/0x5be54e824087011b3fc1d12803f8da515e5859eb302d86642e7b8a4076451451) is a link to the first hotel reservation made in Amsterdam.

## Operational Requirements & Ownership

### 1. What actions are required to implement the proposal at Devcon?

- Partner with accommodation providers and get them to commit inventory for the marketplace for the dates surrounding Devcon.
- Further implementation of our protocol and testing it at upcoming events; ETHBarcelona, ETHcc and Dappcon.
- Support from the Devcon team to promote the marketplace when it is ready in communication channels and link it within the website and other relevant materials for e.g. the ticket confirmation email.

### 2. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)

Maksim Izmaylov <max@windingtree.com> and Luca Cosivi <luca@windingtree.com>

### 3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))

We could give travelers the option to mint a POAP when completing a stay at a property. 

Also this project could be integrated with some DIPs:
- Travel Insurance [DIP-15](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-15.md)
- Off-setting travel [DIP-01](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-1.md) and [DIP-12](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-12.md)

## Links & Additional Information

- https://windingtree.com (outdated due to re-branding)
- https://www.youtube.com/c/WindingTree/videos
- https://github.com/windingtree
- https://blog.windingtree.com/
