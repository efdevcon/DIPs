---
DIP: 38
Title: A sufficiently decentralized collaboration stack for Devcon 7
Status: Draft
Themes: Collaboration
Tags: Collaboration
Instances: Devcon 7
Authors: vijay@fileverse.io, andreas@fileverse.io
Resources Required: Communication support
Discussion: 
Created: 2024-06-06
---

## Summary of Proposal:

A sufficiently decentralized collaboration stack for Devcon 7 that makes community coordination & collaboration free from centralized intermediaries and their arbitrary rules that threaten people’s data sovereignty.

## Abstract:

We propose to use the Fileverse infrastructure and collaboration plugins to build a Devcon interface designed to be decentralized (smart contract + p2p networks), privacy-preserving (E2EE), compatible with crypto-native identities (eg. ENS) & communication channels (Farcaster/Lens), and simple to use.

## Motivation and rationale:

Devcon is a communal event. It encourages local and global coordination in the Ethereum community through IRL meetups but also digital tools where people find others, share inormation, and co-produce knowledge / code.

However, these digital tools are a persistent point of centralization in crypto that remains largely unaddressed. Google Docs/Drive, Notion, Luma and Twitter threads are the main tools used by people, teams and organisations alike. These have great UX but come with limited control over your data, no privacy guarantees, and no support for community ownership.

Fileverse is built to make this community coordination & collaboration free from centralized intermediaries and their arbitrary rules that threaten people’s data sovereignty. It is designed to be decentralized (smart contract + p2p networks), private (E2EE), compatible with crypto-native identities (eg. ENS) & communication channels (Farcaster/Lens), and simple to use.

## Implementation

### Operational considerations:

We propose the gradual piloting of the Fileverse stack as a way to fulfil the needs of Devcon participants without compromising on values or user experience. It would provide easy access to:
* Note-taking and file sharing
* Collaborative documents
* A Devcon community page showing: 
    * Community notes, translations, discussions and more for each day/talk/event/etc at the conference
    * People that are publicly contributing and attending 
* Shared ownership. Multisig-owned and managed content and data storage
* Onchain identities and interactions
* Crypto native communication (e.g., share content as frame on Farcaster & Lens)
* Information automation
    * Webpage / information fetching bots
    * Translations bots
    * Onchain content AI agents	on Fileverse auditable infra 

### Technical considerations and stack:

* Fileverse SDK for storage + editors (i.e., dPage, dDocs, whiteboard) 
* Smart contract as register for content hashes and access permission (audited by Nethermind)
* Files stored on IPFS & gun.js
* Comments stored on gun.js (decentralized database)
* Individual content UI hosted using Fleek 
* Static UI accessible from any public IPFS gateways
* Offchain access with UCANs - User generated authentication and authorization, not dependent on any central server
* Infra can be self hosted if needed
* Data can be exported anytime
* Onchain accessibility of public files using Subgraph
* Zupass integration for verification with PCDs (created ZuPassCollab at EthBerlin04)
* Using Safe Multisig with Hats for granular permissions
* E2ee for private notes
* Auto Tagging of content

## Example flow for the app:

Devcon 7 conference attendees/participants will have a community-owned, collaborative stack available to them this year via a website and onchain (e.g., devcon.dnotes.org or devcon.ddocs.org). 

From there, attendees/participants will have a full view of notes/content produced for the conference by other attendees/participants, side-event organizers, and core organizers. People will also be able to reshare content on crypto socials such as Farcaster/Lens. Meaning to allow people that are browsing through their social media feeds to quickly flick through and engage with Devcon community notes or an event description without leaving their feed.

Participants will also be able to anonymously authenticate there (e.g., w/ ZuPass) to access a suite of collaborative tools including dDocs (E2EE alternative to google docs), Whiteboard, and dPage (open-source alternative to Notion) to help them through the conference. For example, dDocs lets people:
* Collaborate live with others to co-produce anything from wikis to debates
* Write (markdown compatible)
* Write code
* Create tables
* Token-gate
* Embed images & links
* Publish it publicly on the Devcon community page and give either view/edit/comment access to others

## Operational Requirements & Ownership

**What actions are required to implement the proposal at Devcon?**

Discussions with the core Devcon team and/or community to ensure that the details of this proposal are clear and satisfactory, and developed if not. 

A test phase where the Devcon team and/or community trials the MVP and share feedback before the final development phase in preparation for the conference.


**Who will be responsible for the proposal to be implemented effectively?**

The Fileverse team will be developing and sharing the required technology and app.

**What other projects could this proposal be integrated with?**

We discussed and collaborated with several individuals developing ZuPass and associated tools by the 0xPARC team, to develop ZuPassCollab. During ETHBerlin04 it became clear that we should present and describe ZuPassCollab in a separate DIP to enable anyone in the community to build on it or use in their respective use cases. ZuPass is an essential building block for trustless collaboration. ZuPassCollab applies that primitive to practical application, namely, enabling an Onchain community identity and collaboration space that is co-owned and co-managed by proven members of a group. DIP coming next week.

Finally, we will be submitting another DIP to introduce an onchain AI agents / bot architecture which we designed to facilitate the automated creation, management, and processing of offchain and onchain community content. We hope this can help people make the most out of public knowledge and ensure its accessibility.

## Links & Additional Information

Github: https://github.com/fileverse 

ZuPassCollab: https://github.com/vijaykrishnavanshi/ethberlin04


