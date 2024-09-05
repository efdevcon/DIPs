---
DIP: 47
Title: FROGCRYPTO
Status: Draft
Themes: Social, Art, Freeform
Instances: [Devcon7]
Tags: Event Production, Other
Authors:  Small Brain (smallbraindev@gmail.com)
Discussion: [https://forum.devcon.org/t/dip-36-games-of-capture-and-escape/3447](https://forum.devcon.org/t/dip-46-pod-based-ticketing-at-devcon/3850](https://forum.devcon.org/t/dip-47-frogcrypto-2/3866)
Created: 2024-8-20
---

# Summary of Proposal

Frogcrypto introduces Devcon attendees to programmable cryptography through cute cryptographic frogs.

Building on the success of FROGCRYPTO at Devconnect 2023, attendees this year will collect frog [PODs](https://forum.devcon.org/t/dip-46-pod-based-ticketing-at-devcon/3850) via physical devices and Zupass-integrated webapps. These frogs are ZK-verifiable on Ethereum, creating a network of cryptographic data with rich possibilities for developers. 

# Abstract

Last year, 3000+ Devconnect attendees collected over 1 million Frog PCDs via the first FROGCRYPTO experience. Developers built MPC Frog Battlers, frog ZKPs in various ZK languages, Frog ZK Auth for Telegram, and more on top.

The goal of FROGCRYPTO 2.0 is to introduce Devcon 2024's attendees to Programmable Cryptography through a simple, memorable experience that creates even more developer surface area.

The core loop: collect frogs to redeem swag and unlock ZK- and Ethereum-enabled experiences.

As an upgrade from last year, and similarly to several other community-led Devcon projects, frogs are internally represented as [PODs](https://forum.devcon.org/t/dip-46-pod-based-ticketing-at-devcon/3850). PODs are a format for cryptographic data that is ZK-verifiable on Ethereum. Attendees can collect FROGCRYPTO PODs in three ways:

1. From each other (by tapping wearables)
2. Through sites that integrate with Zupass (similar experience as the FROGCRYPTO tab at Devconnect)
3. From physical CYBERFROGs throughout the venue (frog-shaped hardware placed throughout the venue).

These collection methods enable (1) a fun, scavenger-hunt like engagement for the conference and (2) a rich network of cryptographic data, including a social graph of attendees, location information about hotspots in the venue, etc. that devs can build on top of.

# Motivation & Rationale

How will it enhance attendee experience?

It’ll be cute, fun, memorable… and help attendees explore new cryptography. At Devconnect last year:

- 3000+ attendees (out of a total of 5000 Zupass users) collected frogs
- ~500 attendees earned the iconic [Frog Bucket Hat](https://x.com/0xMilica/status/1725476140171547002)
- 1.2 million frogs were collected in the form of ZK-provable data
- Even over the course of a single week, developers built multiple projects on top of frogs, including
    - [BattleFrogz](https://github.com/omurovec/battlefrogz)
    - [ZuFrog](https://t.me/zufrog_bot)
    - [ZK-gated FROGCRYPTO Telegram](https://github.com/proofcarryingdata/zupass/blob/main/packages/pcd/zk-eddsa-frog-pcd/src/ZKEdDSAFrogPCD.ts)
    - [ZKPs for FROGCRYPTO in Noir](https://x.com/TomFrench_eth/status/1725610669876076734)

This year, we’ll build on the success of last year by:

- Adding more cuteness (with necklaces, more frog-based swag, and bringing back the hats)
- Having a dedicated area to be a community hangout for people interested in this tech
- Creating more interesting data, including a social graph of attendees (when users collect frogs from each other) and location data (when users collect frogs around the venue).
	- This year, players will be able to give a frog "contact card" to other attendees!

How is this solution better than a non-blockchain experience & how will it introduce attendees to a new use case?

Frogs serve as collectible cryptographic data that are ZK-verifiable on Ethereum, offering authenticity, transparency, and interoperability--without the initial friction of onboarding onto the blockchain. FROGCRYPTO's frogs this year will leverage the [POD standard](https://forum.devcon.org/t/dip-46-pod-based-ticketing-at-devcon/3850); each attendees' frogs are private, soulbound (i.e. non-transferrable by default), and require no gas or interaction with a wallet though they are still verifiable on Ethereum.

Specifically, the cryptographic data attached to frogs naturally gives them what can be thought of as a perfect, open, API–allowing developers to build any experiences on top of frogs they desire without asking the frog issuers for permission.

The goal is to create a playground of ZK-provable and Ethereum-portable data for developers to build on, both during the conference and in the future. We hope that this prompts conference attendees to ask the question… **What if more (or even all) data on the internet was structured this way?** 

A nice bonus is that this encourages attendees to interact with various cryptographic capabilities that have been advanced by the Ethereum ecosystem, including zero-knowledge proofs (which can be made over frogs, since they are signed with ZK friendly key pairs) and fully homomorphic encryption (which we'll be leveraging to create an experimental game on top of the issued frogs) in new ways.

# Implementation

There would be both digital and physical touchpoints for FROGCRYPTO2 across the venue.

**Part #1: Frog Booth: attendees acquire the tool for scavenger hunt**
- a visible booth the attendees walk up to after the registration and acquire 
	the tools needed for the scavenger hunt (i.e. instructions and physical items)
- staffed from our side throughout the entire duration of the event

**Part #2: Scavenger hunt throughout the venue**
- digital and physical scavenger hunt in different areas of the venue 
- physical component includes CYBERFROGs posted up around the venue
-  digital component includes a website or Zupass-integrated application that users can use to collect frogs. we will work with the Zupass team to ensure a smooth integration, like FROGCRYPTO last year

**Part #3: Frog community hub: FHE playground and giveaway store**
- visible community hub, preferably located in a high-traffic area (i.e. around a central artpiece or landmark)
- attendees observe and engage in games that demonstrate state of the art FHE 
	mechanics - for example, an FHE "frog arena" game that you can play at the hub on machines provided by us
- store for receiving themed rewards for collecting frogs: attendees present their scavenger hunt score and receive fun swag in return. this is similar in spirit to the iconic Frog Bucket Hats from Devconnect last year, that drove substantial excitement and attention
- hub staffed from our side throughout the entire duration of the event
	
# Operational Requirements & Ownership

1. What actions are required to implement the proposal at Devcon?
Coordination with Devcon's production re. furniture, electronics, set up / tear down of:
 - Frog Community Hub (location for Frog Shop and FHE game)
 - Frog Booth (near entrance/registration - for participants to receive instructions and hardware. all materials and staff would be provided by us, we just need a location to put the booth.)
 - coordinating the placement of CYBERFROGs around the venue.

2. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)
smallbraindev, izabela

# Links & Additional Information

- Links relating to last year's FROGCRYPTO activation:

  - FROGCRYPTO testimonials from journalists and writers who visited Devconnect last year:
  -  [Project Glitch](https://www.projectglitch.xyz/p/exploring-the-crypto-swamp-istanbul) writeup
		- Footnote from [Venkatesh Rao](https://studio.ribbonfarm.com/p/towards-a-metaphysics-of-worlds): "if you meet someone technical who went to DevConnect last year, ask them to show you Zupass, in particular the Frogcrypto trading card game. It gives you a hint of what sorts of things are possible with the technology. Initially I dismissed it as an annoying gimmicky thing, but once I got what was going on under the hood, all sorts of fascinating possibilities and use-cases began to suggest themselves."
- Just over the course of a single week, developers built multiple projects on top of frogs, including
    - [BattleFrogz](https://github.com/omurovec/battlefrogz)
    - [ZuFrog](https://t.me/zufrog_bot)
    - [ZK-gated FROGCRYPTO Telegram](https://github.com/proofcarryingdata/zupass/blob/main/packages/pcd/zk-eddsa-frog-pcd/src/ZKEdDSAFrogPCD.ts)
	   - [ZKPs for FROGCRYPTO in Noir](https://x.com/TomFrench_eth/status/1725610669876076734)
	   
- Community feedback and engagement with last year's FROGCRYPTO activation:
   - [No signs of stopping](https://x.com/eth_call/status/1726958709237260457)
   - [Volunteer frogs](https://x.com/kvbik/status/1725811138326081621)
   - [Vitalik With Hat](https://x.com/yAuditDAO/status/1725632324165923121)
   - [Easter egg!](https://x.com/morganjweaver/status/1725800663668470183)
   - [Noir Frogs](https://x.com/Zac_Aztec/status/1725872925088108872)
   - [What's happening at Devconnect?](https://x.com/sunbh_eth/status/1725571587057795079)
   - [Barry Greenhat](https://x.com/VeljkoVranic/status/1725479350672236929) 
   - [Spotted in the wild](https://x.com/0xMilica/status/1725161754206908801)
   - [frogcrypto is the future](https://x.com/0xz80/status/1725167905166287026)
   - [frog proofs, not fraud proofs](https://x.com/austingriffith/status/1725201077161902458)
	   
FROGCRYPTO 2.0 will be built on the POD ZK data standard that is also referenced in a [DIP submitted by the Zupass team](https://forum.devcon.org/t/dip-46-pod-based-ticketing-at-devcon/3850). We will work closely with the Zupass team to ensure a smooth end-to-end integration.
