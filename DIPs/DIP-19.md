---
DIP: 19
Title: Hosting DevCon Archive Videos on Swarm via Etherna
Status: Draft
Themes: Virtual Experience, Website, Community Involvement
Tags: Software, Event Operations, Communications
Authors: Costanza Gallo costanza@ethswarm.org
Resources Required: Operation support
Discussion: https://forum.devcon.org/t/host-devcon-videos-on-swarm-etherna/585/6
Created: 2023-08-26
---

# Summary of Proposal

This DIP is to host DevCon Archive Videos on Swarm, via Etherna, in addition to the current video hosting providers.

# Abstract

Swarm is a decentralized storage and communication system that was incubated by the Ethereum Foundation.

Etherna is a video platform using Swarm as storage,

This DIP has one proposal: to add DevCon Archive Video hosted on Swarm / Etherna to the current offering Youtube/IPFS.



# Motivation & Rationale

Implementing this DIP would give users who want to watch DevCon videos more options to choose from. Moreover, it would grow the ecosystem of dApps.

# Implementation

__Below are some useful prompts__

- Has any part of this proposal been implemented at other events? If so, please describe how it went.
Not yet. 

- Do you require feedback or data from attendees post-event?
No.

# Operational Requirements & Ownership

__Please answer questions below:__

## 1. What actions are required to implement the proposal at Devcon?


#### Etherna public release (July/early August) - Required.

Here will be possible to start upload videos and test the platform.
This point already offer capability to embed any uploaded video on external pages.
The offered gateway architecture is balanced on different Bee nodes, and content is provided worldwide with a CDN.

#### Pinning implementation (end of August) - Nice to have

This is needed for be able to offer data even if Swarm garbage collect them. Best to have, even if Swarm pinning could be managed at any time after the upload.

#### Update Postage Stamps management (August-September) - Nice to have

Currently every user has a single postage stamp for every upload. We want to update this, and create a new postage stamp for each upload group. In this way a single video, it's encoded versions, it's thumbnail ecc, would be uploaded with the same postage stamp, and every group with a different one. This offer a better granularity when postage stamps need to be renewed.

#### Test and devs for remove arbitrary limit of 500MB upload (end of September) - Nice to have 

Currently an arbitrary limit of 500MB for uploaded file size has been implemented.
More tests have to been done, and probably a gateway component (interceptor) will need to be rewrited with a different technology (migrate from Nginx to a reverse proxy implemented with .Net). Anyway in this phase videos are still manually encoded, and compression can be adjusted accordly.



## 2. Who will be responsible for the proposal to be implemented effectively? 
Etherna will be responsible for the implementation of this proposal. 
Swarm will advise Etherna in the development of the project. 

The following people will work to bring the proposal to life:

#### Etherna

Mirko Da Corte will be the technical lead and backend dev.

Mattia Dalzocchio will be the UX engineer and frontend dev.

Federico Cicciarella will be the backend dev.


#### Swarm

Attila Gazsó will be the technical lead.

Črt Ahlin will be the advisor.

Antonio Gonzalo will be responsible for the external communication of the project.

Costanza Gallo will act as the bridge between the DevCon team, the Swarm Association and Etherna.


## 3. What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))
This is a joint project between Swarm and Etherna. 

