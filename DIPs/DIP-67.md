---
DIP: 67
Title: Meerkat - Online Q&A at scale and Session Feedback
Status: Draft
Themes: Audience Engagement, Content Quality
Tags: Production, Q&A, Software, Moderation, Reputation, Feedback, Open-Source
Instances: Devconnect2025
Authors: Florian Dreschner (florian@voya.games)
Resources Required: Travel Reimbursement, Tech support, Communication support, On-site desk
Discussion: https://forum.devcon.org/t/dip-meerkat-online-q-a-at-scale-and-session-feedback/7780
---

## Abstract

Deploy Meerkat to power live, privacy-preserving Q&A and post-session feedback across Devconnect ARG. Core upgrades: (1) reputation-assisted curation to raise question quality at scale; (2) lightweight post-session surveys to close the loop for speakers and organizers. Meerkat is open source and already field-tested at major Ethereum events.

## Rationale

In-person, offline Q&A for large audiences has well-known issues: content is unpredictable (often mediocre, sometimes malicious); microphone passing wastes precious time; and the format isn’t inclusive: many shy attendees won’t stand up to ask.

In contrast, Meerkat at Devcon 7 SEA showed that a fully integrated online Q&A yields more relevant questions and a better attendee experience, backed by audience/organizer quotes and high activation rates.

One highlight is captured in this [video](https://x.com/meerkatzk/status/1897594746379399617), when Hart Lambur started Q&A with Vitalik Buterin, Jesse Pollak, Steven Goldfeder, Ben Jones on main stage at Devcon 7 SEA and he realizes how Meerkat curated the questions for him.

> “Wow, this is cool!”
> 
> 
> — Hart Lambur
> 

Meerkat was developed in cooperation with 0xPARC. It was fully integrated, including the Devcon app and Fileverse.

Based on learnings from November 2024 and follow-up events at Zuitzerland, ProtocolBerg, SDD Berlin, ETHDenver, Building Blocks, and others, we iterated on both product and operations, adding features such as “select a question,” theming, and alternative authentication modes.

For Devconnect, we will evolve Meerkat to deliver more value to speakers, attendees, and organizers. After informal interviews with organizers at the above events and audience feedback, we will apply these learnings:

- Improve content quality via crowd-assisted, privacy-preserving moderation.
- Capture actionable per-session feedback with near-zero friction.
- Maintain attendee privacy and a decentralization ethos (ZK-friendly auth; no PII). The reference implementation supports Zupass-style credentials.

## Implementation

Many improvements from Devcon 7 SEA are already available in Meerkat, including event theming, “select a question,” and new layouts. We propose two major changes.

### Reputation-based content curation

Moderators play a key role: reading incoming questions, selecting them, and moderating. This is challenging while also managing an in-person crowd. It requires attention to Meerkat while tracking talk content.

For Devconnect, audience members can earn reputation as good question askers or voters. Reputation will allow them to highlight strong questions and hide low-quality ones for manual review. This crowdsources content curation, while moderators, organizers, and the Meerkat team can always override.

### Post-event feedback

Organizers and speakers benefit from structured session feedback. While Meerkat already supports feedback, it does not currently remind the audience.

For Devconnect, we will include a short post-session survey that allows attendees to provide feedback to speakers and organizers in a convenient format.

#### Timeline

- **2025-09-15**: v0 of reputation + feedback + theming ready for review.
- **2025-11-03**: feature-complete; moderator training content.
- **2025-11-17-22**: on-site support at La Rural.

## Operational Requirements & Ownership

### Deliverables (Meerkat)

- Hosted Meerkat instance for all approved Devconnect sessions.
- Moderator & organizer briefing (1h on-site).
- Theming to Devconnect ARG.
- On-call during event hours; daily summary to organizers.

### Dependencies (Organizers)

- Listing in official comms + room QR signage.
- On-site desk near organizer hub.
- Review meetings during implementation
- Optional: link in the Devconnect app/website.

### Cost

Free for Devconnect and partners.

We request support to cover conference tickets, flights, and accommodation for a team of two to participate.

## Links & Additional Information

[GitHub Repository](https://github.com/meerkat-events/meerkat)  
[Meerkat Landing](https://meerkat.events)