---
DIP: 12
Title: Addition to DIP–1 — Make Devcon Carbon Neutral
Status: Draft
Themes: Ticketing, Environmental Sustainability
Instances: [Devcon6]
Tags: Event production, Software
Authors: Raphaël Haupt <raphael@curvelabs.eu>
Resources Required: Tech support, Communication support
Discussion: https://forum.devcon.org/t/co2ken-carbon-neutral-devcon/27
Requires: DIP-1
Created: 2020-10-22
---

## Summary of Proposal
Addition to CO2ken's [DIP–1](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-1.md) clarifying the collection and allocation of offsetting contributions through a DAO which gives contributors the possibility to vote for the offset projects they want to support.

## Abstract
As described in [DIP–1](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-1.md), we want to offer attendees the ability to offset the carbon emissions from Devcon. In the first DIP we explained the overall rationale behind the proposal and left some specifics open to further clarification. This DIP aims to answer the following question which was raised in the first DIP: *How the funds gathered during the ticketing process will be used to offset the event's carbon footprint will be discussed in a future DIP?*

In short, we will deploy a DAO which holds the contributions to offset projects collected during the ticketing process until Devcon takes place in August 2021. Furthermore, the DAO will give contributors the possibility to vote for the carbon projects they favor thereby actively taking part in how the collected funds are allocated.

*How does voting affect the projects?*
There will a pre-selection of projects that contributors can vote on. The allocation of contributions won't follow a winner-takes-it-all approach but will be relative to total votes, i.e. if a project received 60% of the votes, it will get 60% of the funds. Contributors will be able to vote for multiple projects thereby signaling how they think the funds should be split amongst the projects.

*What if only 50% of the people vote?*
Whether or not a person votes, their funds are going to carbon projects. If people don't vote, we assume an equal distribution of votes between the proposed projects. This way, we make sure that the weight of a vote is not excessive in case of low voting participation.

## Motivation & Rationale
DAOs are popping out of the Ether like mushrooms trying to address challenges of human coordination like allocation of funds, collaboration, or decentralized governance. We are choosing this path for the collection and allocation of offset contributions because we want to take offsetting out of the "charity corner" and integrate contributors in the process as much as possible and because it gives us time until the event to find and engage the best carbon projects.


## Implementation
**Organizational**

- Contributors will receive an NFT which gives them access to the DAO. We are discussing the best way to give contributors this NFT with as little data privacy risk as possible. An integration with the [Status Keycard](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-5.md) or any on-chain ticketing system (like the one proposed by [Alpha Wallet in DIP–6](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-6.md)) could be a good solution.
- Find high-quality carbon projects to be added as recipients of the collected contributions.
- Identify the best flow that ensures that carbon projects receive the funds in a currency they know how to use

**Technical**

- Review the Pre-Tix swag add-on feature and, if satisfactory, add CO2ken as swag item.
- Users can pay with the same currencies as are accepted by the Devcon ticketing process.
- Add a voting module which lets contributors express their preferences for specific carbon projects. This voting module is likely to use conviction voting as developed by the [Commons Stack](https://commonsstack.org/) and implemented by [1Hive](https://1hive.org/#/).

**Previous experience**

- We already deployed a PoC DAO during the [BSIC incubator](https://blockchainforsocialimpact.com/incubator-winners-2020/) that you can check out [here](http://dao.co2ken.io/).
- At Curve Labs (broader CO2ken family), we are building *PrimeDAO* which you can learn more about [here](https://liquiddao.eth.link/#/).

**Post-event**

- It will be very valuable for us to see the engagement of contributors with the subject of carbon offsetting.
- We're striving to decentralize governance of the CO2ken protocol. This DAO will be a first pool of value-aligned users.

## Operational Requirements & Ownership
1. *What actions are required to implement the proposal at Devcon?*
    - We'll need the Devcon team to convert fiat contributions to crypto and send them to the DAO.
	- Contributors need to receive the NFT that gives them voting rights in the DAO. The attestation-based approach proposed by [Alpha Wallet in DIP–6](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-6.md) could be a good option that allows contributors to claim their NFT.
	- We'll need the e-mail addresses of those who contributed to explain the voting process and their participation rights in the DAO.
	- We'll need a booth at Devcon during the whole duration of the event to
		- present the different projects (maybe even get project developers there in person) and give contributors a chance to directly engage with the DAO;
		- raise awareness for environmental challenges in the crypto space and ways to tackle them. The [Sovereign Nature Initiative](http://sovereignnature.com/) will support us on that front.
    
2. *Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)*
    - CO2ken will be responsible for the successful implementation of this proposal.
3. *What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))*
    - see [original DIP–1](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-1.md).

## Links & Additional Information

**Links:**
* [Link to Devon Forum — CO2ken DIP](https://forum.devcon.org/t/co2ken-carbon-neutral-devcon/27)
* [CO2ken Website](https://www.co2ken.io/)
* [Medium post describing the project's Genesis (things have changed since then)](https://medium.com/curve-labs/co2ken-genesis-74d7a1387ea1)
* [@CO2ken_io on Twitter](https://twitter.com/CO2ken_io)
