---
DIP: 44
Title: Devcon Agora application
Status: Draft
Themes: Community Involvement
Tags: Event Production
Instances: Devcon7
Authors: Sandor A. Nagy, Andras Aranyi
Resources Required: Online Software Solution, Operations Support, Communication Support, Tech Support
Discussion: https://forum.devcon.org/t/ignite-the-conversation/3724
Created: 2024-07-29
---

## Summary of Proposal

### Devcon Agora: A place for talk related community discussions

We are proposing to build a decentralized platform where you can instantly share your thoughts, ask questions, and
engage with fellow Devcon attendees. We’re building a web application (dApp) to do just that.

## Abstract

By creating a vibrant online community centered around Devcon presentations, we can:

- Amplify speaker impact: Give speakers the recognition they deserve by fostering discussion around their work.
- Enhance attendee experience: Create opportunities for meaningful connections and knowledge sharing.
- Drive innovation: Spark new ideas and collaborations through open dialogue.

We believe this decentralized platform has the potential to transform the way we interact at conferences.

## Motivation & Rationale

To provide a privacy-preserving communication platform for Devcon participants to discuss talk related ideas, thoughts
and suggestions.

The application will have features that will enhance the experience of the attendees and speakers, such as:

- ### Add notes for any of the talks

  You can add notes (to self) to any of the talks to keep track of the most important points and ideas that you want to
  remember.

- ### Comment on talks

  Anyone can comment on the talks and start an open discussion to share ideas and opinions on the topic. This will allow
  for a more interactive experience.

- ### Select talks you liked

  Put a like on the talks you liked the most or found the most interesting. You can track them and come back to see the
  discussions formed around them.

- ### Share your ideas as blog posts

  Anyone will be able to share their ideas related to any of the talks in a post that has a longer format and really
  allows to share your thoughts on the topic in a more detailed way.

## Implementation

### Building the Devcon Agora application

The application will be open-source, and you can track the implementation in
the [DevconAgora GitHub repo](https://github.com/Solar-Punk-Ltd/DevconAgora), where everyone will be welcome to observe
the code, learn about decentralized approaches and make suggestions.

#### Processing event schedule data

- To have access to the event schedule data to display the talks in the app,
  Devcon's [Pretalx API](https://docs.pretalx.org/api/resources/) will be used. It will be synced to a decentralized
  storage (Swarm) to ensure the data is always available and up to date.

#### UX design

- We will have make sure the app design is user-friendly and intuitive with a focus on event participants.
- Conducting user testing to ensure the app meets the needs of the community.

#### Developing decentralized features

- The app will be built on a decentralized infrastructure (Swarm) to ensure privacy, security and availability.
- All features, including comments, likes and notes, will be developed using natively decentralized approaches.

## Operational Requirements & Ownership

The Devcon Agora application will be developed and maintained by the Solar Punk team. The team will ensure that the app
is easily accessible, readily available and the Devcon schedule displayed is up-to-date.

Furthermore, it's a common goal that the Devcon community is informed about the application's features and how to use
it.

## Links & Additional Information

* Learn more about th Solar Punk team at: https://solarpunk.buzz
* See how Swarm works to make decentralization possible: https://www.ethswarm.org/build
