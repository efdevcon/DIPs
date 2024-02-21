---
DIP: 16
Title: Universally verifiable off-chain polls for Devcon 6
Status: Draft
Themes: Community Involvement, Ticketing
Instances: [Devcon6]
Tags: Software, Event production
Authors: Pau Escrich <pau@vocdoni.io>, Patricio Worthalter <worthalter@poap.xyz>, Ferran Reyes <ferran@vocdoni.io>
Resources Required: Communication support
Discussion: https://forum.devcon.org/t/dip-16-universally-verifiable-off-chain-polls-for-devcon-6/204
Created: 2021-01-05
---

## Summary of Proposal

Vocdoni and POAP joint proposal to provide a universally verifiable, affordable and offchain voting system for DevCon ticket-holders. Supports quadratic voting and other governance systems.

## Abstract
__200 word description of the proposal.__

Our proposal entails the development of a privacy-centric, scalable, affordable and universally verifiable governance layer complete with a great UX/UI. This will allow Devcon attendees to be heard and enable a wide range of possibilities for the event's organization while stimulating the crowd's collective knowledge.

We will achieve this objective by linking the efforts of two experienced teams in the field of governance and permissionless census creation: Vocdoni and POAP.

With this proposal, attendees -who are POAP tokens holders- will be able to vote in the many voting processes created by Devcon organizers using [Vocdoni Bridge](https://www.notion.so/Introducing-Vocdoni-Bridge-cf7e73d38c4a45788358e9a1497cdf19), a token-based voting system relying on the Vocdoni Open Stack.

For the Q1 2021 pilot project, we propose to use the dataset of Devcon Osaka attendees (which would likely provide an accurate representation of Devcon 6's attendees). Token-holders will be able to vote using some of the most common wallets including Metamask and Web3Modal. In the following months we'll focus on developing integrations with several others, such as Alphawallet.

The voting tool will rely on the Vocdoni Open Stack, a universally verifiable, privacy-centric, and scalable voting system, as a Layer2 for Ethereum and xDai-chain laveraging on three main technologies: Tendermint, libp2p and IPFS. With this stack we will be able to host a transparent governance process which includes complex voting mechanisms like quadratic or range voting. The deterministic results (computed by all layer2 blockchain nodes) can be send back to Ethereum in order to execute binding smart contract operations. In the near future, combined with [zk-SNARKs](https://docs.vocdoni.io/#/architecture/protocol/franchise-proof?id=zk-rollups-proposal-for-anti-coercion-scalable-and-deterministic-execution) anonymous voting will be possible as well.

After this experiment, we believe that our proposal can unfold into a host of new governance use cases for Devcon in the following months and years including event feedback, governance sub-ecosystems, increased engagement from companies, projects and individuals, and beyond. 

Likewise, it will also be possible to develop strategies of retroactive governance by including participants from previous Devcon editions to voting processes or even giving more voting power to those who are recurrent attendees.

## Motivation & Rationale
__Below are some useful prompts__
- How would this enhance attendee experience?

Attendees will be able to make their voices heard and influence some decisions.

The organizers will be able to leverage a layer of governance that will allow them to include the input of the participants in the decision making.

Other active attendees such as speakers, sponsors or projects will use a permisionless platform to organize votes using different tokens. Thus an ecosystem of informal communities and small governance initiative will take place within event.

- How is this solution better than a non-blockchain experience?

Vocdoni was born not only with the aim of creating a secure voting platform, but also one that is universally verifiable and resistant to censorship. These attributes make necessary the use of decentralized technologies, like Ethereum, to provide transparency and traceability to the whole process and to become resistant to attack. 

The use of decentralized technologies, as all we know, is not exempt from friction. And the same applies when we talk about voting. But we pay a lot of attention to the user experience and we achieve a well-rounded experience in which the user may not even be aware that they are using decentralized technologies.

- How does this proposal introduce attendees to a novel blockchain/ethereum use case?

Typically scalable polling systems that don't use DLT are very hard to operate reliably and with high quality trust guarantees. In most cases they don't offer proofs and in all cases they are resource-intensive, becoming too expensive for all low-stakes decisions like speakers on stages. 

By combining the existing technologies created by Vocdoni and POAP participants of the event will learn that superfluid collective decision making processes are possible at nearly no cost.

## Implementation

**User-flow**

0. POAP prepares the census + Devcon organizers create the questions & options for the voting processes.
1. Attendees access the Vocdoni Bridge (through a web browser or integrations). This could potentially be under a specific domain.
2. Attendees login with their wallet where they hold the POAP tokens.
3. Attendees vote on the speakers of each track using quadratic voting.
4. Attendees and third parties can validate the results by using a third party node or by running their own node

Note: The current Vocdoni Platform includes a client App available in Google and Apple stores. However DevCon users won't be using this App client but rather the new web based DApp being developed ([Vocdoni Bridge](https://www.notion.so/Introducing-Vocdoni-Bridge-cf7e73d38c4a45788358e9a1497cdf19)) in order to reduce friction and to make the platform easy to integrate with any Dapp wallet client (Alphawallet, Status, etc.).

Users and organizers will be able to track the votes using the [Vochain explorer](https://explorer.vocdoni.net), a tool to draw data from the voting processes on the blockchain and make it human-readable and searchable.

- Has any part of this proposal been implemented at other events? If so, please describe how it went.

POAP's Tokens technology has been used in many physical and virtual events, including DevCon, EthCC, EthDenver, EDcon and Dappcon. There are already more than 650 POAPs representing events.

The Vocdoni Open Stack has been used successfully by various organizations (Municipalities, associations, cooperatives, companies and informal organizations) to organize Signalling polls, Event polls, Annual General Meetings and elections.

The largest cultural association in Europe (185.000 members) has used Vocdoni to organize its Annual General Meetings and elections 2 years in a row and will handle a new election on January 2021.

- Do you require feedback or data from attendees post-event?
Feedback will not only be welcome, but will be very important. Especially to continue improving the tool to cover the governance needs of Devcon and other community events. This is critical, as governance implies dealing with human behaviour and this first pilot will certainly provide many inputs to improve the product. We'll have available a helpdesk (chat+chatbot+KnowledgeBase+ticketsystem) and we could establish extra channels (e.g. telegram) to receive technical, accessibility and UX/UI feedback.


## Operational Requirements & Ownership

**1. What actions are required to implement the proposal at Devcon?**

To run this first experiment to determine a small subset of Devcon speakers (as detailed in RFP-4) we propose, because ticket sales for Devcon 6 Colombia have not yet begun, to use Vocdoni Bridge as a token-based voting system that makes use of POAP's dataset from Devcon 5 Osaka as a census to allow these participants to choose some of the Devcon 6 speakers.

We believe Devcon 5 participants are a good representation of the Ethereum Community that attended past and probably future editions. Thus, the voting output would be very similar to what would be achieved with the Devcon 6 ticket holders.

Added to time constraints, we propose not to use AlphaWallet integration (DIP-6) for this experiment and make this integration later, after this first pilot. 

We can guarantee a first version of the tool for the beginning of March and hopefully by the end of February.

**Roadmap and required actions**

We foresee 7 weeks of work (starting from today) to have the first version ready for the pilot test detailed in RFP-4.
    
* **First week**
    1) Joint call to make Vocdoni and POAP's proposal known in depth and to solve potential doubts. Also through the Devcon forum.
    2) Vocdoni Bridge development
* **Second week**
    1) Devcon organizers provide a detailed picture of how they would like to organize the voting and how the content will be structured.
    2) Vocdoni Bridge development
