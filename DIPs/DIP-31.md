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

# Technical Specification of PCDpass Ticketing

We include a technical specification of the design of our ticketing system.

## Pretix Data Model

In order to understand how PCDpass integrates with Pretix, it is important to understand the Pretix data model. Under the hood, PCDpass reads event and ticketing information from Pretix, and converts that information into PCD-based tickets.

The data model of Pretix is as follows:

- `Instance`: Pretix can be self-hosted, or you can use it as a SASS. “Instance” refers to the entire Pretix application stack - web server, database, etc. required to run Pretix, whether it is run by the event host, or by Pretix itself.
- `Organizer`: An organizer is effectively the ‘account’ on Pretix which an event host is able to configure to suit their particular event ticketing needs.
- `Event`: an `Organizer` can have many events. `Event`s have a start date, end date, location, etc.
- `Product`: each `Event` has its own set of `Product`s that it can offer. `Product` refers to an individual purchasable item in the context of that particular `Event`.
    - `Product`s are highly configurable. They can have quotas, questions that must be answered at purchase-time, etc.
    - Examples of `Product`s would be: a GA ticket to the event, a Student ticket to the event, a ‘t-shirt’, a piece of memorabilia like a commemorative booklet.
- `Question`: each `Product` can have multiple `Question`s that can be answered by purchasers. `Question`s can be required or optional. Two important questions are the purchaser’s name and email.
- `Shop`: Each `Event` has a web-interface through which prospective event attendees can purchase one or more `Products` via a web interface. Attendees can pay at the `Shop`, as Pretix offers a Stripe integration. The `Shop` enforces `Event` configuration, such as quotas. It also ensures that attendees answers the required `Question`s for each `Product` sold in the `Shop`, and gives attendees the opportunity to answer optional `Question`s as well.
- `Order`: Each time a person purchases one or more `Product`s via the Pretix `Shop` for a particular `Event`, their entire purchase is represented by an `Order`. An `Order` can have multiple purchased `Product`s.
- `Position`: A purchased `Product` within an `Order` is represented by a `Position`, which can be thought of as an ‘instance of an `Product`’.

## Pretix Configuration

In order to offer tickets to events, a host must set up their `Organizer`, `Event`s and `Product`s for each event they want to sell tickets to. Pretix is quite flexible, and there are may correct ways to set up a Pretix `Organizer`.

However, in order for PCDpass to be able to issue PCD-based tickets to event attendees, there are a few specific configuration options that must be set up correctly.

The following configuration options must be set up for each `Event` and `Product` that an event host wants PCDpass to be able to issue PCD-based tickets for:

- `Event` configuration options:
    - Under ‘General’, in ‘Customer and attendee data’ section, in the ‘Attendee Data (once per personalized ticket)’ subsection, the ‘Ask for email addresses per ticket’ option must be set to ‘Ask and require input’. This is very important!
        
        ![Screenshot 2023-07-14 at 10.46.15 AM.png](%5B2023-09-08%5D%20Devconnect%20Ticketing%20Spec%20816e537506d341e09167ad23c69c0cbc/Screenshot_2023-07-14_at_10.46.15_AM.png)
        
    - Under ‘Tickets’, in the ‘Ticket Download’ section, in the ‘Download settings’ subsection, the ‘Allow users to download tickets’ checkbox must be **unchecked**. This is important, as in the case that it is unchecked, attendees would be able to have two different tickets - a Pretix-implemented ticket, and a PCDpass ticket, which would cause confusion for attendees.
        
        ![Screenshot 2023-07-14 at 10.49.55 AM.png](%5B2023-09-08%5D%20Devconnect%20Ticketing%20Spec%20816e537506d341e09167ad23c69c0cbc/Screenshot_2023-07-14_at_10.49.55_AM.png)
        
- `Product` configuration options:
    - Under ‘General’, the ‘Personalization’ option must be set to ‘Personalized Ticket’. This is important because it enforces that each `Position` has a corresponding email address, which is how PCDpass distinguishes between tickets internally.
        
        ![Screenshot 2023-07-14 at 10.52.41 AM.png](%5B2023-09-08%5D%20Devconnect%20Ticketing%20Spec%20816e537506d341e09167ad23c69c0cbc/Screenshot_2023-07-14_at_10.52.41_AM.png)
        

