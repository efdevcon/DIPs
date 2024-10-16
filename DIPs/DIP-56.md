---
DIP: 56
Title: Social Stereo 
Status: Draft
Themes: Art & Beauty, Community Involvement, Social
Tags: zupass, music, karaoke, operations, EAS
Instances: ["Devcon7"] 
Authors: petra@circledot.tech
Resources Required: Physical space at the venue, Operations Support.  
Discussion: https://forum.devcon.org/t/dip-49-social-stereo/4354
Created: 2024-09-28
---

## Summary of Proposal

We propose the creation of Social Stereo, an interactive music and art instance at DevCon SEA that leverages a vouching system and enhances attendee engagement through a gamified experience using Zupass and Web of Trust systems. Social Stereo aims to empower the community by allowing trusted members to curate DJ slots, attest to the songs they enjoy, and vouch for various art pieces submitted by the community. This initiative encompasses
* Community Curation: encompassing a decentralized playlist and museum for digital art, and DJs.
* Karaoke - Cut the Line Pass: a gamified queue where attendees can use a pass to skip the line.

Additionally, Social Stereo will create two digital artifacts representing the music from DevCon SEA: a collection from DJ sets and a curated list of songs from the decentralized playlist, forming a digital archaeological piece for future reference.

---

## Abstract

Social Stereo is designed to enrich the DevCon SEA experience by integrating music and art activities. By utilizing their DJ Score and Singing Score, attendees can earn exclusive privileges such as booking DJ slots, gaining priority access to karaoke sessions, and participating in community-driven curation of playlists and art exhibits. This approach not only enhances real-time interactions but also extends the collaborative spirit of DevCon SEA into the broader Ethereum ecosystem by integrating multiple components of the stack.


## Motivation & Rationale

Music and art are pivotal in creating memorable and engaging community events. By decentralizing the selection and management of DJ slots, karaoke participation, and community-curated content, we empower attendees to take an active role in shaping the event’s cultural landscape. This decentralization aligns with the core principles of the Ethereum ecosystem, promoting trust, transparency, and community-driven initiatives.

Implementing Social Stereo addresses the need for scalable and resilient engagement models at large-scale events like DevCon SEA. By leveraging Stamp’s Web of Trust infrastructure, we ensure that privileges are granted based on community trust and active participation, fostering a more connected and dynamic environment.


## Specification

### Attestation Mechanism

* Ethereum Attestation Service (EAS): Utilize EAS to create and manage public vouchers for attendees, forming the basis of the Web of Trust.
* Web of Trust Construction: Aggregate attestations to form a graph-based Web of Trust, calculating each user’s trust score using the Eigen algorithm open-sourced by Open Rank.

### Trust Score Calculation

* Algorithm: Implement a weighted algorithm that factors in the trustworthiness of attestors and the recency of attestations.
* Dynamic Updates: Continuously update trust scores as new attestations are added or removed to reflect the current state of the community.

### Privacy Preservation

* Data Minimization: Store only essential information on-chain to protect user privacy.
* Selective Disclosure: Allow users to control which aspects of their trust score and attestations are shared with third-party services.

## Features

### Decentralized DJs

* Pre DevCon Selection:
  * Top DJs Selection: Before DevCon SEA, the top three DJs will be selected based on their Rank Score.
  * Criteria: Rank Score will be determined by the number and quality of attestations received, reflecting the community’s trust in each DJ.
* On-site DJ Booking:
  * Threshold-Based Access: During DevCon SEA, attendees who achieve a specific trust score threshold can book a DJ slot.
  * First Come, First Served: DJ slots will be allocated on a first-come, first-served basis once the threshold is met, ensuring fairness and encouraging active participation.

### Karaoke - Cut the Line Pass

* POD Pass Submission:
  * One-Time Submission: Attendees holding a DevCon Cut the Line Pass can submit their POD pass once to gain priority access to karaoke sessions.
  * Pseudo Manual Processing: Submissions will be handled in a semi-automated manner to maintain engagement and manage the queue effectively.