* **Third week**
    1) Vocdoni Bridge dev: Integration with POAP tokens
    2) Vocdoni Bridge dev: Frontend with simple and multiple choice voting
    3) Devcon bring feedback
    4) Demo
* **Fourth week**
    1) Vocdoni Bridge dev: Integration with POAP tokens
    2) Vocdoni Bridge dev: Frontend
    3) Vocdoni Bridge dev: Implementing Quadratic voting in frontend
* **Fifth week**
    1) Vocdoni Bridge dev: Support for Web3modal
    2) Vocdoni Bridge dev: Addressing issues
    3) Vocdoni Bridge dev: Devcon customizations if needed
    4) Run a test
* **Sixth week**
    1) Run a test
    2) Vocdoni Bridge dev: Addressing issues
* **Seventh week**
    1) Run the last test before launch
    3) Launch
* **To address post-pilot**
    1) Vocdoni Bridge dev: AlphaWallet integration
    2) Vocdoni Bridge dev: Advanced privacy enhancements
    3) Vocdoni Bridge dev: More voting type options
    4) Explore and introduce more anti-collusion strategies

3. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)

The project will be coordinated by Pau Escrich (pau@vocdoni.io) and Patricio Worthalter (worthalter@poap.xyz). Both Vocdoni and POAP are joining forces with a mixed-team of 4 developers working on the project.