If Pretix is not set up with the above configuration options, PCDpass will not sync ticket information, and not issue PCD-based tickets to attendees of those events.

## PCDpass Pretix Sync Configuration

In order for PCDpass to sync event and ticket information from Pretix, we need to collect some configuration information for each `Organizer` (which can have many `Event`s and `Product`s).

PCDpass does not issue PCD-based tickets to attendees for `Event`s and `Product`s that have not been explicitly configured with the PCD Team.

- `organizer_url` - a unique identifier that refers to a collection of `Events` and configuration options controlled by the event host.
- `organizer_token` - an API key (maintained by Pretix per-organizer) that gives web API to PCDpass, enabling it to send web requests to Pretix to download information about `Organizer`s, `Event`s, `Products`s, `Order`s and `Position`s.
    - You can find instructions for how to get a token here: [https://docs.pretix.eu/en/latest/api/tokenauth.html#rest-tokenauth](https://docs.pretix.eu/en/latest/api/tokenauth.html#rest-tokenauth)
- In order to sync properly, an event organizer (human) must inform us of the `Events` and `Products` that PCDpass should be aware of. For each event, we need to know:
    - its `event_id`
    - its `Product`s that PCDpass should interpret to be tickets. Under the hood, a `Product` can also be referred to as an ‘Item’, and each `Product` has a unique `item_id`. Thus, in order for PCDpass to sync the correct tickets, for each event, we need to know the list of item ids (`active_item_ids`) - ids of `Product`s that should be interpreted as tickets.
- In order to allow users to be checked in, some PCDpass users need to be identified as `Superuser`s, which would grant them permission to check people in. At the time that an `Event` is being onboarded to the PCDpass product, we would ask the event host to provide a list of `Product`s that should be granted `Superuser` permissions. This means that all `Superuser`s have a ticket to the event on their PCDpass, and must be logged into the email address to which this `Superuser` ticket was issued in order to check in attendees to that event.

## PCDpass Pretix Two-Way Sync

In order to be able to issue PCD-based tickets to event attendees, PCDpass needs to be aware of the `Organizer`, `Event`s, and `Product`s that live in Pretix. Thus, we have developed a syncing mechanism that downloads state from Pretix and saves it to our own database in our own data format.

Internally, we refer to an individual ticket to an event as a `Pretix Ticket`. A more explicit definition of `Pretix Ticket` can be found in the description of the algorithm by which we sync an `Organizer` into PCDpass.

- A ticket can either be `Soft Deleted` or not.

The sync algorithm is as follows:

- For each `Organizer` that has been configured, and for each `Event` that has been specified as relevant, we download the `Event` metadata.
    - For each `Event`, we download its name, which I will refer to as its `event_name`.
    - For each `Product` within each `Event` that PCDpass understands to be a ticket `Product`, as identified by that `Event`'s `active_item_ids`, we sync that `Product`'s name, which I will refer to as its `item_name`.
- For each `Event`, we download all the `Order`s.
- For each `Order`, we extract the `Position`s.
- We record each `Position`  as a `Pretix Ticket` in our system.
- The sync algorithm is robust to `Order`s and `Position`s changing.
    - In the case that an `Order` containing the `Position` that caused us to record a `Pretix Ticket` is cancelled or deleted, we record the `Pretix Ticket` as `Soft Deleted`.
    - In the case that the `Position` that caused us to record a `Pretix Ticket` is cancelled or deleted, we record the `Pretix Ticket` as `Soft Deleted`.
    - In the case that we encounter one or more `Position`s that translated to a `Pretix Ticket` that is `Soft Deleted`, we make that `Pretix Ticket` **not** `Soft Deleted`.
- The sync algorithm is robust to to `Event`s and `Product`s being renamed.
- The sync algorithm is robust to `Event`s and `Product`s being deleted.
    - In the case that an `Event` or `Product` no longer exists, we cancel the sync so that existing `Pretix Ticket`s are not changed. Fixing this state requires manual intervention by the PCD Team.
- Each ticket's check-in status is synced between PCDpass and Pretix, such that the latest state is in sync between the two systems of record.

## PCDpass Ticket Issuance

- Once a user logs into PCDpass using their email, their PCDpass makes a web request to the PCDpass server (which is responsible for syncing ticket information from Pretix, and issuing PCD-based tickets), to ask for the PCD-based tickets that they have purchased. The server responds with a list of `Ticket PCD`s that are then added to the user’s PCDPass.
- A `Ticket PCD` is represented by an `RSATicketPCD` - which is a PCD that contains the information in its corresponding `Pretix Ticket`, signed by the PCDpass server’s RSA private key.
    - For production, we will use a different signature algorithm than RSA: `eddsa-bjj-poseidon-pcd`, which I will refer to as `EDDSA` elsewhere in this document. The reason we want to use `EDDSA` is that it is a SNARK-friendly signature algorithm, which enables users to performantly compute zero-knowledge statements about their `Ticket PCD`s.
- Each `Ticket PCD` contains the following information:
    - `email` - which corresponds to the answer to the ‘attendee email’ question entered by the attendee at purchase-time on the Pretix `Shop`.
    - `event_name` - corresponds to the name of the `Event` in Pretix.
    - `ticket_name` - corresponds to the name of the `Product` that was purchased (and thus added as a `Position` within some `Order` in Pretix) by the attendee.
    - `timestamp` - the timestamp at which the `Ticket PCD` was signed and issued by the PCDpass server to the user.
    - `ticket_id` - the unique identifier internal to PCDpass corresponding to the `Pretix Ticket` from which the `Ticket PCD` was generated.
- Given that `Order`s and `Position`s can be updated by event hosts in Pretix manually, which causes our internal representation of `Pretix Ticket`s to be updated, the information in a `Ticket PCD` can become out of date. Thus, the PCDpass client will periodically re-download the `Ticket PCD`s that have been issued to its user’s email address, in order to keep them up to date with the state in Pretix. This means that:
    - Whenever an event host changes an `Event` name that PCDpass is tracking via the Pretix web interface or API, the information in the user’s `Ticket PCD` will eventually reflect the correct `Event` name.
    - Similarly, whenever the name of a `Product` changes, it will eventually end up being reflected in the user’s `Ticket PCD`.

## PCDpass Ticket Checkin

To check into an event, a PCDpass user will need to have logged into PCDPass with the email they used to purchase their tickets, or the email that was entered on their behalf by someone else who purchased a ticket for them.

After logging in, as mentioned earlier, the PCDpass user will have access to all of their `Ticket PCD`s.

To checkin to an `Event`, the PCDpass user would have to navigate to the `Ticket PCD` in their PCDpass that corresponds to a ticket for that `Event`, and show that `Ticket PCD`'s QR code to the `Superuser` in charge of checking people into the event.

To start checking attendees into the `Event`, the `Superuser` must have signed into PCDpass using the email address to which a ticket with `Superuser` permissions was issued..

To check in an attendee, the `Superuser` would scan the attendee’s `Ticket PCD` QR code (which contains the `Ticket PCD`) using their logged-in PCDpass. This action sends a request to the PCDpass server to determine whether the `Ticket PCD` was actually issued, whether it was revoked, and whether it has already been used to check in.

Each `Ticket PCD` can only be used once to checkin to an `Event`.

## PCDpass Ticket Revocation

To revoke a ticket within PCDpass, an event host has several options:

- Mark the `Order` that contains the `Position` which that corresponds to the `Ticket PCD`that the event host wants to cancel as `Cancelled`. This option is not ideal because this would would also revoke all the other `Ticket PCD`s corresponding to the rest of the `Position`s in that order.
    - Another option is to delete the `Order`.
- Mark the `Position` corresponding to the `Ticket PCD` that the event host wants to cancel as  `Cancelled`.
    - Another option is to delete the `Position` from the order

All of the above options cause an existing `Pretix Ticket` in the PCDpass system to end up in the `Soft Deleted` state, which effectively revokes the ticket, and prevents it from being used to check in to physical events.