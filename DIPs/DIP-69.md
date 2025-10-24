---
DIP: 69
Title: DevConnect Onchain Gaming Adventure
Status: Accepted
Themes: Freeform, Social
Tags: Event Production, Software
Instances: DevConnect
Authors: Daniel Kronovet (@kronosapiens), Cartridge Gaming Company
Resources Required: Access to community hub spaces, Operations Support, Communications support
Discussion: https://forum.devcon.org/t/focg-treasure-hunt/8099
Created: 2025-10-21
---

## Summary of Proposal

A multi-stage onchain gaming adventure for DevConnect participants, blending browser-based fully onchain games with real-world quests at community hubs throughout the venue. The experience showcases the cutting edge of onchain gaming infrastructure within the Cartridge/Dojo ecosystem on Starknet L2 while driving engagement with community hub spaces.

## Abstract

Cartridge Gaming Company proposes a six-level onchain gaming adventure that alternates between browser-based fully onchain games and real-world quests hosted at community hub spaces throughout DevConnect. Using the Cartridge Controller for seamless authentication and progress tracking, participants discover the adventure through QR-coded entry points and progress by completing game challenges and solving interactive quests embedded within community hubs. The adventure map itself is represented as an on-chain NFT which dynamically updates as players complete their adventure.

The experience serves multiple purposes: providing an engaging alternative activity for conference attendees, demonstrating the capabilities of fully onchain games (FOCG) and the Starknet gaming ecosystem, driving foot traffic to community hub spaces, and creating collaborative puzzle-solving experiences that engage both adventurers and community hub members. The adventure implements cryptographic replay protection to ensure fair play while maintaining answer confidentiality, creating a secure and competitive multi-day gaming experience that may integrate with larger DevConnect quest activations.

## Motivation & Rationale

### Enhanced Attendee Experience

Crypto conferences can be intellectually intense. This gaming adventure provides:
- A fun, accessible alternative activity that appeals to both technical and non-technical attendees
- A compelling reason to visit community hub spaces and engage with diverse ecosystem projects
- A social framework for meeting other participants through collaborative quest-solving
- An asynchronous experience that lets people participate at their own pace throughout the multi-day event
- Engagement opportunities for community hub members who can assist, observe, or participate in quest activities

### Novel Blockchain Use Case

The adventure demonstrates several blockchain-native capabilities:

**Fully Onchain Games**: Unlike traditional games where blockchain is merely a payment or ownership layer, the game logic itself lives entirely onchain. This showcases the potential of blockchain as a compute platform, not just a database.

**Seamless Authentication**: The Cartridge Controller provides one-click authentication without complex wallet setups, demonstrating that web3 gaming can match or exceed the UX of traditional web2 experiences.

**Cryptographic Replay Protection**: The implementation uses ECDSA signature verification to create a zero-knowledge-style proof system where quest answers never appear on-chain, yet solutions can be verified cryptographically. This prevents players from copying each other's answers while ensuring fair play—a critical requirement for competitive multi-day gaming experiences.

**Cross-Chain Infrastructure**: Showcases Starknet L2 technology and the Dojo game engine, introducing attendees to cutting-edge Ethereum scaling solutions through hands-on interaction.

**Dynamic On-Chain State**: The adventure map itself is represented as an on-chain NFT that dynamically updates as players progress, demonstrating real-time on-chain state management and creating a tangible, collectible record of the player's journey.

## Implementation

### Overall Architecture

The adventure consists of **six progressive levels** alternating between two types of challenges:

**Onchain Game Levels (Levels 1, 3, 5)**
- Players "mint" an instance of an embeddable game developed by Provable Games or other Dojo ecosystem team
- Players must successfully complete the game to advance to the next level
- Game instances are isolated per player to prevent interference

**Community Hub Quest Levels (Levels 2, 4, 6)**
- Interactive quests hosted at community hub spaces throughout the venue
- Dashboard reveals clues to which community hub hosts each quest when the level is reached
- Quest designs emphasize game-like interactions, story elements, and pattern recognition
- Quest activities engage community hub members and create collaborative moments

### Technical Stack

**Frontend**
- Browser-based adventure dashboard serving as the player interface
- Real-time progress tracking and level unlocking
- Integrated Cartridge Controller authentication

**Backend**
- Dojo application providing source-of-truth for player progress
- Orchestration layer for minting game instances
- Event logging and analytics

**Smart Contracts**
- Game logic contracts deployed on Starknet
- Progress tracking and verification contracts
- Dynamic NFT contract for adventure map that updates as players progress
- Replay protection implementation (see Security section)

### Player Journey

1. **Discovery**: Scan QR code at entry points throughout venue
2. **Onboarding**: One-click authentication via Cartridge Controller
3. **Level 1**: Complete first onchain game challenge
4. **Level 2**: Receive clue to community hub, complete quest
5. **Level 3**: Complete second onchain game challenge
6. **Level 4**: Discover and complete second community hub quest
7. **Level 5**: Complete third onchain game challenge
8. **Level 6**: Find and solve final community hub quest
9. **Completion**: Adventure dashboard confirms completion and reveals any reward details

### Community Hub Quest Design

