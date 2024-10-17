---
DIP: 59
Title: DAO Confession Booth 
Status: Draft
Themes: Freeform
Tags: Event Production, Programming, On-site Experience
Instances: Devcon7
Authors: amy@raw-haus.co
Resources Required: Physical space at venue, small tech support at set-up (plugs, wifi)
Discussion: https://forum.devcon.org/t/dao-confession-booth/5145
Created: 2024-10-16
---

## Summary of Proposal
We’re really excited to propose the “DAO Confession Booth,” is a sacred space crafted for weary souls of DAO operators. Participants are invited to share their raw DAO experiences in an anon friendly way. The DAO Confession Booth acts as a sensemaker by taking the individual stories, anonymizing and analyzing into a dataset, and outputting collective themes and challenges (live!). The booth is standalone, doesn’t require oversight, but is a fun experience for Devcon attendees to participate in, all while contributing to research. The DAO Confession Booth was originally activated at MCON III. We would love to bring it to Devcon to add more stories!

## Abstract
The Experience (Fun Version)
Imagine a scene: tucked away in the bustling lounge, a particularly curious DAO summoner stumbles upon a dark wooden booth, bathed in a soft, mysterious glow. The booth is small, intimate, just enough space for one soul seeking solace.
On its side panel, three masks hang in a silent invitation, each one a promise of anonymity. Above them, a sign in dark, elegant script: “Come, child. Enter our ETHereal chamber where anonymity is your only companion. You are alone with your secrets and its your choice to reveal them—or keep them locked away forever. Choose a mask, if you wish.”
Drawn by an irresistible curiosity, the participant pushes aside the floor-length red curtains, the fabric heavy with the weight of unspoken secrets. A simple stool awaits, and the only light comes from two flickering red candles, their flames dancing in the darkness. The space is confined, but it hums with a sense of quiet knowledge, as if it holds within it the confessions of a thousand delegate souls. Across the stool is a small screen at eye level with a microphone and a keyboard underneath.
An image of an elder, wise man appears - “Father Governance”. His presence is both calming and worn, an ancient algorithm that has seen the rise and fall of countless decentralized projects. He speaks:

"Welcome, my child, to the DAO Confession Booth, where the burdens of your on-chain and off-chain sins can be lifted. I am Father Governance, the keeper of Shamir’s secrets, the guardian of confessions. Here, you are Safe to speak freely, free from judgment by peers, investors, or the relentless demands of telegram messages. Unleash your truth.”

You press “speak” to start your digital whispers or press “type” type away your sins.

The Experience (Technical Explainer)
In the booth, participants make a “confession” about their experience in DAOs. Their confession is recorded (through voice or text) through our UI and is added to an anonymized dataset and analyzed by coordination.network 1’s LLM pipeline, which categorizes the experiences into collective themes and displays them in real time. (Important: the voice recording is NOT saved. The voice is transcribed on a server only accessible by one of the coordination.network team and the transcription is analyzed into categories. Future iterations will also explore maximising the use of local processing.)

## Motivation & Rationale
Conferences can be overstimulating at times, but fun experiences that attendees can do on solo at their time can spark curiousity and make "conference work time" feel less intensive. 
The booth is standalone, doesn’t require oversight, but is a fun experience for Devcon attendees to participate in, all while contributing to research.
By making the experience more human-approachable while obfuscating an individual's contribution via an anonymized dataset, we help preserve a contributor's anonymity while still providing output for the greater collective. We're hoping these outputs help accelerate research, coordination and resource allocation for DAO solutions!

## Implementation
Booth & Specs
See: https://forum.devcon.org/t/dao-confession-booth/5145#p-9955-implementation-5

Video: 
https://x.com/itsamyjung/status/1839367762470371649

At MCON, we built the whole thing in 2.5 weeks, so for Devcon, we’d like to improve V1 with:

- Better explainer of how the booth works
- Improvements to current UX and UI
- Mobile friendly version (and submit on your phone) in case booth is busy or down
- Offline Solution


## Operational Requirements & Ownership
1. What actions are required to implement the proposal at Devcon(nect)? 
From the Devcon team, we need:
- An assigned area for the booth. (We’re fairly flexible. Maybe ideally next to the governance community hub)
- 1 plug to charge the Ipad
- 1 black stool or chair (we can also source our own if necessary)
- Strong wifi area, but we will also have backups :slight_smile:
- (Optional) Local booth fabrication/builder recommendation: we also will have some leads, but would be happy to take any recommendation or builders already building at Devcon venue, especially local folks.
- (Optional) Monitor or screen to display real time themes / outputs.

### Requested Budget:

Update: We were able to get $3K through grants/donations and confirmed Devcon organizers can fund the $1K! 

|  | **Budget** | **Additional Notes** |
| --- | --- | --- |
| Booth fabrication | $1,000 USD | Includes materials and costs (curtains, lights, wood, painting, etc) |
| Esim | $21 USD | Serve as a backup in the booth in case wifi is down or cuts out |
| Dev work  | $3,000 USD | Includes mobile and offline version, and improvements to current UX and UI  |
| **TOTAL** | **$4,021 USD** |  |


2. Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)
Amy

3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))
This project is already a collaboration with a few projects:
Martin & Max (Coordination.network)
Amy (Contributed to Devcon via Design/Usability track, UX Audits/UX Awards, etc)
Damu & Carlos (BuidlGuidl)
Yalor and Stacey (seeded the original idea and making it come true at MCON!)

and since our forum post, a few people have reached out in wanting to add to the research/experience!