* Interactive Queue System:
  * Sound Notification: A DJ will trigger a sound notification each time a karaoke submission is made, enhancing the interactive experience.
  * Queue Management: A dynamic queue system will be implemented to make the process engaging and transparent, allowing attendees to see their position in real time.

### Community Curation

#### Decentralized Playlist

* Vouching for Songs:
  * User Vouching: Attendees can vouch for their favorite songs, contributing to a community-curated playlist.
  * Non-Web of Trust Mechanism: Unlike user-to-user attestations, song vouching operates independently, as songs cannot vouch for each other.
* Music Selection Criteria:
  * Web3/CC0 Music Only: Define whether only Web3-compatible or CC0-licensed music is allowed to ensure legal and decentralized usage.
  * Open Voting: Alternatively, allow voting on any song, with the understanding that the selected item must be manually played by DJs, ensuring flexibility and diversity in the playlist.

#### Decentralized Museum

* Art Piece Submission:
  * Community Submissions: Attendees can submit art pieces to be featured in a decentralized museum display.
* Vouching for Art:
  * User Vouching: Community members can vouch for their favorite art pieces, helping to curate a diverse and high-quality collection.
* Exhibition Criteria:
  * Quality and Diversity: Ensure that submitted art meets certain quality standards and represents diverse artistic expressions within the community.

### Digital Artifacts

* Music Collection Artifact: DJ Sets Compilation: An NFT collection of music from the DJ sets performed at DevCon SEA, preserving the event’s musical legacy.
* Playlist Artifact: Decentralized Playlist Compilation: A comprehensive list of songs from the community-curated decentralized playlist, serving as a digital archeological piece for future reference.

These artifacts will serve as a lasting representation of the cultural and artistic contributions made during DevCon SEA, showcasing the collaborative efforts of the community.

---

## Implementation

### Technical Stack

* Ethereum Attestation Service (EAS): For creating and managing attestations. We utilize delegated attestations to enhance user experience.
* Zupass POD: To handle credential generation and interoperability.
* OpenRank: EigenTrust algorithm

### Development Phases

1. Prototype Development: Build the initial version of Stmap Network, integrating EAS and Zupass POD for trust score and credential management.
2. Testing: Conduct thorough testing within a controlled environment to ensure functionality, security, and scalability.
This is being discussed among DevCon SEA art and music group (Alaska and Shakka), Zupass (@rrrliu ), and Stamp (@0xPetra, @marto and Mati).

## Summary of Proposal

We propose the creation of Social Stereo, an interactive music and art instance at DevCon SEA that leverages a vouching system and enhances attendee engagement through a gamified experience using Zupass and Web of Trust systems. Social Stereo aims to empower the community by allowing trusted members to curate DJ slots, attest to the songs they enjoy, and vouch for various art pieces submitted by the community. This initiative encompasses
* Community Curation: encompassing a decentralized playlist and museum for digital art, and DJs.
* Karaoke - Cut the Line Pass: a gamified queue where attendees can use a pass to skip the line.

Additionally, Social Stereo will create two digital artifacts representing the music from DevCon SEA: a collection from DJ sets and a curated list of songs from the decentralized playlist, forming a digital archaeological piece for future reference.

---

## Abstract

Social Stereo is designed to enrich the DevCon SEA experience by integrating music and art activities. By utilizing their DJ Score and Singing Score, attendees can earn exclusive privileges such as booking DJ slots, gaining priority access to karaoke sessions, and participating in community-driven curation of playlists and art exhibits. This approach not only enhances real-time interactions but also extends the collaborative spirit of DevCon SEA into the broader Ethereum ecosystem by integrating multiple components of the stack.

---

## Motivation & Rationale

