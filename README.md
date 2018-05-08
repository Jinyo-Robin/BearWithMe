# Bear With Me [1.12.2]

## License
#### Bear With Me
[![License](https://img.shields.io/badge/License-LGPLv2.1-blue.svg)](http://www.gnu.org/licenses/lgpl-2.1.html)
#### Textures and Models
[![License](https://img.shields.io/badge/License-CC%20BY--NC--SA%204.0-yellow.svg)](https://creativecommons.org/licenses/by-nc-sa/4.0/) 

## Description
A simple mod that adds new bear species to Minecraft!

#### For earlier versions, see the relevant GitHub branch:
  - BWM for Forge [1.12.2][1.12.2-j] by Jinyo-Robin
  - BWM for Forge [1.12.2][1.12.2-c] by Cazsius
  - BWM for Forge [1.12.1] by Cazsius
  - BWM for Forge [1.11.2] by Cazsius
  - BWM for Forge [1.10.2] by Cazsius

[1.12.2-j]:https://github.com/Jinyo-Robin/BearWithMe
[1.12.2-c]:https://github.com/Cazsius/BearWithMe
[1.12.1]:https://github.com/Cazsius/BearWithMe/tree/1.12.1
[1.11.2]:https://github.com/Cazsius/BearWithMe/tree/1.11.2
[1.10.2]:https://github.com/Cazsius/BearWithMe/tree/1.10.2

## Features

### Entities
  - Black Bear -
    Found in forested areas.
  - Grizzly Bear -
    Lives in hills and plains.
  - Panda Bear -
    Elusive jungle dweller.

### Items
  - Bear Hide Loot -
    Bears drop their respective hides, which can be crafted into leather.

### Config
  - Spawn Weight -
    Options to change the spawn weight of each species. Keep in mind that species that spawn in densely forested areas have less area to spawn on than those that spawn in open areas.  This will affect spawn numbers, even if spawn weights are the same for all species.

## Downloads
- Get it from here (see green "Clone or Download" button) and build it.

## Building
1. Clone the repository via
- SSH `git clone git@github.com:Jinyo-Robin/BearWithMe.git` or
- HTTPS `git clone https://github.com/Jinyo-Robin/BearWithMe.git` or
- download [zip](https://github.com/Jinyo-Robin/BearWithMe/archive/1.12.2-dev.zip)
2. Setup workspace
- `gradlew setupDecompWorkspace` or
- `./gradlew setupDecompWorkspace`
3. Build Jar to `build/libs/`
- `gradlew build` or
- `./gradlew build`
4. Run
- `gradlew runClient` or
- `./gradlew runClient`

## Installation

- Copy the Jar from `build/libs/` into your Minecraft mods folder.
