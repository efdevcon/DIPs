---
DIP: 42
Title: Backpocket, MPC for human connection using NFC social graphs
Status: Draft
Themes: Social, Purchases & ID, Art & Beauty
Tags: Event Production, Software
Authors: vivek@cursive.team, andrew@cursive.team, rachel@cursive.team
Instances: [Devcon7]
Resources Required: Communication support, Operational support
Discussion: https://forum.devcon.org/t/dip-42-backpocket-mpc-for-human-connection-with-nfc-social-graphs/3667
Created: 2024-07-09
---

## Summary of Proposal

Cursive, a PSE funded R&D lab, would like to give all Devcon attendees NFC wristbands to connect with each other and check into events by tapping. The social graph created will be ported into Backpocket, an app using MPC (multi-party computation) for human connection. This includes discovering common interests, querying your connections, and visualizing communities formed through the Devcon PWA.

<div align="center">
<img src="https://forum.devcon.org/uploads/default/optimized/2X/1/11ded8a2e04f941bd3370705cb19cbcd1079a756_2_600x600.png" alt="Social Graph Illustration" width="300" height="300">
</div>

## Abstract

This proposal has two components: giving every Devcon attendee an **NFC wristband**, alongside an open-source **MPC app for human connection** called Backpocket.

NFC wristbands would serve three main purposes for an attendee: (1) easily share socials with other attendees, (2) tap into talks to save your Devcon experience, and (3) build a user-owned social graph of people you met in-person. Each tap produces a digital signature in Zupass [POD](https://zupass.org/pod-developers) format, backed up to Zupass to enable developers to build ZK apps using [GPCs](https://github.com/proofcarryingdata/zupass/blob/main/examples/pod-gpc-example/src/gpcExample.ts#L88).

MPC apps that enable more intimate yet privacy preserving forms of human connection are a perfect fit for the NFC social graph. The three main apps would be (1) seeing common interests to find your tribe at Devcon, (2) visualizing how different tribes interact in the [Devcon PWA](https://app.devcon.org), and (3) sending out queries to friends or friends-of-friends like “Who is attending ETHBerlin 5 that wants to split a house?” and “Who is a ZK builder in SEA looking for a job?” for efficient and privacy-preserving discoverability.

We would also like to work with the Devcon team, PSE, 0xPARC, and other interested orgs to incorporate more experimental MPC features into Backpocket. Some ideas include: importing more useful personal data using PSE funded projects like [zk-email](https://prove.email/) and [TLSNotary](https://tlsnotary.org/), [settling debts](https://hackmd.io/@gridlock/H10J04ySC) in a community with full privacy, MPC-ML group recommendations, and more.

## Motivation & Rationale

We hope combining NFC & MPC technologies will enable **Devcon to be the source of more fulfilling relationships and communities**. This includes better connection during the event (easily sharing socials, documenting your event experience, learning about overlapping interests) as well as post-event (seeing when people will be at future conferences, finding connections looking for jobs, finding housing/sublets while traveling).

The cryptography involved ensures the social data is private to the attendees + interoperable with other platforms like Zupass for developer friendliness. This can all be done off-chain, avoiding wallets and gas fees, while maintaining important properties like verifiability and ownership. And using MPC for queries ensures full user consent — no information is revealed unless both parties are comfortable sharing and there’s a valid match.

Finally, we hope to expose more developers and enthusiasts to the cutting edge of NFC and MPC technology to inspire builders and generate new app ideas. Past deployments have been an immediate hit, as many folks didn’t know NFC was so smooth, or that it was possible to run advanced techniques like MPC and FHE on mobile phones!

## Past work

### NFC activations

We have done 5 major NFC activations incorporating signed data and ZK: [ZuStamps](https://cursive.team/blog/zustamps) at Zuzalu, [Sigmoji](https://github.com/cursive-team/nfctap.xyz) at FtC Berlin, [Jubmoji](https://github.com/cursive-team/jubmoji.quest) at Devconnect 23, [BUIDLQuest](https://www.cursive.team/blog/denver-retrospective) at ETHDenver 24, and [ZK11-NFC](https://www.cursive.team/blog/zk-summit) at ZKSummit.

The largest activation was at ETHDenver, where we gave out 12,000 NFC chips to attendees who produced 50,000 taps and 3,000 ZKP quests completed! So we’ve built experience with large operational + technical deployments and feel confident in handling the scale of Devcon. We also increased engagement with a leaderboard + prize store gated by ZKPs, which we could replicate if there’s interest from the Devcon team:

|                                                                                 Social tab                                                                                 |                                                                                 Quest tab                                                                                  |                                                                                 Store tab                                                                                  |
| :------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| <img src="https://forum.devcon.org/uploads/default/optimized/2X/1/15c4c55126695bf3b0d32f6a750340235fd38dd8_2_460x1000.jpeg" alt="Denver Image 1" width="230" height="500"> | <img src="https://forum.devcon.org/uploads/default/optimized/2X/4/4035e7dc8357583eba2d4ca2fc6f791f3f411778_2_460x1000.jpeg" alt="Denver Image 2" width="230" height="500"> | <img src="https://forum.devcon.org/uploads/default/optimized/2X/1/1d8f4b3f9c81fe30272e31c4ea52d3b72ec663f0_2_460x1000.jpeg" alt="Denver Image 3" width="230" height="500"> |

The most technically advanced activation was ZK11-NFC, where we deployed an icebreaker that revealed common contacts/talks with MPC (further described below), ZK proofs of event engagement for Twitter bragging, and a Spotify Wrapped-like summary of your event experience using Nova folding proofs:

|                                                                        Profile, with overlap                                                                         |                                                                      Twitter proof                                                                       |                                                                      Folded summary                                                                      |
| :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------: |
| <img src="https://forum.devcon.org/uploads/default/optimized/2X/5/51ca371fdd6a903fc2fbcd2f3bb0425077eee690_2_562x1000.png" alt="ZKSummit1" width="281" height="500"> | <img src="https://forum.devcon.org/uploads/default/original/2X/e/ebaca79709539295f721fc95493978a1d83d8ebd.png" alt="ZKSummit2" width="293" height="500"> | <img src="https://forum.devcon.org/uploads/default/original/2X/8/8afb254eade812abf738a3162462d482bf94d847.png" alt="ZKSummit3" width="304" height="500"> |

Each of our activations has included a generative art representation of your taps, as a commemorative art piece for attendees to mint as an NFT. We can also include this if there’s interest from the Devcon team:

|                              Generative stamp collection by [Stefano Contiero](https://stefanocontiero.com/)                               |                                                   Generative art flower garden by Vivek                                                    |
| :----------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------: |
| <img src="https://forum.devcon.org/uploads/default/original/2X/f/f8be71a706ef4390c7b49bf93f058a4f8cedc66c.jpeg" width="231" height="500"/> | <img src="https://forum.devcon.org/uploads/default/original/2X/0/0467573be89c651f46beedac258d9eff1478e996.jpeg" width="231" height="500"/> |

### MPC research

We have been doing MPC work since September 2023, working with Janmajaya of Gauss Labs and Enrico of PSE to build out a production private set intersection using MP-FHE (multi party fully homomorphic encryption).

<div align="center">
 <img src="https://forum.devcon.org/uploads/default/original/2X/9/9ea90316e90ec5ef5f7b09483f8ef95a5fbac2fe.png" width="690" height="388"/>
</div>

We deployed this tech to 500 users at ZK11, to enable conference attendees to connect over mutual contacts and talks. It worked very smoothly on poor internet and a range of different mobile devices, and was an instant hit with technical folks who didn’t know MPC/FHE could be so efficient on a mobile device.

We extended this technique to do a larger range of comparisons at the [Signature Singularity Residency](https://www.notion.so/Cursive-DIP-v2-d7c61d76006a4207b98dbb6395475c08?pvs=21) in a Backpocket MVP. This included comparing over self-attested interests/travel plans + verified past events from your email; you can find a demo [here](https://cursive.team/bp-demo). We’ve been exploring more advanced MPC techniques over the past few months using toolkits like MP-SPDZ, aiming to ship some PoCs in time for a presentation at EDCON.

## Devcon implementation

### Core NFC work

1. NFC chips for all attendees
   - We will order wristbands for all attendees to wear, either NTAG424 (cheaper, better tap UX, not a wallet) or SLJ52s (more expensive, worse tap UX, but a full self-custody wallet)
   - We may also give out phone stickers, rings, and necklaces as alternatives or prizes if users would prefer them
   - Ensure the chips have value after the event + can be reused, so we don’t create a ton of waste
2. NFC chips or QR codes for checking into events
   - Ensure attendees can collect proofs of attendance across Devcon events, either from NFC chips outside the venue
   - Use it to determine your web3 interests to share upon tapping other people
   - Can help Devcon team understand which events are most attended, have the most diverse audience, attract certain nationalities more than others, etc.
3. Signature generation and storage
   - We will use Zupass’s [POD](https://www.notion.so/POD-GPC-Development-6547d2e60c184ad0984f933672246e0b?pvs=21) toolkit to generate signatures for all taps at the event, encoding user information in a JSON
   - By default, we will store an encrypted version of their social graph that they unlock with FaceID/TouchID
   - If users connect their Zupass, they can back up all PODs to their account which can enable them to use apps built by Zupass developers using GPCs

### Core MPC work

1. Overlap icebreaker: seeing common contacts, interests, coffee chat availability
   - Use our existing private set intersection toolkit, expand to larger sets of overlap
   - Ensure users can easily self-attest to personal info or import from another source
   - Ensure users have full control over what they share, potentially gating information by # of taps you’ve shared (1 tap = Twitter, 3 taps = coffee chats, 5 taps = future travel overlap, etc.)
2. Tribe social graph visualization in Devcon PWA
   - Work with Devcon team to visualize how different tribes are interacting and meeting each other in the Devcon PWA
   - Build leaderboards and competitions to engage more deeply
   - Ensure user privacy is maintained while still giving attendees/organizers meaningful insight into how Devcon positively impacts the Ethereum social graph
   - Feature also requested by Edge City, will be tested there
3. Querying your social graph during and after the event
   - Building out a robust UX to send/receive queries from your NFC social graph
   - Experimenting with natural language / ML based queries to make UX as smooth as possible
   - Ensure maintenance after the event so this can be a utility post Devcon

### Potential experiments

Outside of the core offerings, we would like Backpocket to be a testing ground for other teams looking to build advanced cryptography features, especially with MPC. We will closely assess if features will be cohesive with the rest of the Backpocket experience before including them.

1. Importing data with zk-email and TLSNotary
   - We’ve already built an E2E flow using email data and zk-email toolkits to prove attendance to a number of past web3 events
   - Will improve UX to ensure users can import single emails instead of giving access to entire inbox
   - Will work with TLSNotary + ZKP2P team during July to build out
2. [Settling debts](https://hackmd.io/@gridlock/H10J04ySC) within Devcon community / individual tribe with full privacy
   - Experimental research from Enrico of PSE to cancel out cycles of debts within a community to minimize the amount of transactions/liquidity required
   - Use MPC to ensure full privacy of transactions
   - Can start with something low stakes like clearing out “coffee debts”
3. MPC-ML recommendations for pairs or groups of people
   - Based on group interests, recommend discussion topics or restaurants for a group to use
   - PoC of “local algorithms” instead of “Big Algorithms” governed by big tech companies

## Operational Requirements & Ownership

1. What actions are required to implement the proposal at Devcon(nect)?
   - Order NFC wristbands for all attendees and set up wristbands to issue signatures in POD format
   - Build app for contact sharing, shared interests icebreaker with MPC, and finding social connection and community from one’s Devcon social graph
   - Distribute wristbands at Devcon, work with Devcon team to communicate this activation to attendees
2. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)
   - Cursive will be responsible for procuring NFC wristbands and building the contact sharing and MPC-based applications on top
   - Cursive will work with the Devcon team for on-the-ground logistics at least 1 week before the event to set up wristbands and communicate with attendees
   - Cursive will test MVPs of this experience extensively at ZKSummit12 (10/08) and Edge City Lanna (10/10-11/10) to ensure the Devcon experience goes smoothly
3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))
   - [Zupass](https://github.com/proofcarryingdata/zupass) — One major component of this concept is allowing user data to be custodied across data stores of their choice. An integration with Zupass would allow attendees to back up their data using Zupass in the form of PODs (Provable Object Data). This would also help developers build cool ZK apps using GPCs (General Purpose Circuits) on in-person data!
   - [zk-email](https://www.notion.so/Public-documents-d62d0a00e795408eaab3d702d544d340?pvs=21) — NFC wristbands can be used for payments, where an attendee could purchase food by simply tapping their wristband. Here, zk-email combined with account abstraction wallets would ensure that all purchases above $10 would require 2FA email approval. In addition, zk-email could also be used to mint NFTs proving one had attended Devcon, or even a specific talk.
   - [TLSNotary](http://tlsnotary.org) — Can be used to verifiably export valuable personal data from existing silos in a privacy preserving manner. This would enable richer social matches to be formed based on say, two attendees proving to each other they are fans of the same musical artist.

## Links & Additional Information

- Cursive blog: [https://cursive.team/blog](https://cursive.team/blog)
- Cursive GitHub, all work is open-source: [https://github.com/cursive-team](https://github.com/cursive-team)
- Previous DIP: [JubJub](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-32.md)
- Backpocket MVP demo: [https://cursive.team/bp-demo](https://cursive.team/bp-demo)
