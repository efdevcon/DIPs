---
DIP: 43
Title: Integration of Reclaim Protocol for Nationality Verification
Status: Draft
Themes: Ticketing, Purchases & ID
Instances: Devcon7
Tags: Event Operations, Event Production, Software
Authors: Roman Prohorenko (roman@creatoros.co), Rohit Goswami (@rohit-goswami)
Resources Required: Software development, operations Support and tech support
Discussion: https://forum.devcon.org/t/integration-of-reclaim-protocol-for-identity-verification/3750
Created: 2024-07-29
---

## Summary of Proposal
 Integrating Reclaim Protocol to verify Identity, offering nationality-based discounts and exclusive access to specific community events. This enhances event inclusivity and ensures secure, decentralized verification, enriching the overall Devcon 7 experience.

## Abstract
This proposal recommends integrating Reclaim Protocol to enhance attendee verification and inclusivity. Our solution offers multiple options for verifying nationality, providing flexibility and speeding up the process to just a few seconds. 

By leveraging zkTLS infrastructure, attendees can securely verify their nationality without revealing additional personal data or installing apps. This streamlined approach facilitates nationality-based discounts and exclusive event access, making ticketing and verification seamless for both crypto-native and non-crypto attendees. This ease of use is expected to attract new users to the Ethereum ecosystem, boosting engagement and expanding the community.

## Motivation & Rationale
Integrating Reclaim Protocol for Identity Verification ensures a secure and inclusive experience:

1. **Enhanced Security:** zkTLS allows Identity verification without disclosing additional personal data, safeguarding privacy.
2. **User-Friendly:** Credentials are generated quickly and easily without requiring extra apps.
3. **Flexible Verification:** Multiple verification options provide users with more choices, and the process is completed in seconds.
4. **Inclusive Benefits:** Nationality-based discounts and exclusive event access promote diversity.
5. **Broad Appeal:** Simplified Identity verification attract both crypto-native and non-crypto users, expanding the Ethereum ecosystem and engaging more participants.

This integration enhances the event experience while emphasizing security, privacy, and inclusivity.

## Implementation
- We will host a website similar to demo.reclaimprotocol.org
- User will be asked to login into a website to generate credentials or Aadhaar website in case of Indians to generate a proof of their identity number.
- Please find the protocol definition [here](https://link.reclaimprotocol.org/whitepaper-draft)

## Operational Requirements & Ownership

- **Development and Maintenance**: Reclaim Protocol and Devcon technical teams.
- **Backend Infrastructure**: Provided by Reclaim team and managed by Devcon team, including the database and verification services.
- **User Support**: Provided by Devcon support team for any issues related to the discount claim process.

## Links & Additional Information
[Reclaim Protocol Website](https://www.reclaimprotocol.org/)
[GitHub](https://github.com/reclaimprotocol)
[Twitter](https://x.com/reclaimprotocol)