---
DIP: 40
Title: Integration of Anon Aadhaar for Indian builder discounts
Status: Draft
Themes: Ticketing, Purchases & ID
Instances: [Devcon7]
Tags: Software
Authors: Yanis Meziane (PSE - Anon Aadhaar)
Discussion: https://forum.devcon.org/t/dip-40-integration-of-anon-aadhaar-for-ticket-discounts-targeting-indian-citizens/3632
Created: 2024-06-19
---

## Summary of Proposal

This proposal introduces an Anon Aadhaar integration for Devcon in Bangkok, enabling Indian citizens to prove their nationality using zero-knowledge proofs and access ticket discounts in a privacy-preserving way. This improves the user experience and eliminates the need to share sensitive identity documents.

## Abstract

The integration enables citizens of India to use Anon Aadhaar, Aadhaar being the Indian identity program, to generate a zero-knowledge proof of their nationality without revealing additional personal information, facilitating a secure and private way to obtain discounted tickets.

## Motivation & Rationale

To provide a privacy-preserving method for citizens of India to claim Devcon ticket discounts, avoiding the need for sharing sensitive identity documents. This method ensures only citizens of India can access the discount, using zero-knowledge proofs to protect personal information.

## Implementation

**High Level User Flow**:

1. On the Devcon ticket ordering site, users click a button redirecting them to an Anon Aadhaar frontend.
2. Users are redirected to a web app, that prompts the user to prove the requested credentials (their nationality, optionally: age > 18, gender).
3. Users upload their Aadhaar Secure QR Code, downloaded on the mAadhaar app.
4. The user accepts to generate the proof, which is generated locally on their browser, and submitted to the callback URL.
5. Backend verifies the proof, checks the `discount_codes` table, and returns a discount code if valid.

**Circuit Public Inputs**:

- pubKey, RSA public key of the UIDAI (Indian Gov);
- nullifierSeed, a random value used as an input to compute the nullifier;
- revealAgeAbove18, flag to reveal age is above 18;
- revealGender, flag to reveal extracted gender;
- revealPinCode, flag to reveal extracted pin code;
- revealState, flag to reveal extracted state;
- signalHash, any message to commit to (to make it part of the proof);

**Circuit Private Inputs**:

- qrData, QR data (representing the ID card) without the signature;
- delimiterIndices, indices of delimiters (255) in the QR text data. 18 delimiters including photo;
- signature, RSA signature;

**Circuit Outputs**:

- pubkeyHash, Poseidon hash of the RSA public key (after merging nearby chunks);
- nullifier, A unique value derived from nullifierSeed and Aadhaar data to nullify the proof/user;
- timestamp, Timestamp of when the data was signed - extracted and converted to Unix timestamp;
- ageAbove18, Boolean flag indicating age is above 18; 0 if not revealed;
- gender, Gender 70(F) or 77(M); 0 if not revealed;
- pinCode, Pin code of the address as int; 0 if not revealed;
- state, State, packed as int (reverse order); 0 if not revealed;

**Circuit Steps**:

- Compute the sha256 hash of the qr code data.
- Verify that this hash was signed by the given public key, to authenticate the data.
- Extract data from QR:
  - Extract timestamp in UNIX UTC format
  - Extract photo
  - If set, extract ageAbove18
  - If set, extract gender
  - If set, extract pinCode
  - If set, extract state
- Compute the nullifier, by applying a Poseidon hash of the nullifierSeed and the photo.
- Applying a constraint on the signalHash value, making the proof bind to this value.

## Detailed User Flow

1. **Access the Discount Verification**:
   - On the Devcon ticket ordering website, users click a button that redirects them to the Anon Aadhaar web app.
2. **Anon Aadhaar Web App**:
   - Users are redirected to the Anon Aadhaar frontend, which prompts them to prove their nationality and optionally, their age (if over 18), gender, and location (state and pincode).
3. **Uploading Aadhaar Secure QR Code**:
   - Users upload their Aadhaar Secure QR Code, which can be downloaded from the mAadhaar app.
4. **Proof Generation**:
   - Users review and accept to generate the proof. The proof is generated locally in the user's browser, ensuring privacy and security.
   - The generated proof is then submitted to the provided callback URL on the Devcon ticket ordering site.
5. **Backend Verification**:
   - The backend server receives the proof and verifies it.
   - The verification process includes:
     - Checking the validity of the proof.
     - Checking the `nullifierSeed` value is corresponding to this action.
     - Verifying that the proof was generated from a valid Aadhaar QR code public key, by checking the `pubkeyHash`.
     - Verifying that the timestamp value is less than x minutes ago, to ensure users' have access to their UIDAI portal.
     - Ensuring the proof has not been reused by checking the `nullifier` against previous claims.
6. **Discount Code Issuance**:
   - The backend checks the `discount_codes` table in a Postgres database.
   - If the proof verification fails, a `400 Invalid proof` error is returned.
   - If the `nullifier` has already been used, a `400 Code already claimed` error is returned.
   - If the proof is valid and unique:
     - The next available row in the `discount_codes` table (with a `date_claimed` column value of `NULL`) is updated by setting the `date_claimed` and `claimed_by_nullifier` columns to the current date and the `nullifier`.
     - The `code` column value for that row is then returned in a JSON message as a `200 Success` response.
7. **Discount Code Application**:
   - The user receives the discount code from the Devcon ticket ordering site.
   - The user can then apply this discount code during the ticket purchase process to receive the discounted rate.

This flow ensures that the process is secure, privacy-preserving, and user-friendly, allowing Indian citizens to prove their nationality and claim discounts without revealing sensitive personal information.

## Operational Requirements & Ownership

- **Development and Maintenance**: Anon Aadhaar and Devcon technical teams.
- **Backend Infrastructure**: Provided by Anon Aadhaar team, but could have the same logic as zkPassport integration, and managed by Devcon team, including the database and verification services.
- **User Support**: Provided by Devcon support team for any issues related to the discount claim process.
