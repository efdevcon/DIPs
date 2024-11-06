---
DIP: 61
Title: Cover Devcon on Kiwi News
Status: Accepted
Themes: Social, Virtual Experience
Tags: Communications
Instances: Devcon7
Authors: mac@macbudkowski.com
Resources Required: Promotion 
Discussion: https://forum.devcon.org/t/dip-51-cover-devcon-on-kiwi-news/5200
Created: 2024-10-23
---

## Summary of Proposal

We’d like to recruit Devcon attendees to cover the most interesting Devcon links on Kiwi News so that people who couldn't make it in person can also follow the most interesting projects, ideas, and discussions from the event.

## Abstract

Kiwi is a crypto Hacker News that helps Ethereum builders find quality crypto content and meet like-minded people. We have about 1,500 monthly readers and 100+ monthly curators who submit, upvote, and comment on interesting content for Ethereum builders.

We want to give some (5-10) Devcon participants a free Pass so they can share the most interesting Devcon links (presentations, projects, repos, discussed EIPs & ERCs, Twitter posts about Devcon etc.) for those who can’t make it in person.

We would also give all conference attendees a discount by signing up with Zupass.

## Motivation & Rationale

Devcon will be a great opportunity for the Ethereum community to finally meet and learn about new projects and ideas. So, if someone attends an interesting presentation or has a good chat with the Ethereum dev, they can share some links related to the things discussed on Kiwi. We expect Devcon to be also widely discussed on social media (Twitter, Farcaster, Lens), so curators could also share these posts on Kiwi.

All Kiwi links are stored on a P2P protocol, so they are here to stay, and everyone can access them either via our client ([kiwinews.xyz](https://kiwinews.xyz/)), an alt client run by our community member ([kiwinews.lol](https://kiwinews.xyz/)) or by running a node ([github.com/attestate/kiwistand](https://github.com/attestate/kiwistand)).

We would prepare an open form where Devcon attendees with a knack for curation could apply to get a free Kiwi Pass (we plan to give 5-10, but it could be more). During Devcon, we’d also give all Devcon participants a discount to use Kiwi so that buying a Pass would cost only a few dollars.

## Implementation

We’re going to:

* have to integrate with Zupass in our app.
* need the Devcon identifier to check if users indeed have tickets.
* need to find a way to check if someone is a Devcon attendee in a form.

The discount functionality does already exist.

## Operational Requirements & Ownership

We would be responsible for figuring out the ZuPass implementation in our web app and recruiting reporters/curators who want to share the links during the Devcon. 
We’d like to get some help in promoting this opportunity to reach potential reporters/curators. Since we are a self-funded project living off grants and little revenue, if we could get any budget for integration that would be great. But if we can't we'd also work on implementing this integration. 

## Links & Additional Information

Our app: [news.kiwistand.com](https://news.kiwistand.com/)

Our documentation: [Kiwi Docs](https://kiwistand.github.io/kiwi-docs/docs/intro)

Some stats about Kiwi: [Kiwi Dashboard](https://dune.com/rvolz/kiwi-news)

Our code: [Kiwi GitHub](https://github.com/attestate/kiwistand)
