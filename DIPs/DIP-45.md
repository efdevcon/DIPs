---
DIP: 45
Title: Meerkat - Q&A-Tool for Zupass to increase Engagement at Talks
Status: Draft
Themes: Social, Ticketing
Tags: Event Production, Event Operations
Instances: Devcon7
Authors: Miriam (info@newagegoods.com), Florian (florian@voya.games)
Resources Required: Tech support, Operational support, Communication support, Physical device support
Discussion: https://forum.devcon.org/t/meerkat-q-a-tool-for-audience-engagement/3805
Created: 2024-8-5
---


## Summary of Proposal

We are proposing the development of an innovative app that combines the interactive questions & answers capabilities of Slido with the privacy preservation of Zupass. This tool, Meerkat, is designed to enhance audience engagement at events while upholding the standard of user privacy.

## Abstract

Meerkat is a privacy-preserving audience engagement tool creating interactive Q&A sessions between speakers and attendees at large talks, panels and workshops. It supports extended use cases by storing user activity in Zupass.

Each talk or workshop has a pre-generated Event Page in Meerkat featuring an interactive questions section and Event Cards that attendees can collect and speakers can personalize.

By scanning a QR code and using a privacy-preserving Zupass ticket, attendees can access the event page for a talk. There, they can view, ask, and upvote questions during talks or workshops, fostering active participation.

Meerkat also allows attendees to collect attendance verification cards — cryptographically secured digital artefacts — through their Q&A interactions, stored in their Zupass. These are called Event Cards.

Speakers can enrich Event Cards with personal notes, questions, social media links, and presentation slides, strengthening their connection with the audience and providing clear next steps for engagement to the attendees directly.

Our goal is to design the app to be clear and simple, focusing on its core feature of Q&A in a fun and privacy-preserving way.

This proposal seeks insights and support to create the best possible digital Q&A experience through integration into the Devcon event flow.

## Motivation & Rationale

The motivation behind Meerkat is twofold: we enjoy both the challenge of the problem and the technological solution.

**Tackling an interesting problem:**

Meerkat aims to help conferences to achieve great outcomes of talks and workshops for both attendees and speakers. These outcomes include:

-   providing the audience with clear next action steps
-   fostering engagement through active participation,
-   and facilitating connecting and networking.

Meerkat's web app optimizes these outcomes by enhancing Q&A sessions and integrating action steps and opportunities for connection into its app flow. Meerkat benefits both attendees and speakers by fostering interaction and reducing the distance between them. Event organizers in turn benefit from better outcomes of talks. We propose a tool that is compact in itself and can easily be reused at future conference.

**Making the zk playground bigger:**