While specific quest designs are still under development, the quests will:
- Emphasize game-like narratives, interactive elements, and storytelling over math-heavy puzzles
- Integrate crypto/Ethereum themes relevant to the hosting community hub when possible
- Require 10-15 minutes of engagement per quest
- Be accessible to varying skill levels (with optional hints available via dashboard)
- Create opportunities for community hub members to engage with adventurers
- Incorporate elements of pattern recognition, narrative-following, and creative problem-solving
- Be designed to work in public community spaces without requiring dedicated private rooms

Potential puzzle mechanics may include:
- Printing a QR code on a business card given to community hub organizers, who reveal it to participants after solving a riddle.
- Hiding the puzzle answer in the title of a book in a library, with the correct book changing over the course of the day.

### [POTENTIALLY] Culminating Event

If bandwidth and timing allows, we propose to invite all participants who complete the adventure to an IRL event at the end of Devconnect. The IRL event serves multiple purposes:
- Rewards high-engagement participants
- Creates a community moment for adventurers to meet and share experiences
- Provides additional activation opportunity for sponsors/partners
- Generates memorable conclusion to the gaming adventure experience

### Replay Protection

The adventure implements cryptographic replay protection through a player-bound signature scheme that prevents users from submitting other players' answers.
This is essential for maintaining fair competition in a multi-day, asynchronous gaming experience where hundreds of participants may be at different stages simultaneously.

Each quest solution is deterministically converted into an Ethereum private key, and the corresponding address is stored on-chain as a commitment to the correct answer.

When a player submits a solution, they must sign their own Ethereum address using the solution-derived private key.
The smart contract verifies this signature using `ecrecover`, confirming both that the player knows the solution and that the signature was created specifically for their address.
This cryptographic binding ensures signatures cannot be replayed across different player accounts.

This design is drawn directly from Social Dist0rtion Protocol's [Treasure Hunt Challenge (THC) framework](https://github.com/social-dist0rtion-protocol/thc).

## Operational Requirements & Ownership

### Team & Responsibilities

**Technical Lead**: Daniel Kronovet
- Overall architecture and technical implementation
- Smart contract development and security
- Integration with Cartridge/Dojo ecosystem

**Cartridge Team**: Logistics, marketing, and production
- Community hub quest design and coordination
- Community hub outreach and relationship management
- Marketing materials and communication strategy
- Day-of operations and troubleshooting

### Venue and Resource Requirements

The adventure is designed to leverage **community hub spaces** as quest locations, working within space constraints while creating valuable engagement opportunities:

**Community Hub Partnership Approach**
- Three community hub spaces will host the quest levels (levels 2, 4, 6)
- Quest designs adapted to work in public community areas without requiring private rooms
- Creates foot traffic and engagement opportunities for community hubs
- Community hub members can observe, assist, or participate in quest activities
- Flexible quest designs that work with varying space configurations

### Resource Requirements from DevConnect Organizers

**Community Hub Coordination**
- Introduction to 3 community hub organizers willing to host quest levels
- Support for partnership conversations and logistics coordination
- Guidelines on community hub technical capabilities (power, WiFi, display options)

**Operational Support**
- Coordination on community hub schedules and availability
- On-site contact for troubleshooting during event
- WiFi connectivity for smart contract interaction

**Communication Support**
- Feature in DevConnect progressive web application for discoverability
- Social media promotion leading up to and during event
- Inclusion in official event communications

### Integration & Collaboration

The Cartridge team welcomes collaboration with other Starknet-based onchain games and ecosystem projects.
Potential integration points:

**Quest Integration with Larger Devconnect Activation**
- This adventure may integrate with broader DevConnect quest activations
- Open to collaborative quest design with community hub partners
- Quest completion could count toward other DevConnect achievement systems

**FOCG Ecosystem Collaboration**
- Other FOCG projects could be featured as additional game levels
- Community-created quest content could be incorporated with proper review
- Achievement NFTs could integrate with existing Starknet NFT standards

### Budget and Timeline

**This activation will require no external budget.**

Given the relatively short amount of time before Devconnect (<4 weeks), successfully executing on this project will require a tight scope. Design and development of the adventure will be led by myself in my capacity as Cartridge Developer Relations. I have 6 years of experience with smart contract development and have high confidence that a 6-stage adventure is realistic to implement in our time frame.

**Contingency**: If development challenges arise, we can scale down to 4 levels (2 onchain games, 2 community hub quests) while maintaining the core experience and demonstration of Cartridge/Dojo capabilities.

Given that this activation is meant to primarily highlight the capabilities of the Cartridge/Dojo gaming stack, **we are not asking for any budget** apart from communications and logistical support and introductions to community hubs.

## Links & Additional Information

**Forum Discussion**: https://forum.devcon.org/t/focg-treasure-hunt/8099

**Cartridge Ecosystem**: https://cartridge.gg

**Dojo Engine**: https://dojoengine.org

**Related Experience**: I have contributed to the past activations by [Daedalus.industries](https://daedalus.industries/#projects) and [Social Dist0rtion Protocol](https://www.dist0rtion.com/), including:
- ETHBerlin Zwei "The Spy Who Staked Me"
- Devcon VI SEA "Sybil Defense"

**Contact**:
For questions, collaboration opportunities, or detailed budget information, please reach out to krono@cartridge.gg
