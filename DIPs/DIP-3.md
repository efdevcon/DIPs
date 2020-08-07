---
Title:
Primary Contact: Alberto Granzotto <agranzot@mailbox.org>
Status: Draft
Themes: Social
Tags: Event Production
Resources Required: Communication support, Access to the venue before the event starts
Discussion: TBD
---


# Summary of Proposal

Develop a game for Devcon to push people to explore the event, engage with other people, and learn how to develop a great UX for a fully decentralized app.


# Abstract

A game is a great tool to break the ice and start a conversation with others, to discover the surroundings, and learn something new. A game can also convey a message to make people aware about specific issues, and can be fun to play without being naive.

We propose to build a treasure hunt game for Devcon using decentralized technology **only** (no centralized APIs). The game requires players to solve quests in real life, explore the conference to find hints and interact with people. To submit solutions and progress with the story, players use a decentralized web application from their (mobile) browser.

By mixing different approaches like zero-knowledge proof, gas station networks, and burner wallets, the game aims to be an example of great user experience in terms of onboarding and playability.

The game is also free and open source software so other developers can learn from it.

# Motivation & Rationale

<!--

Social Dist0rtion Protocol (SDP), is a Decentralized Autonomous Organization from the future. We come from a time where transplanetary corporations commodified democracy, manipulated governments, and destroyed the environment, and there is nothing we can to to fix that. The only thing we have left is to travel back in time to convince humans to not repeat the same mistakes we did.

We know that Devcon attendees deeply care about the future of Gaia—our Mother Earth, and that's the reason why we want to connect with you.

We hereby propose to create a treasure hunt game
-->

A Treasure Hunt (or Scavenger Hunt) is a game played in a physical space like a building, a neighborhood, a city. The game is build around a story, and it is organized in levels. Each level contains:

- **A quest**: reveals a part of the story and a hint on where to find the puzzle.
- **A puzzle**: a riddle to solve in order to get a **password**.
- **A password**: a string that allows the player to progress to the next level.

The game is not a sequence of disconnected puzzles to solve. Participants discover the story chapter by chapter, interacting with the physical space around them.

Treasure hunt games are customized and tailored around a conference or event. A well executed treasure hunt game would be a remarkable experience for Devcon attendees because it encourages people to:

- **Discover.** The game requires to go around and explore different areas of the event and discover what's around them.
- **Socialize.** It makes people socialize outside the context of doing business and have fun together. Individuals or groups of players can team up and play the game together.
- **Think.** The game is built around a story. Our previous game featured a story that develops in a future where transplanetary corporations commodified democracy, manipulated governments, and destroyed the environment, to warn people about the dystopian future they face if they don't fight.
- **Learn.** The dApp to interact with the game, the smart contracts, and the tools to compile and deploy the story are free and open source software. To fight centralization, we must stop building centralized systems. That's why the whole game is developed using only Ethereum and IPFs, and no centralized APIs. The game itself is a showcase of what can be built **today** using decentralized protocols.

## Previous Experience

We set up [Planetscape][planetscape], a dystopian escape game for [36C3][36c3] based on the dreadful effects of climate change (ccc did **not** sponsored the game).

Planetscape is organized in 20 chapters, and requires players to solve quests in real life, explore the congress to find hints and interact with people. Planetscape had **20 levels**, **254 players**, [**1300** transactions][ps:transactions] to the smart contract, and **7 teams** finished the game and claimed their prize.

The players' feedback was heartwarming: "We were about to leave the congress but we found Planetscape, and we stayed longer to play!", "Please make another escape game for the next congress!", "This was the best thing of the congress", "Highlight of this year" ([tweet][ps:highlight]).

During the game, players:

- Discovered new areas and activities, the game kept them engaged with the event.
- United forces with others while playing the game.
- Understood and enjoyed the theme of game.

# Implementation

There are two aspects related to the implementation of a treasure hunt game.

- The first one is the technical aspect: what is the infrastructure needed to support attendees playing the game? This part will be public and free and open source software anyone can audit.
- The second one is related to the story an the puzzles: what is the plot of the game? What kind of puzzles players need to solve in order to progress with the game? This part will be developed by few people in a private repository. The repository will be published after the end of the event.

## Technical infrastructure

Social Dist0rtion Protocol developed [THC][thc] (Treasure Hunt Creator). THC is not a game itself. Instead, it is a framework
to create decentralized treasure hunts. Given a story, THC generates all the components needed to play the treasure hunt:

- A web dApp that players use to read the story, submit passwords, and check the leaderboard.
- A smart contract to store the structure of the story, validate players' submissions, and read the leaderboard.
- Encrypted JSON documents stored in IPFS that contain the actual text of the chapters.

```

.                                         +---------------------+
.                                         |                     |
.                                 +------>+ IPFS: Enc levels    |
+----------------+                |       |                     |
|                |                |       +---------------------+
|  Game          |                |
|  - Level 0     |       +-------++       +---------------------+
|    - Quest     |       |       |        |                     |
|    - Puzzle    +------>+  THC  +------->+ ETH: Smart Contract |
|    - Password  |       |       |        |                     |
|  - Level N     |       +-------++       +---------------------+
|    - ...       |                |
|                |                |       +---------------------+
+----------------+                |       |                     |
.                                 +------>+ IPFS: dApp          |
.                                         |                     |
.                                         +---------------------+
```

THC creates a *user-friendly application that relys on decentralized technology only*. We want to live the decentralized dream with no compromises, developing a powerful dApp that would use Ethereum under the hood without exposing any details about blockchain and IPFS to the player.

