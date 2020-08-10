| Title              | Primary Contact    | Themes                    | Tags                | Ressources Required                        | Discussion |
| ------------------ | ------------------ | ------------------------- | ------------------- | ------------------------------------------ | ---------- |
| Keycard  at Devcon | guylouis@status.im | Ticketing, Purchases & ID | Attendee Experience | Communication support, Operational support | Tbd        |

## Summary

Status wants to offer to Devcon attendees a keycard (https://get.keycard.tech/) coming preloaded with crypto assets (e.g NFTs and ERC-20). It can be used at Devcon to easily (at the tap of a card) collect more assets, prove ownership of them, and transfer them. 

## Abstract

Keycard is an open source implementation to enable smartcards in the crypto space. The framework allows to use smartcards both as highly secure hardware wallets with one's phone, and as super simple to use (think: one tap) devices that can be tapped on someone else's phone to sign a transaction, opening up a variety of use cases.

A Devcon attendee (using Android) would be handed over a keycard when checking in at Devcon. This keycard will be printed with some indication of which assets are offered with the card. The user then can:
- download & onboard Status app. As part of this onboarding the user would import an existing or create a ethereum account
- retrieve preloaded assets that come with the card (e.g POAP token, Status SNT token that would come as a gift, etc) to the wallet of their choice 
- tap the card to partner projects to collect NFTs or prove ownership of NFTs (think: use your card to redeem some swag, or to attend a given event)
- use keycard for payments (e.g for catering). Payments may or may not be possible depending on when the event takes place in 2021
- after the show he can use keycard as secure hardware wallet with status app

The same experience can be enabled for iOS users, depending on when the event takes place in year 2021. 

## Motivation & Rationale

Bringing in a simple physical device that holds a private key (unique to each attendee) and that can sign transactions is enabling a smoother and faster user experience to interact with the blockchain. The user doesn't need to open up a wallet on his phone, or a dApp browser, he just need to tap his card on the right dApp handed over to him on a phone for instance. 

Example: project X wants to offer a NFT or ERC20 to some attendees that come on their booth, without keycard a user needs to go to a app, copy/paste his wallet address (super cumbersome) or use a web3 browser, to finally get the assets. With keycard project X can have a dApp running on one of their phone, and ask attendees to simply tap their card on the phone. 

Moreover, offering keycard will strongly incitate attendees to onboard status (to retrieve their offered preloaded assets, or to pay if payments is part of the experience) and thus other status features can be leveraged: 
- chat: channels QR code can be printed on conference rooms to enable attendees to comment the presentations 
- dapp browser: every attendee will have a web3 dapp browser in its pocket to interact with devcon dApps


## Implementation

Keycard is being mass produced (3k cards manufcatured as of 08/2020), integrated with status app, and are being sold worldwide. Keycard have however never been distributed on an event to enable the use cases above. 

For interactions with dApps (retrieving preloaded NFTs, collecting them, proving ownership of a NFT) this can be done with already existing implementations 
- a dApp running in status browser can request a transaction to be signed by any keycard tapped on the phone. see: https://keycard.tech/docs/web3.html
- existign smart contracts can be used to associate preloaded assets with keycards. see: https://github.com/status-im/keycard-redeem

For payments with keycard, for catering for instance, a layer 2 optimistic rollup network needs to be deployed. Status is currently working on this, and will be available for Devcon or not, depending on when Devcon VI is planned to happen in 2021. 

## Operational Requirements & Ownership

Devcon team needs to be involved in the following manner:
- communication support prior to the conference: 
    - identify projects that want to offer assets as part of the initial bundle of assets preloaded with each keycard (e.g POAP token)
    - communicate to projects how they can build dApps that interact with the attendees keycards 
- operational support
    - distribute cards on site 
    - if chat is used, print QR codes of chat channels and put them at the right places in the venue 

Status will:
- provide the cards
- provide the redeeming dApps for the initial bundle of assets offered with each card
- offer a number (yet to be defined) of SNT with each card part of this bundle
- provide technical material for projects to build their own dApps using keycard

Status will be responsible to make sure the following work fine: 
- download and onboard status with each keycard 
- user can redeem their bundle of free assets with keycard 

Each project will need to make sure their dApp (e.g project X wants to offer a NFT on its booth) with Keycard. Status will provide technical support though. 


## Links & Additional Information

- Keycard website: https://keycard.tech
- About keycard being integrated in Status: https://our.status.im/keycards-place-in-the-status-network/
- Keycard documentation: https://keycard.tech/docs
- Integrating Keycard with dApps: https://keycard.tech/docs/web3.html
- Status pay, for payments with keycard: https://github.com/status-im/payment-network-apps