Music and art are pivotal in creating memorable and engaging community events. By decentralizing the selection and management of DJ slots, karaoke participation, and community-curated content, we empower attendees to take an active role in shaping the event’s cultural landscape. This decentralization aligns with the core principles of the Ethereum ecosystem, promoting trust, transparency, and community-driven initiatives.

Implementing Social Stereo addresses the need for scalable and resilient engagement models at large-scale events like DevCon SEA. By leveraging Stamp’s Web of Trust infrastructure, we ensure that privileges are granted based on community trust and active participation, fostering a more connected and dynamic environment.

---

## Specification

### Attestation Mechanism

* Ethereum Attestation Service (EAS): Utilize EAS to create and manage public vouchers for attendees, forming the basis of the Web of Trust.
* Web of Trust Construction: Aggregate attestations to form a graph-based Web of Trust, calculating each user’s trust score using the Eigen algorithm open-sourced by Open Rank.

### Trust Score Calculation

* Algorithm: Implement a weighted algorithm that factors in the trustworthiness of attestors and the recency of attestations.
* Dynamic Updates: Continuously update trust scores as new attestations are added or removed to reflect the current state of the community.

### Privacy Preservation

* Data Minimization: Store only essential information on-chain to protect user privacy.
* Selective Disclosure: Allow users to control which aspects of their trust score and attestations are shared with third-party services.

## Features

### Decentralized DJs

* Pre DevCon Selection:
  * Top DJs Selection: Before DevCon SEA, the top three DJs will be selected based on their Rank Score.
  * Criteria: Rank Score will be determined by the number and quality of attestations received, reflecting the community’s trust in each DJ.
* On-site DJ Booking:
  * Threshold-Based Access: During DevCon SEA, attendees who achieve a specific trust score threshold can book a DJ slot.
  * First Come, First Served: DJ slots will be allocated on a first-come, first-served basis once the threshold is met, ensuring fairness and encouraging active participation.

### Karaoke - Cut the Line Pass

* POD Pass Submission:
  * One-Time Submission: Attendees holding a DevCon Cut the Line Pass can submit their POD pass once to gain priority access to karaoke sessions.
  * Pseudo Manual Processing: Submissions will be handled in a semi-automated manner to maintain engagement and manage the queue effectively.
* Interactive Queue System:
  * Sound Notification: A DJ will trigger a sound notification each time a karaoke submission is made, enhancing the interactive experience.
  * Queue Management: A dynamic queue system will be implemented to make the process engaging and transparent, allowing attendees to see their position in real time.

### Community Curation

#### Decentralized Playlist

* Vouching for Songs:
  * User Vouching: Attendees can vouch for their favorite songs, contributing to a community-curated playlist.
  * Non-Web of Trust Mechanism: Unlike user-to-user attestations, song vouching operates independently, as songs cannot vouch for each other.
* Music Selection Criteria:
  * Web3/CC0 Music Only: Define whether only Web3-compatible or CC0-licensed music is allowed to ensure legal and decentralized usage.
  * Open Voting: Alternatively, allow voting on any song, with the understanding that the selected item must be manually played by DJs, ensuring flexibility and diversity in the playlist.

#### Decentralized Museum

* Art Piece Submission:
  * Community Submissions: Attendees can submit art pieces to be featured in a decentralized museum display.
* Vouching for Art:
  * User Vouching: Community members can vouch for their favorite art pieces, helping to curate a diverse and high-quality collection.
* Exhibition Criteria:
  * Quality and Diversity: Ensure that submitted art meets certain quality standards and represents diverse artistic expressions within the community.

### Digital Artifacts

* Music Collection Artifact: DJ Sets Compilation: An NFT collection of music from the DJ sets performed at DevCon SEA, preserving the event’s musical legacy.
* Playlist Artifact: Decentralized Playlist Compilation: A comprehensive list of songs from the community-curated decentralized playlist, serving as a digital archeological piece for future reference.

These artifacts will serve as a lasting representation of the cultural and artistic contributions made during DevCon SEA, showcasing the collaborative efforts of the community.


## Implementation