Conventional tools often require personal data for sign-up, but we want to inspire developers to explore zero-knowledge (zk) technology. Our proposal introduces a new use case for digital signatures, showcasing how zk can enhance privacy and security in common interactions. We aim to provide a practical example of generating and using verified [Provable Object Data (PODs)](http://pod.org/) to help Devcon attendees understand zk's potential. This solution offers superior privacy and security compared to traditional methods.

## Implementation

We previously collaborated with Zupass and the PCD-SDK at the ETH Berlin 2024 hackathon, creating a functional social connection app called Zumeet. Key features from Zumeet, such as generating a POD, letting participants engage with a POD, and Zupass integration, are also incorporated into Meerkat. Meerkat is being developed as an open-source app for Devcon and can be reused at future events.

1.  **Flow of the Meerkat App**
    
    To delve deeper into the web app, let's examine the actions of each user, starting with an attendee of a talk:
    
    **How will the Attendees use it?**
    
    1.  **Core Loop with Audience Q&A**
        -   Meerkat creates a unique URL per talk and workshop of a conference. We call this an Event Page.
        -   The audience of a talk can access the talk’s Event Page by scanning a QR code that is displayed at the beginning, or throughout a talk, and read basic information.
        -   The Event page has three sections: Information about the talk, the Q&A and comments section, and the POD-generation section.
        -   Any attendee with access to the Event Page can view the talk’s public Q&A comments section.
        -   After anonymously verifying themselves with their Zupass Devcon ticket, an attendee can submit and upvote questions to engage with the talk.
        -   At the end of a talk, attendees can choose to generate and download an Event Card artefact from the talk into their Zupass. The Event Card also serves as a proof of attendance. It also contains information the attendee can engage with as a next step.
    2.  **Speaker Interaction**
        -   Attendees can create Event Cards for speakers, containing messages from attendees to speakers.
    3.  **Extended Functionality**
        -   We are exploring additional use cases for the generated Event Cards for both attendees and speakers.
    
    Let's explore the series of actions a speaker takes to complement the flow described above from their perspective:
    
    **How will Speakers use it?**
    
    1.  **Core Loop with Audience Q&A**
        -   The speaker gets provided with a dedicated Meerkat PDF slide containing its talk’s unique QR code to the Q&A event page.
        -   Speakers or moderators of a panel can answer the top questions and comments at the end of their talk, either by reading them from their own device, or by the stage controller putting up the Event page onto the general presentation screen
    2.  **Speaker Interaction**
        -   A speaker has edit-rights to the event card of their talk, collectable by the audience. They can be creative and to modify and personalize it, adding speaker notes, links to social media, slides, and further reading materials. This allows for them to connect better with their audience and give a clear next action steps to the audience.
        -   If a speaker gives multiple talks or workshops, the process for the speaker and their audience repeats.
2.  **Technical Implementation**
    
    **Systems needed:**
    
    -   Meerkat Web App available on mobile and desktop
    -   Issuance system for PODs
    -   Q&A system
    -   Administration system
    
    **Technologies used:**
    
    -   pretalx API
    -   PCD-SDK (latest version)
    -   Zupass
    -   Free and open-source software
    -   Stack: React, Deno, Supabase, Drizzle, Fly, Hono
3.  **Design**
    

We are creating UX/UI mockups as we move into the next phase of developing the first version of Meerkat. Our goal is to make the design easy, light, and self-explanatory. We can incorporate the design of social shares of Devcon tickets from attendees for the event cards.

4.  **Scope**

The newly generated Event Cards can serve as gateways to additional services through Meerkat or third parties beyond the scope of the project we are aiming for, and could also be extended to event organizers. While there are ideas for additional extensions, the current focus is on developing a fully functional version of Meerkat with the core loop and core-adjacent features.

We plan to build out the core loop, and one or two additional features or extensions from the specifications outlined above. Further extensions are possible but outside the scope of the Meerkat Devcon Improvement Proposal (DIP). Our goal is to ensure everything works smoothly for a large number of people and integrates well with the event organization and the physical location.

5.  **Timeline**

We have completed the technical setup for the Meerkat app. While the current scope of the app is clear, we will continue adjusting the flow based on discussions and coordination with the organization team, as well as from feedback that requires further iterations.

-   2024/08/03: Technical Setup (done)
-   2024/08/04 - 2024/08/16: Core Loop + Q&A Extension (v1), Mockups, DIP (doing)
-   2024/08/20 - 2024/09/10: Testing v1, Flow and UX adjustments and versions v1+
-   2024/09/10 - 2024/09/25: Speaker Interaction feature
-   2024/09/25 - 2024/10/05: Testing and iterations
-   2024/10/05 - 2024/10/19: Extension buildout and testing, possible collaboration with another team
-   2024/10/20: Internal deadline - We plan to align with the Zupass ticket distribution via email.

To ensure the best coordination, we would like to have regular check-ins with the Devcon organization team throughout the development process to better synchronize milestones.

## Operational Requirements & Ownership

1.  **Who will be responsible for implementing the proposal into a working app on Day 0?**

We are responsible for building and testing the app through iterative testing with different groups. We may also test Meerkat at Edge City Lanna and conduct a final dry run in the two weeks before Devcon.

-   Testing: We will ensure Meerkat’s feasibility for 10,000+ Devcon guests and 100,000+ Event Card interactions on the core loop. The organizing team is encouraged to provide feedback to enhance app iterations.

To ensure a smooth and productive Devcon event, we will be on-site and on-call to respond to requests from the event organizer, speakers, or third-party developers. We will offer ad-hoc support for attendees, and implementation support for any feedback from users or third parties.

2.  **Implementing Meerkat at Devcon requires close collaboration and coordination with the Devcon team:**
    
       **For the technical implementation phase:**

    -   Pretalx API access in order to fetch [talks resources from REST API](https://docs.pretalx.org/api/resources/talks/): Use Pretalx to synchronize app features with each session's detailed agenda.
    -   Event Schedule: Provide a detailed agenda in Pretalx to synchronize app features with each session.
    -   Conduct check-ins with the organization team alongside Meerkat’s development milestones to ensure synchronization.
    
    **Coordination on-site at Devcon:**
    
    -   **Crucial:** QR Code Distribution: It is crucial to have operational support from the Organization team to facilitate QR code distribution to attendees for easy app access by either
        -   displaying the Meerkat slide with the QR code before a speaker's talk via the stage controller,
        -   and / or setting up pop-up stands with QR codes throughout the talk. We need a plan for the location, tasks, and speaker program to strategically place these items.
    
    **Communication leading up to Devcon:**
    
    -   Speaker Email Coordination: If possible, include Meerkat in email communications with speakers starting at the end of August.
    -   Attendee Email Coordination: If possible, include Meerkat in email communications with attendees starting at the end of August.
    -   We may need to contact speakers and provide them with a Meerkat slide, featuring a consistent design and their QR code, to add to the beginning of their presentation for recognition purposes.

3.  **What other projects could this proposal be integrated with?**
    
    1.  We are reviewing other projects and will update this section. While we see potential for example in integrating NFC for offline distribution, our priority is to build a reliable and specific standalone tool with our resources that enhances and seamlessly integrates into the event experience alongside other projects.
    2.  Meerkat Event Cards are reusable by third parties or other apps to build extensions with them, as described in the 'Scope' section above.

## Links & Additional Information

**About Us:** We are a hackathon team from ETHBerlin 2024 “Identity Crisis”, where we developed [Zumeet](https://projects.ethberlin.org/submissions/310)—a social connection tool that enables event participants to create personalized digital artefacts and exchange them by storing in each other's Zupass, and we received a grant from 0xPARC for Meerkat.

We are active and former co-founders with a passion for UX, eager to deliver Meerkat to an audience of over 10,000 Devcon guests. We're excited to present a fun and engaging way to interact with zk technology and look forward to your feedback on the Forum Proposal.

Technical Setup (Milestone done):

-   [https://meerkat-dev.fly.dev/events/01j4fjmw66fjbby6am7dq494at](https://meerkat-dev.fly.dev/events/01j4fjmw66fjbby6am7dq494at)
-   [https://meerkat-dev.fly.dev/api/v1/conferences](https://meerkat-dev.fly.dev/api/v1/conferences)
-   [https://github.com/FlorianDr/meerkat](https://github.com/FlorianDr/meerkat)