The game has **instant onboarding** by allowing people to play the game just by visiting a website. By now, this happens by using a "burner-wallet"-like approach (the player's wallet is created on the fly when opening the dApp for the first time). In order to make transactions players needed Ether. While the current approach is to simply [transfer][gasstation] a small amount of (test) Ether to new players, we want to improve this by using [OpenGSN][opengsn].

In the context of Devcon, and if an Ethereum address is assigned to every participant, using OpenGSN would work smoothly because we can have a custom `Paymaster` that only pays for the actual attendees.

### Zero Knowledge Proof

As mentioned earlier, every time a correct password is found, a transaction is sent to the smart contract. Ethereum transactions are public and we don't want players to sniff passwords submitted by others. To avoid that, we implemented a cheap zero-knowledge proof scheme.

First of all we need to understand how a chapter is associated to its address. We don't want to put passwords in the smart contract, otherwise anyone would be able to read them. Instead we store the address of the chapter. To generate the address we do:

```
chapter_address = private_key_to_address(
  private_key_from_seed(
    keccak256(
      chapter_password)))
```

The `chapter_address` is then used to verify if a user found the correct password.

The smart contract stores the following information:
- Chapters, identified by their sequential `id` such as `id ∈ [0, 2^96)`. Each `id` points to:
  - The **address of the chapter**.
  - The IPFS Content ID (CID) that points to the content of the chapter.
  - The array of players that reached chapter.
- Players, identified by their Ethereum address (type `address`, that is a `uint160`). Each player is associated with the current chapter they are in.

Roughly speaking, the zero-knowledge proof scheme works by having the chapter signing the player's address. The smart contract has all information to check the signature. If the signature is valid, the player can progress to the next chapter.

Given a valid `chapter_password` and a `player_address`, this is the interaction between the dApp and the smart contract:

1. The dApp generates `chapter_seed = keccak256(chapter_password)`.
1. The dApp generates `chapter_private_key = private_key_from_seed(chapter_seed)`.
1. The dApp generates `chapter_proof = sign(player_address, chapter_private_key)`
1. The dApp calls the `submit` method of the smart contract passing `chapter_proof`.
1. The smart contract checks the current `chapter_address` for `player_address` in its storage.
1. The smart contracts calculates `signing_address` by doing `ecrecover(player_address, signature)`.
1. If `signing_address == chapter_address`, then the smart contract updates the current chapter for the player, moving them to the next chapter.

More information about the [creation][zk:creation] and [verification][zk:verification] of the proof can be found in the source code.

## Story and Puzzles

A player starts the game by visiting the game website. By opening the website, the player has access to the first **chapter** of the game that contains both a piece of the background story and a hint on where to find the **puzzle**. If solved, the puzzle reveals the **password** to the next chapter. By submitting the password to the website, the player will get a new piece of the story and a new puzzle to solve, and so on until the end of the game.

A game usually features twenty chapters of increasing difficulty. Like a classic escape game, both story and puzzles were integrated with the surrounding environment. In the context of **Planetscape**, the congress center became a futuristic planetary base surrounded by a post apocalyptic desert. Puzzles required players to move around the congress to find secret codes (geocaching), use the internal navigation map to discover specific places, find a specific WiFi access point to connect to the social network that gobbled up the free internet, lockpick a box to reveal the password, and many others.

In order to develop a similar game for Devcon, information about the conference area, rooms, theme, visual identity must be known in advance. Developing a story takes some time.

# Operational Requirements & Ownership

1. *What actions are required to implement the proposal at Devcon?*
    - The game must be deployed few days before the conference. Physical and digital puzzles must be ready on the first day of the event.
    - Serving the game under `devcon.org` subdomain would make the game more trustworthy.
    - Add the link to the game to the paper guide (if any) provided at Devcon.
    - If Devcon's designers have bandwitdh, create few official NFTs "signed by Devcon" to distribute to for the winners.

2. *Who will be responsible for the proposal to be implemented effectively? (i.e. working on Day 0)*
    - Social Dist0rtion Protocol will be responsible for the successful implementation of this proposal.

3. *What other projects could this proposal be integrated with? (Bonus points for collaboration across teams :))*
    - One of the goals of the game is to discover Devcon and its projects. Knowing in advance the list of projects would allow us to create levels around them.

# Links & Additional Information

Additional information can be found here:

- :camera: [The photos](https://imgur.com/a/PCe4hCo) of the dApp and some of the puzzles.
- :writing_hand: [Our extensive blog post](https://www.dist0rtion.com/2020/01/30/Planetscape-a-dystopian-escape-game-for-36C3/) about the game.
- :speaking_head: [Lightning Talk](https://www.youtube.com/watch?v=7RJn2gowj2I) at IPFS Pinning Summit


[planetscape]: https://www.dist0rtion.com/2020/01/30/Planetscape-a-dystopian-escape-game-for-36C3/
[36c3]: https://events.ccc.de/congress/2019/wiki/index.php/Main_Page
[ps:transactions]: https://rinkeby.etherscan.io/address/0x4d9529698d112939ad540bc33caf11809fd1d684
[ps:highlight]: https://twitter.com/mediaquery/status/1212043098127241218
[thc]: https://github.com/social-dist0rtion-protocol/thc
[zk:creation]: https://github.com/social-dist0rtion-protocol/thc/blob/v0.0.1/app/src/Chapter.svelte#L21
[zk:verification]: https://github.com/social-dist0rtion-protocol/thc/blob/v0.0.1/eth/contracts/TreasureHuntCreator.sol#L66
[gasstation]: https://rinkeby.etherscan.io/address/0x197970e48082cd46f277abdb8afe492bccd78300
[opengsn]: https://www.opengsn.org/