Vocdoni and POAP teams are already working on the project to enable POAP token holders to vote using Vocdoni Bridge through an easy UX/UI (by signing with wallets like Metamask or Argent).

**Deliverables and Ownership**

|#  | Deliverable | Description | Owner|
|---|-------------|-------------|------|
|1.|Web token-based voting system|<ul><li>Vocdoni Bridge voting platform</li><li>Libraries to bring compatibility with NFT tokens</li><li>Deployment under a specific domain</li></ul>|Vocdoni|
|2.|Devcon attendees census |<ul><li>Devcon Osaka POAP tokens dataset</li></ul>| POAP |
|3.|Questions types + copies |<ul><li>Number of questions + options</li><li>Type of votings</li><li>Content</li></ul>|DevCon|

4. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))

Vocdoni Bridge can work with POAP tokens but also with ERC-721 and ERC20 tokens, allowing other initiatives by the organizators, participants, projects or sponsors to spring up naturally throughout the event. Since the system is permisionless, it allows for a very easy way to execute governance projects at the event which can mean an outburst of initiatives that facilitate community empowerment, doocracy and more.

We believe we can bring a governance layer for other DevCon Improvement Proposals such as `DIP-1/DIP-12 Make Devcon carbon neutral` and be easily integrable with others like `DIP-5 Keycard at Devcon`.

In addition, our system allows us to go one step further in the goal of integrating the community, collecting input and take informed decisions throughout the year, beyond the days on which the event is hold.

**Next & potential steps after the pilot:**
* Integrate Vocdoni Bridge with AlphaWallet
* Integrate zk-SNARKs via web to enable anonymous voting (based on Iden3 circom circuits)
* Frontend implementation of new types of voting processes using [Voting Protocol](https://www.notion.so/vocdoni/Question-types-eaa2041ec5ec41ee8de642d7a7c062dd) such as Weighted choice, Sorted, Rank, Multiple choice,... and even other exponential votings (not just quadratic!)
* Integration with other wallets like Status.im

## Links & Additional Information

* [Introducing Vocdoni Bridge](https://www.notion.so/vocdoni/Introducing-Vocdoni-Bridge-cf7e73d38c4a45788358e9a1497cdf19)
* [Vocdoni Open Stack docs](https://docs.vocdoni.io/)
* [Vocdoni Bridge UI](https://www.figma.com/file/NO5wUEYxKgIppKz5fryBTR/Vocdoni-Bridge?node-id=0:1)
* [Vocdoni Github repo's](https://github.com/vocdoni)
* [POAP Github repo's](https://github.com/poapxyz/poap)
* [List of events with POAP Tokens](https://app.poap.xyz/admin/events)
