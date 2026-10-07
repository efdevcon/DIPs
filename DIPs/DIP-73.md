---
DIP: 73
Title: Physical Ethereum Identity — NFC Devcon Tags
Status: Draft
Themes: Ticketing, Social, Art, Freeform
Tags: Event Production, Software, Other
Authors: @adityakaklij
Resources Required: Operations Support, Communications support
Discussion: https://forum.devcon.org/t/devcon-8-india-physical-ethereum-identity-for-devcon-attendees/9248
Created: 2026-10-07
Instances: Devcon8
---

## Abstract

Provide every Devcon 8 attendee with a unique, themed 3D-printed tag containing an NFC chip.

The tag becomes a physical interface for the attendee's Devcon identity. It can be used at selected event locations for entry, re-entry, workshops, Community Hubs, food, games, benefits, and other activities.

Attendees can optionally link the tag to an Ethereum address or ENS name. Wallet connection should not be required.

The goal is to make Ethereum identity physical, useful, and something attendees want to keep after Devcon.

## Proposal

Each attendee receives a small 3D-printed NFC object designed specifically for Devcon 8.

The object can contain or reference:

- A unique Devcon attendee ID
- An NFC chip
- Optional ENS name
- Optional Ethereum address
- Devcon branding and a unique physical design

The same object can then be used across different parts of the event.

For example:

- **Entry:** Tap to enter or re-enter.
- **Workshops:** Tap to register participation.
- **Community Hubs:** Tap to participate or receive a credential.
- **Food & Benefits:** Tap to redeem an eligible benefit.
- **Games:** Use the same identity across event games and quests.
- **Social:** Tap another attendee to exchange selected information such as an ENS name.
- **Credentials:** Receive attestations for selected activities.

Not every interaction needs to be onchain. Normal event operations can remain offchain, while selected activities can issue cryptographically verifiable credentials or attestations.

### Physical Design

The tag should be more than an NFC card.

It should be a collectible Devcon artifact with a design based on Devcon 8 and Mumbai. Multiple designs or variants could be produced.

The tags could also be manufactured through a distributed network of 3D printers and makers in India using open manufacturing specifications.

### Privacy

The system should not create a public record of everything an attendee does.

Each interaction should reveal only what is required.

For example:

> "Is this attendee eligible for this benefit?"

rather than:

> "Show everything this attendee has done."

ENS names and Ethereum addresses should be optional, and the NFC tag should not contain sensitive personal information.

Lost tags should be revocable and replaceable.

## Example

An attendee chooses to associate `adityak.eth` with their Devcon identity.

At the entrance, they tap their tag.

Later, they tap it at a workshop and receive a participation credential.

At a Community Hub, the same tag is used again.

They meet another attendee and tap to exchange their selected profile information.

After Devcon, they keep the physical object and can continue using the credentials associated with their identity.

## Requirements

From Devcon and the Devcon team, we need:

- Coordination with the ticketing and registration systems.
- Permission to deploy NFC readers at selected event locations.
- Coordination with Community Hubs, workshops, food, games, and other participating activities.
- Access to the relevant event operations teams for integration and testing.
- Support for attendee onboarding and replacement of lost tags.
- Venue access for testing before the event.
- Support for producing and distributing the physical tags.

From the DIP team:

- Physical tag design.
- NFC hardware selection and testing.
- Identity and credential infrastructure.
- Integration with Devcon systems.
- Reader deployment and testing.
- Privacy and security design.
- Documentation and on-site technical support.

## Success Criteria

The project is successful if:

- The same physical object works across multiple Devcon experiences.
- Attendees can use it without technical assistance.
- Wallet connection remains optional.
- Attendee data is not unnecessarily exposed.
- Other Devcon projects can integrate with the identity layer.
- Attendees want to keep the object after Devcon.
- The system can be reused by future Ethereum events.

## Discussion

The main question is not whether NFC can replace an event badge.

It is:

> **What does an Ethereum-native physical identity look like?**

Devcon 8 provides an opportunity to experiment with that question at real-world scale.

