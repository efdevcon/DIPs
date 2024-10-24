---
DIP: 39
Title: Integration of zkPassport for SEA builder discounts
Status: Accepted
Themes: Ticketing, Purchases & ID
Instances: Devcon7
Tags: Software
Authors: Michael Elliot (@michaelelliot), Théo Madzou (@madztheo)
Discussion: https://forum.devcon.org/t/dip-39-integration-of-zkpassport-for-sea-builder-discounts/3621
Created: 2024-06-08
---

## Summary of Proposal
This proposal introduces a zkPassport integration for Devcon in Bangkok, enabling SEA citizens to prove their nationality using zero-knowledge proofs and access ticket discounts in a privacy-preserving way. This improves the user experience and eliminates the need to share sensitive identity documents.

## Abstract
The integration enables citizens of SEA to use zkPassport to generate a zero-knowledge proof of their nationality without revealing additional personal information, facilitating a secure and private way to obtain discounted tickets.

## Motivation & Rationale
To provide a privacy-preserving method for citizens of SEA to claim Devcon ticket discounts, avoiding the need for sharing sensitive identity documents. This method ensures only citizens of SEA can access the discount, using zero-knowledge proofs to protect personal information.

## Implementation
**High Level User Flow**:
1. Users scan their ePassport via NFC into the zkPassport app.
2. On the Devcon ticket ordering site, users click a button to generate a unique QR code containing the credentials to prove (their nationality) and a callback URL.
3. Users scan this QR code, which opens the zkPassport app and prompts the user to prove the requested credentials (their nationality).
4. The user accepts, and a proof is generated locally on their phone, and submitted to the callback URL.
5. Backend verifies the proof, checks the `discount_codes` table, and returns a discount code if valid.

**Circuit Public Inputs**:
- Nationality (expected to be in the set of SEA countries)
- Merkle Root (of valid DSC public keys Merkle tree)
- Nullifier Scope (expected to be a hash of devcon.org)

**Circuit Private Inputs**:
- DG1 (Data Group 1, containing the nationality)
- Data Group Hashes (from the SOD)
- Signed Attributes i.e. Hash of Data Group Hashes (from the SOD)
- RSA Signature of Signed Attributes (from the SOD)
- RSA Public Key
- Merkle Index
- Merkle Hash Path

**Circuit Outputs**:
- Proof of Person Identifier (nullifier)

**Circuit Steps**:
- Nationality public input is checked for inclusion in DG1 private input.
- The SHA2 hash of DG1 is calculated and checked for inclusion in Data Group Hashes private input.
- The SHA2 hash of the Data Group Hashes is calculated and compared against the Signed Attributes private input.
- The RSA Signature of Signed Attributes private input is verified using the RSA Public Key private input.
- The poseidon hash of the Signature Algorithm + RSA Public Key is calculated and checked for inclusion in the Merkle tree of valid DSC public keys, using the Merkle Root public input, and the Merkle Index and Merkle Hash Path private inputs.
- A unique Proof of Person Identifier (nullifier) is generated from the RSA Signature of Signed Attributes private input + the Nullifier Scope public input, and becomes a circuit output.

**Detailed User Flow**:
- User loads their ePassport into the zkPassport app by tapping it against their phone and reading the chip contents via NFC.
- On the Devcon ticket ordering website, they click a button that generates a unique QR code containing the credentials to prove (their nationality) and a callback URL.
- They scan this QR code, which opens the zkPassport app and prompts the user to prove the requested credentials (their nationality).
- They accept, and the proof is generated locally on their phone, and then submitted to the callback URL.
- On the backend, there is a Postgres db with a pre-filled `discount_codes` table containing valid discount codes for Pretix.
- On the backend, the proof is verified.
- If the proof verification fails, a `400 Invalid proof` error is returned.
- If successfully verified, a `discount_codes` table is checked to ensure the `Proof of Person Identifier` hasn't already been used to claim a discount code.
- If `Proof of Person Identifier` has already been used, a `400 Code already claimed` error is returned.
- The next available row in the `discount_codes` table (with a `date_claimed` column value of `NULL`) is then updated by setting the `date_claimed` and `claimed_by_identifier` columns to the current date and the `Proof of Person Identifier` proof output, effectively claiming that discount code for the user.
- The `code` column (pre-filled with valid codes) value for that row is returned in a JSON message as a `200 Success` response.

## Operational Requirements & Ownership
- **Development and Maintenance**: zkPassport and Devcon technical teams.
- **Backend Infrastructure**: Provided by zkPassport team and managed by Devcon team, including the database and verification services.
- **User Support**: Provided by Devcon support team for any issues related to the discount claim process.
