---
DIP: 5
Title: Keycard at Devcon
Status: Accepted
Themes: Ticketing, Purchase & ID
Tags: Attendee Experience
Authors: Guy-Louis Grau <guylouis@status.im>
Resources Required: Operational support, Communication support
Discussion: https://forum.devcon.org/t/dip-5-keycard-at-devcon/46
Created: 2020-08-10
---

## Summary

Status wants to offer to Devcon attendees a keycard (https://get.keycard.tech/). This card:
- is a hardware wallet with a face value of 29$
- helps user downloads status app, which can be used on the show
- allows any dApp developer to develop applications that interface with the card with the tap of the card on the browser 

Such a dApp could be a redeem dApp, developed by Status, this dApp allowing users to retrieve assets coming preloaded with the card on the wallet of their choice. 

## Abstract

Keycard is an open source implementation to enable smartcards in the crypto space. The framework allows to use smartcards both as highly secure hardware wallets with one's phone, and as super simple to use (think: one tap) devices that can be tapped on someone else's phone to sign a transaction, opening up a variety of use cases.

A Devcon attendee (using Android or iOS) would be handed over a keycard when checking in at Devcon. If relevant, this keycard will be printed with some indication of which assets are offered with the card. The user then can:
- download & onboard Status app. As part of this onboarding the user would import an existing or create a ethereum account
- if relevant, retrieve preloaded assets that come with the card (e.g POAP token, Status SNT token that would come as a gift, etc) to the wallet of their choice 
- tap the card to partner projects that developed a dApp interacting with the card
- after the show he can use keycard as secure hardware wallet with status app

Catering or purchases with Keycard is not considered in this proposal. 

## Motivation & Rationale

Bringing in a simple physical device that holds a private key (unique to each attendee) and that can sign transactions is enabling a smoother and faster user experience to interact with the blockchain. The user doesn't need to open up a wallet on his phone, or a dApp browser, he just need to tap his card on the right dApp handed over to him on a phone for instance. 

Moreover, offering keycard will strongly incitate attendees to onboard status (to retrieve their offered preloaded assets, or to pay if payments is part of the experience) and thus other status features can be leveraged: 
- chat: channels QR code can be printed on conference rooms to enable attendees to comment the presentations 
- dapp browser: every attendee will have a web3 dapp browser in its pocket to interact with devcon dApps


## Implementation

Keycard is being mass produced (3k cards manufactured as of 08/2020), integrated with status app, and are being sold worldwide. Keycard have however never been distributed on an event to enable the use cases above. 

For interactions with dApps (retrieving preloaded NFTs, collecting them, proving ownership of a NFT) this can be done with already existing implementations 
- a dApp running in status browser can request a transaction to be signed by any keycard tapped on the phone. see: https://keycard.tech/docs/web3.html
- existing smart contracts can be used to associate preloaded assets with keycards. see: https://github.com/status-im/keycard-redeem

## Operational Requirements & Ownership

Devcon team needs to be involved in the following manner:
- communication support prior to the conference: 
    - if redeeming of preloaded assets is proposed, then identify projects that want to offer assets as part of the initial bundle of assets preloaded with each keycard (e.g POAP token)
    - communicate to projects how they can build dApps that interact with the attendees keycards through keycard web3 API https://keycard.tech/docs/web3.html
- operational support
    - distribute cards on site 
    - if chat is used, print QR codes of chat channels and put them at the right places in the venue 

Status will:
- provide the cards
- if relevant, provide the redeeming dApps for the initial bundle of assets offered with each card
- provide technical material for projects to build their own dApps using keycard

Status can: 
- make public the list of public keys preloaded in the Keycard Cash Applet of each keycard.See: https://keycard.tech/docs/sdk/cash.html and  https://keycard.tech/docs/web3.html

Status will be responsible to make sure the following work fine: 
- download and onboard status with each keycard 
- if relevant, user can redeem their bundle of free assets with keycard 


## Links & Additional Information

- Keycard website: https://keycard.tech
- About keycard being integrated in Status: https://our.status.im/keycards-place-in-the-status-network/
- Keycard documentation: https://keycard.tech/docs
- Integrating Keycard with dApps: https://keycard.tech/docs/web3.html
- Status pay, for payments with keycard: https://github.com/status-im/payment-network-apps
