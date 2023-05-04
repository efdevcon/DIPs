---
DIP: 0
Title: DIP Purpose and Guidelines
Status: Active
Themes: Meta
Tags: Other
Authors: Bettina Boon Falleur (@BettinaBF), Ligi (@ligi), Heather Davidson (@p0unce), Skylar (@skylarweaver), Joseph Schweitzer (@ethjoe)
Discussion: https://forum.devcon.org
Created: 2020-07-06
---


## What’s a DIP?

DIP stands for DEVcon(nect) Improvement Proposal. A DIP is a proposal put forth by members of the community describing a desired new feature or process to improve DEVcon(nect). A DIP should be concise and provide as much information as possible as well as a rationale for the proposal.

The DIP author is responsible for making the case for a proposed DIP, and community members will be able to comment on it. It is up to the DEVcon(nect) Team to choose which proposals are considered, reviewed, and accepted.

## Rationale

The DEVcon(nect) Team intends DIPs to provide a mechanism for collecting collaborative community input on what should be included at the upcoming DEVcon(nect). While we are excited to have a more formal process to hear ideas from the community (roughly inspired by the more decentralized PEP, BIP and [EIP](https://eips.ethereum.org/) processes), this is an experiment, and it should be understood that approval of proposals ultimately lies solely with the DEVcon(nect) team. DIPs focus on collaboration in the ecosystem, so please review and collaborate on other proposals rather than submitting possible duplicates.

## Themes
There are two general types of DIPs you can create:
1. A response to one of our [Request for Proposals (RFPs)](https://forum.devcon.org/c/devcon-rfps/5) which are ideas that we would like to see happen at DEVcon(nect)!
2. _Any_ idea! We welcome any ideas you have to improve DEVcon(nect)!

Here is a list of themes to inspire you:

 * **Ticketing** - Anything useful concerning ticketing (e.g. usage of NFTs)
 * **Social** - How to make people connect, prior, during and after DEVcon(nect)?
 * **Environmental Sustainability** - Any idea that helps us make DEVcon(nect) more environmentally sustainable
 * **Virtual Experience** - Live streaming, and other ways of interacting with people unable to be physically present at DEVcon(nect)
 * **Purchases & ID** - Let’s do more to use crypto at DEVcon(nect)! Onsite and Offsite purchases, bookings,...
 * **Community Involvement** - How can we integrate more community input into DEVcon(nect)?
 * **Art & Beauty** - A cool design for swag items, an art piece, ...
 * **Freeform** - Any great ideas you have! From tutu-Tuesday to Bring your own T-rex for closing ceremony
 * **Meta** - Any improvement to the DIP process itself. This process is new, and it could benefit from anything that you’ve got in mind. We’d love to hear your thoughts.

## Instances

Which events should this DIP target? Can be `*` for all events or a list of specific events - e.g. `DEVCon7`.

## Tags
DEVcon(nect) has several aspects to its organisation. To help us better guide you, select the area of focus that concern your DIP:

* **Event Operations** - Anything related to the general organisation of DEVcon(nect)
* **Event Production** - Anything to do with the on-site attendee experience
* **Software** - Anything to do with software needs, devcon.org, subdomains, ...
* **Communications** -Anything to do with DEVcon(nect)-related communication, media, blog posts, ...
* **Sponsorships** - Anything to do with sponsorships, benefits and more.
* **Other** - Anything else

## Resources
Your DIP may require resources from the DEVcon(nect) team, so make sure to add them to your draft. This will save us both precious time when evaluating the feasibility of a DIP.

* Tech support
* Physical room at venue
* Operational support
* Communication support
* Other: please specify

## Criteria for a Successful DIP
* Aligned with DEVcon(nect)’s Code of Conduct and values
* Integration is driven and owned by the stakeholder/project/community
* Willing to collaborate with other projects and people
* Can be integrated with other dApps & projects at DEVcon(nect)
* As good as, or better than the non-blockchain alternative (explain why and how)
* FOSS mentality

## Team
The DEVcon(nect) team is the final decision maker on the status of a DIP (Accepted - Postponed - Not Implemented). Our team will work together to provide a technical and operational review of all DIP drafts submitted. They are responsible for communicating with the DIP authors and relaying information between teams, and accompany projects through their production-implementation phase to ensure Accepted DIPs are ready for DEVcon(nect).

## Workflow (From Idea to Implementation)

#### 1. Eureka!

You, the DIP author, just came up with a great idea💡 for DEVcon(nect). Either (a) your DIP answers one (or several) of DEVcon(nect)'s [RFPs](https://forum.devcon.org/c/devcon-rfps/5) or (b) you came up with another improvement you'd like to suggest!

#### 2. Community Feedback

Before writing a formal DIP Draft in Github, take the time to vet your idea. Open a discussion thread in the [Devcon Forum](https://forum.devcon.org/) and make sure to clearly state your idea to allow the community to provide feedback. Share your idea with the community to gather more feedback. This is done to ensure you don't waste your time writing a DIP that either won't get enough traction, is not feasible, or is a duplicate. Take five minutes to read through the [RFPs](https://forum.devcon.org/c/devcon-rfps/5) to make sure your idea doesn’t fit in one — it may save you some time!

#### 3. Process

 1. **Draft DIP** - Choose your prettiest digital pen and write your DIP! Follow the yellow brick road: [DIP format](https://github.com/efdevcon/DIPs/blob/master/DIPs/DIP-0.md#dip-format)
 2. **Submit DIP** - Click on the scary button and submit your DIP. Ensure you include all information required in the template under DIP Format below.
 3. **Editor Review** - Your DIP is now in the hands of the DIP editors team for review.
Editors might request more information and ask to resubmit the DIP.  
 4. **DEVcon(nect) team Review**
     * **Draft** - Your DIP that is undergoing rapid iteration and changes
     * **Accepted** - Your DIP idea is approved! Now it's time to work on the implementation!
     * **Postponed** - Your DIP won’t be possible the upcoming DEVcon(nect) - but we love the idea.
     * **Not Implemented** - Oh no, the mean DEVcon(nect) team, reach out to them and ask for more context to understand their reasoning
     * **Changes Requested** - The DIP needs modifications conditional to its validation.

#### 4. Implementation

  * Definition of project timeline
  * Bi-monthly sync with DIP editors & other DIP-authors
  * Collaboration with other DIP projects
  * Testing

#### 5. Production

  * Ready for take-off!

## DIP Format

Your first PR should be a first draft of the final DIP. It must meet the formatting criteria (largely, correct metadata in the header). An editor will manually assign it a number before merging it. Make sure you include a discussions-to header with the URL to the [Devcon discussion forum](https://forum.devcon.org)

If your DIP requires images, the image files should be included in a subdirectory of the assets folder for that DIP as follows: assets/dip-N (where N is to be replaced with the DIP number). When linking to an image in the DIP, use relative links such as ../assets/dip-1/image.png.

After submitting editors will go through [this checklist](../checklist.md) - it is encouraged that you already went trough these points yourself.

All DIPs should be written in markdown format. Please use the template below:

```
---
DIP: (Number of DIP)
Title: (Think of a catchy, descriptive, short title)
Status: Draft
Themes: (See themes above)
Tags: (Please select all that apply: Programming, ...)
Instances: (See instances above) 
Authors: (Emails of primary contacts)
Resources Required: (Physical space at venue, Operations Support, etc.)
Discussion: (URL of where this DIP gets discussed, preferably on https://forum.devcon.org)
---

-----Summary of Proposal-----
__Simple Summary__
__50 word summary__

-----Abstract-----
__200 word description of the proposal.__

-----Motivation & Rationale-----
__Below are some useful prompts__
- How would this enhance attendee experience?
- How is this solution better than a non-blockchain experience?
- How does this proposal introduce attendees to a novel blockchain/ethereum use case?

-----Implementation-----
__Below are some useful prompts__
- Has any part of this proposal been implemented at other events? If so, please describe how it went.
- Do you require feedback or data from attendees post-event?

-----Operational Requirements & Ownership-----
__Please answer questions below:__
1. What actions are required to implement the proposal at DEVcon(nect)?
2. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)
3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))

-----Links & Additional Information-----
__Any additional information__
```
