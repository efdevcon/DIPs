---
DIP: 17
Title: Make Devcon6 Carbon Neutral
Status: Draft
Themes: Ticketing, Environmental Sustainability
Tags: Event production, Software
Authors: danceratopz <danceratopz@gmail.com>, haurog <haurog@pm.me>
Resources Required: Operational support, Communication support, (Tech support?)
Discussion: TBD
Requires: DIP-17
Created: 2022-06-22
---

## Summary of Proposal
This proposal aims to make Devcon6 carbon neutral. Event participants may  voluntarily contribute to this goal using tooling that estimates their carbon footprint and make a contribution by transferring funds on Polygon. 

This DIP also aspires to pave the way to making Devcon events carbon neutral in the future and can be considered as a stepping stone to [DIP-1](./DIP-1.md) (2020-07-20) and [DIP-12](./DIP-12.md) (2020-10-22).

## Abstract
There are two existing DIPs that aim to make Devcon events carbon neutral:
- [DIP-1](./DIP-1.md), Accepted: Aims to allow Devcon participants to offset their emissions associated with their event attendance by integrating a payment for this purpose as part of the ticketing process.
- [DIP-12](./DIP-12.md), Draft: Allow participants to vote which offset project should be supported by the offsetting funds collected by creation of a DAO.

DIP-1 has been accepted by the community but was not implemented in time for Devcon6 (as of time of writing, ticketing for Devcon6 is live). This DIP proposes to implement the goals outlined in DIP-1, but using external tooling. The tooling will be provided as public goods as part of disCarbon (disCarbon has no intention of collecting any fees from this process).

Devcon6 attendees will be informed about the possibility to make a contribution to offset their emissions and provided with a link to a website where they can enter a few details about their trip to Devcon (most importantly mode of transport and distance traveled). The site will estimate their carbon footprint and the cost associated with offsetting based on the price of on-chain carbon assets. Finally, the site will enable the attendee to submit a transaction on Polygon that swaps funds (MATIC, USDC, WETH) for the required amount of tokenized carbon credits, which are transferred to a multisig wallet under the Devcon Team's control. Attendees that participate will be issued with a POAP and could be given additional swag at Devcon6.

To ensure this process uses the highest quality carbon credits, the emissions will be offset using a project from ToucanProtocol's NCT (Nature Carbon Tonne) pool. The NCT pool represents different natural (forestry-based) carbon offset projects of high, but varying quality. The exact choice of project will be decided by a POAP-gated community vote on Snapshot shortly after the event.

Based upon community contributions, the Devcon Team will calculate the total amount of CO2 emissions for Devcon6 based on the total number of attendees and the average carbon emission determined from the community contributions collected by the frontend.

Following the community's decision on the carbon offset project via Snapshot vote, the Devcon Team will redeem the NCT pool tokens for the voted carbon offset project and retire them. Participants in the Snapshot vote will be additionally rewarded with a POAP celebrating the end of the process.

## Rationale

Please refer to [DIP-1](./DIP-1.md) for the rationale of making Devcon carbon neutral. The rationale of this DIP is to create an intermediary step in order to achieve this goal in time for Devcon6 and gain experience with the process. This will enable the community to provide feedback and allow a smoother implementation within the Devcon ticketing process for future events. The Snapshot vote on carbon offset project will also serve as a gauge of the community's interest for a potential DAO, as described in [DIP-12](./DIP-12.md).

## Implementation

**Organizational**

- Research best estimates of event carbon footprints and specifically for the venue at Devcon6.
- Ordering of green bracelets for carbon offset contributors.
- Design of two POAPs (for offset participation and snapshot vote participation).
- The Devcon team requires a multisig wallet on Polygon where funds (NCT) can be gathered.
- Devcon needs to source the remaining funds (that were not gathered by the community) in order to make the whole event carbon neutral.
- The Devcon should inform attendees per email about the goal and explain the process.

**Technical**

- Build a user-friendly front-end that estimates the user's carbon footprint associated with Devcon6.
- Implement a contract that allows the user to swap funds for NCT and transfer the NCT to a Devcon controlled multisig wallet in one transaction.
- Users can pay with MATIC, USDC, WETH on Polygon.

**Previous experience**

- This will be the first time that a carbon offset is performed for a Devcon event.
- We have a running MVP for flight emission estimation with on-chain offsetting at [flight.discarbon.earth](https://flight.discarbon.earth/).

**Post-event**

- Organize a Snapshot vote for the carbon offset project.
- Perform a single retirement transaction for the selected project.
- Issue a POAP to snapshot participants.
- Discuss learnings and how to best integrate the offset process in the ticketing process for future events.
- The data gathered at Devcon6 will help make more accurate predictions about the carbon footprint of future events.

## Operational Requirements & Ownership
1. *What actions are required to implement the proposal at Devcon?*
	- Distribute bracelets and/or swag at check-in. All other efforts are focused on the implementation of the UI and contracts and the coordination between disCarbon and the Devcon Team.
	- Mention the offset goal at the event

2. *Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)*
	- disCarbon (under advice from Toucan and the Devcon Team) will be responsible for the successful implementation of this proposal.
	- Devcon Team responsible for organization of an additional bracelet (or other swag).

3. *What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))*
	- Anyone who contributes to offsetting emissions will be receive a POAP.
	- Participants with the POAP/bracelet could get special swag, discounts, etc. from other projects, for example, Toucan.
	- Vote (for offset project) via Snapshot.

## Links & Additional Information

The organization referred to as CO2ken in previous DIPs is now knows as Toucan Protocol.

**Links:**
- More about disCarbon: [pitch.discarbon.earth](https://pitch.discarbon.earth/)
- disCarbon's on-chain flight offsetter: [flight.discarbon.earth](https://flight.discarbon.earth/)
- Toucan Protocol: [toucan.earth](https://toucan.earth)
- The Nature Carbon Tonne (NCT) Pool: [details on inclusion criteria](https://docs.toucan.earth/protocol/pool/pool-parties/nct-pool-party-report), [announcement](https://blog.toucan.earth/announcing-nct-nature-carbon-tonne/)