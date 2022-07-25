---
DIP: DIP-17
Title: Hosting DevCon agenda and document sharing on Swarm
Status: Draft
Themes: Freeform, Website, Agenda
Tags: Software, Event Operations, Attendee Experience
Authors: Costanza Gallo <costanza@ethswarm.org>
Resources Required: Operation support
Discussion: https://forum.devcon.org/t/hosting-the-agenda-and-the-documents-on-swarm/342
Created: 2022-06-19
---

## Summary of Proposal

__Hosting the agenda of DevCon on Swarm, and using Swarm for document sharing__

## Abstract
Swarm is a decentralized storage and communication system that was incubated by the Ethereum Foundation.

This DIP has one proposal:

To host the website with the agenda of DevCon on Swarm.

(Please note that initially in the forum we discussed two proposals, but upon further consideration we decide to split them into two for better clarity.)

## Motivation & Rationale
__Implementing this DIP would make DevCon’s website hosting decentralized and would make DevCon’s digital efforts aligned with its principles and values.__

## Implementation
- Has any part of this proposal been implemented at other events? If so, please describe how it went.
Not yet. We are planning to reach out to more events that happen before to implement this solution. This DIP will be updated accordingly. 
However, the solution has been implemented on other situations like blogposts: 
http://fairdatasociety.bzz.link/
https://fairdataprotocol.bzz.link/

More info: https://blog.fairdatasociety.org/posts/2021/12/fair-data-society-blog-is-now-hosted-on-swarm/

- Do you require feedback or data from attendees post-event?
No

## Operational Requirements & Ownership
__Please answer questions below:__
1. What actions are required to implement the proposal at Devcon?

We need to set up a Bee light or full node with all the necessary data pinned on them. Also we need to set up a gateway-proxy that is able to:
Provide a DNSLink (optional) so that it can serve regular DNS domains (e.g. devcon.ethereum.org) but still having the data in a format that is compatible with Swarm.

These features of the gateway-proxy (DNSLink) are not yet implemented, but they are on our roadmap, they are aligned with our organizational goals and are not fundamentally difficult problems so we are confident that by the devcon they can be delivered and ready for production.Please note that we already have delivered website hosting with our current implementation, so we are confident in the excellent delivery. 

This configuration should be load balanced and supplied with the appropriate postage stamps and chequebook balances. We have experience with how to do this with our gateway website and the underlying infrastructure. We are also in contact with the Ethereum Foundation currently discussing how to set up Swarm nodes for certain Remix IDE services.

2. Who will be responsible for the proposal to be implemented effectively? 
The Swarm Association will be responsible for the implementation of this proposa. The following people will work to bring the proposal to life:

Attila Gazsó will be the technical lead 
Črt Ahlin will be the advisor
Edina Lovas will be responsible for the onsite organizations
Antonio Gonzalo will be responsible for the touch&feel and the external communication of the project
Tamàs Hathàzi will research & explore potential collaboration with other DIPs
Costanza Gallo will act as the bridge between the DevCon team and the Swarm Association

3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))
The project could integrate Fair data society’s products such as Fairdrive (decentralised “dropbox”), Fairdrop (decentralised “wetransfer.com”), Dracula Markdown editor (for notes; can be saved to user’s Fairdrive), Fairphoto (decentralised gallery) or essentially any other dapp (NFT Generator) as solution is interoperable, while the underlying storage layer will be Swarm

## Links & Additional Information
__
[Swarm website](https://www.ethswarm.org/)

[Swarm whitepaper](https://www.ethswarm.org/swarm-whitepaper.pdf)

[Book of Swarm ](https://www.ethswarm.org/The-Book-of-Swarm.pdf)

[Bee Documentation](https://docs.ethswarm.org/docs/)__