### Technical Stack

* Ethereum Attestation Service (EAS): For creating and managing attestations. We utilize delegated attestations to enhance user experience.
* Zupass POD: To handle credential generation and interoperability.
* OpenRank: EigenTrust algorithm

### Development Phases

1. Prototype Development: Build the initial version of Stmap Network, integrating EAS and Zupass POD for trust score and credential management.
2. Testing: Conduct thorough testing within a controlled environment to ensure functionality, security, and scalability.
3. Deployment: Launch Social Stereo’s features at DevCon SEA, enabling attendees to start earning DPPs and accessing privileges.
3. Deployment: Launch Social Stereo’s features at DevCon SEA, enabling attendees to start interacting with Zupass.
4. Integration: Expand Social Stereo’s functionalities based on feedback and integrate with other Ethereum projects for broader ecosystem adoption.

---

## Links & Additional Information

* Alpha Environment:[ https://app.stamp.network](https://app.stamp.network)
* Ethereum Attestation Service:[ https://docs.eas.org/](https://docs.eas.org/)
* Zupass POD Documentation:[ https://github.com/proofcarryingdata/zupass/](https://github.com/proofcarryingdata/zupass/)
* Eigen Algorithm:[ https://docs.openrank.com/the-reputation-stack/openrank-protocol](https://docs.openrank.com/the-reputation-stack/openrank-protocol)

---

## Conclusion

Social Stereo aims to transform the DevCon SEA experience by integrating decentralized music and art activities that are governed by community trust and active participation. By leveraging DevCon’s community, we create an inclusive and engaging environment where attendees can shape the cultural landscape of the event through Decentralized DJs, Community Curation, and Karaoke - Cut the Line Pass. Additionally, the creation of digital artifacts will preserve the event’s musical and artistic legacy for the future. This initiative not only enhances attendee interaction but also reinforces the decentralized and collaborative spirit of the Ethereum ecosystem. We invite the DevCon community to join us in bringing Social Stereo to life and setting a new standard for community-driven events.

[EXTENSION]

### DevCon Power Pack (DPP)

### Summary

We propose the implementation of a Web of Trust at DevCon, enabling attendees to vouch for each other through attestations. These attestations will form a decentralized Web of Trust that extends beyond DevCon, integrating seamlessly with the entire Ethereum ecosystem. Utilizing this Web of Trust, we will calculate a trust score for each user, which can unlock the ability to generate a Zupass credential (POD). This credential, referred to as the DevCon Power Pack (DPP), will grant various benefits in a permissionless manner while preserving user privacy.

## Abstract

The DevCon Web of Trust aims to create a robust, decentralized trust model for the Ethereum community by leveraging real-world interactions at DevCon. Initially conceptualized as a tool for Zuzalu’s curation and invitation system, the Web of Trust facilitates organic and controlled community growth through peer attestations. By allowing existing community members to vouch for newcomers, we ensure traceability and maintain the integrity of the community.

Zupass’ Provable Object Data (POD) serves as the interoperability layer, enabling multiple projects to verify the validity of a DPP with high privacy guarantees. This interconnectedness fosters a cohesive ecosystem where trust can be universally recognized and utilized across various platforms and services, onchain and offchain.

This initiative is an iteration from https://devcon-vi.attest.tickets/, with the main difference that we can enable privacy and showcase how Zupass can enable interoperability between different parts, and making it in a gamified way, where users can learn about Web of Trust systems.

## Etherean Power Pack Benefits

The Etherean Power Pack (DPP) will offer a range of benefits to its holders, including:
* Faucet Access: Priority access to faucets for testnets and other resources.
* E-Sim Discount: Exclusive discounts on chips for seamless connectivity.
* Event Perks: Discounts and special access to future DevCon events and other Ethereum gatherings.
* Exclusive Content: Access to premium content, workshops, and educational materials.
* Partner Benefits: Special offers and services from partnering projects within the Ethereum ecosystem.
