---
DIP: 31
Title: PCD-based ticketing for Co-working space and other events at Devconnect
Status: Draft
Themes: Ticketing, Social, Purchases & ID, Community Involvement,
Tags: Event Production, Software
Authors: ivan@0xparc.org
Resources Required: Operations support
Discussion: https://forum.devcon.org/t/dip-regarding-pcd-based-ticketing-for-devconnect/3201
Created: 2023-8-08
---

## Summary of Proposal

We propose to issue Devconnect co-working space tickets as PCDs, which would enable attendees to plug into a a structured network of ZKP-friendly data. If tickets are issued as proof-carrying data, Devconnect builders and community members will be generate cryptographic proofs about their activity at Devconnect that can be ported across other community platforms—event host websites, Telegram channels, and more.

## Abstract

Currently, tickets are sold, distributed, and checked at the door using Pretix. We propose modifying the ticket distribution and checkin part of the process to make use of PCDPass rather than Pretix. PCDPass is a flexible, open-source, E2E encrypted storage mechanism for ZK-friendly data (PCDs)—data that you can make cryptographic proofs about. After purchasing a co-working space ticket via Pretix, an attendee would be able to access their cryptographic 'PCD' ticket via PCDPass, and event staff would be able to check attendees in at the door via PCDPass. By issuing tickets as PCDs, event attendees would be empowered to use their tickets later on to access additional services, and builders at events would be able to build applications or community infrastructure gated to event attendees.

## Motivation & Rationale

#### What is PCDPass, and how are PCDs useful?

PCDPass is a cryptographic secret manager that lets users store, generate, verify, and share PCDs, currently implemented as a web application hosted on [pcdpass.xyz](pcdpass.xyz).

PCD stands for 'proof carrying data', and refers to a category of data that is 'proof-carrying', or 'self-evident'. The core idea of PCD is that it is information that does not need any external context to be able to be verified by anybody to be true. The way PCDs can be independently verified to be true is by using cryptography, typically either a digital signature or zero knowledge proof. One example of a PCD is an ECDSA-signed Ethereum transaction. Another example of a PCD - and this is what we are proposing to implement - would be a cryptographic signature of some data representing a ticket to the co-working space of Devconnect. A 'ticket PCD'.

PCDPass is a user's window into a world of applications and experiences that produce and consume PCDs. One way to 'consume' a Devconnect co-working space ticket PCD is to get 'checked into' an event (like the co-working space) by event staff. Once checked in, attendees wouldn't lose access to their PCD - it remains in their PCDPass, ready to be 'consumed' in other ways. As a result, Devconnect co-working space attendees would be empowered to use their ticket later on however they want.

Another way to 'consume' a co-working space ticket PCD to gate access to unofficial websites to _just_ Devconnect attendees. Another thing someone could do is develop their own event check-in flow, which could be used at another in-person event restricted to just attendees of Devconnect. Someone else could develop an on-chain smart contract that consumes these Devconnect ticket PCDs and issues commemorative NFTs to event attendees.

#### Why did we create PCDPass and PCDs?

We distilled the concept of PCD from our experience building and supporting the development of many different cryptography primitives and cryptography-enabled applications. The R&D process made it clear that we are missing many abstractions and infrastructure that would be necessary to bring our cryptography applications to production.

Although PCDPass doesn't (yet) make use of blockchain, it is nevertheless a 'crypto' project.

At the most basic level, it is uniquely enabled by modern cryptography in the same way that blockchain is enabled by modern cryptography.

At a more abstract level, the reason blockchain resonates with people in the crypto community isn't specifically the particular implementation details of 'the blockchain', but rather the philosophy and values that blockchain propagates. In particular, we believe that the values of open-source, decentralization, self-sovereignty, and permissionlessness (among many others) are at the heart of the crypto community.

PCDPass aims to uphold these values by being an open-source project that gives people ownership over their data so that they can use the data in precisely the ways they want. Furthermore, the PCD Team is developing not just PCDPass and other software abstractions, but also an ecosystem of developers who build applications that plug into the PCD abstraction. These applications, by virtue of being developed on top of the PCD abstraction, further propagate these values by empowering users in a way that respects their sovereignty and privacy.

## Implementation

> - Has any part of this proposal been implemented at other events? If so, please describe how it went.

We have deployed PCDPass (known at the time as Zupass) at Zuzalu. At Zuzalu, Zupass was the primary method of digital and physical authentication. It was used daily to access gated physical event spaces and venues via a QR code and also to authenticate into online digital experiences via an OAuth-like integration flow. For example, event participants could login to the official Zuzalu website using their ticket held in their Zupass, much like one is able to login to the Devcon forum using their Google account. Once logged in, participants were granted access to a private portion of the website - the Zuzalu schedule, where they could view and edit Zuzalu sub-events. 100% of all Zuzalu residents (~200 users) and Zuzalu visitors (~600 users) onboarded onto Zupass, and used it daily for ZK-based digital and physical authentication over the course of two months.

We designed Zupass with ecosystem development in mind, and seeded/facilitated other identity and community experiments on top of the infrastructure that we built. Here’s a list of some of the projects that emerged on top of/alongside Zupass:

- Zupoll (https://zupoll.org/ 4) - an anonymous voting platform restricted to just Zuzalu participants, where residents could create straw polls, and organizers could create referendums. One notable use-case for these polls was as a way to measure the community’s sentiment towards Zuzalu and its programming during weekly in-person “town halls.” These official community referendums regularly drew 30%+ voter turnout across all Zuzalu residents.
- Zucast (https://zuca.st/ 2) - an anonymous farcaster-like forum. This was built in a week during Zuzalu by a community member that wanted to experiment with the affordances of anonymous social media. Zuzalu community members made nearly 700 posts over 3 weeks.
- Rubber Ducky - a telegram bot built and maintained by a community member that used GPT-4 to answer questions about Zuzalu. It used Zupass anonymous login to restrict its usage to just Zuzalu participants.
- PCD Stamps - a NFC-based PCD distribution mechanism that allowed community members to distribute POAP-type attestations to attendees of Zuzalu.

> - Do you require feedback or data from attendees post-event?

Yes. We can collect additional feedback using the PCDPass web application as well.

## Operational Requirements & Ownership

> 1. What actions are required to implement the proposal at Devcon?

- Develop an integration between Pretix and PCDPass so that tickets purchased on Pretix can be issued as PCDs via PCDPass.
- Develop a ticket checkin flow so that event staff can check people in on-site.
- Test the end-to-end ticketing flow, from purchase to issuance to check-in to ensure it meets the standards of Devconnect event organizers.

2. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)

The PCD Team of 0xPARC is responsible for developing, testing, and deploying this project. The Devconnect organizing team is responsible for implementing the operational changes both at event-sale time and on-site at the event to make use of PCDPass.

3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))

## Links & Additional Information

- [PCD Team Website](https://pcd.team)
- [Zupass Repo](https://github.com/proofcarryingdata/zupass)