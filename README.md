# Coaster Chain Guard

NeoForge 1.21.1 addon for **Create: Coasters Simulated** 0.1.5 (mod id `simulatedcoasters`).
Stops cart links (the chains between two carts) from snapping.

## How it works

Coasters Simulated checks every cart link on every physics tick with
`CoasterCartTrainLinkConstraint.isUnderExtremeTension(...)`. If that returns true the link
is broken (`breakLinkUnderTension`). The check fires when a link stretches 0.5 blocks, or
0.07 blocks with a joint force of 1800+.

`CartLinkTensionMixin` forces that check to return `false`, so links no longer snap from
stretch or force. Links are still removed when a cart is removed, and you can still cut
them with shears.

I read this from the 0.1.5 jar with `javap`. It targets a private method by name, so a
later Coasters Simulated update that renames or moves it will stop this mod from loading
(`defaultRequire: 1` makes that fail loudly instead of silently doing nothing).

## Building

Needs JDK 21 and internet access to download NeoForge.

    gradle wrapper        # once, if there is no gradlew yet
    ./gradlew build       # Windows: gradlew.bat build

The jar appears in `build/libs/coasterchainguard-0.1.0.jar`. The mixin targets the base
mod by class name, so you do not need its jar in `libs/` just to build. `libs/` is only
for `./gradlew runClient` testing (Coasters Simulated, Create, Registrate, Flywheel,
Ponder, Sable, Veil).

## Installing

Put the jar in your `mods` folder next to Create, Sable and Coasters Simulated 0.1.5.

## Status

Not yet compiled or run in-game: the environment I wrote it in could not reach the
NeoForge Maven. If the build or the game reports a problem, send me the error.
