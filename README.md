# Bardsung companion

When we started playing the board game [Bardsung](https://boardgamegeek.com/boardgame/322524/bardsung), we quickly
failed due to the lack of icon overview.

That's why this [Spring Boot](https://spring.io/projects/spring-boot) web app was developed. It aims to give a complete
overview of the various icons in the game, if possible.

In the course of time other requirements were added: e.g. a campaign tracker.

Unfortunately we didn't like the game and so the further development of the app will probably not happen.

But maybe someone of you can profit a little from my work.

For copyright reasons the repository does not contain any graphics. The application downloads - if possible - the
graphics on startup from the [official website](https://steamforged.com/en-eu/blogs/resources)
(technically more precise: the application only contains links, the browser then loads the images).

Unfortunately, not all graphics can be found online, so I had to scan some. I am not allowed to provide these in the
repository either for copyright reasons. You still have to add the following images in
the `src/main/resources/static/bs-images` folder:

* Bane.png
* BANNER.png
* bardsung.png
* Bleed.png
* Blessing.png
* Burn.png
* Delayed.png
* door.png
* DRIFT.png
* ELEVATION.png
* Engagement.png
* Fatigue.png
* FIREPIT.png
* fixedEntrances.png
* FORGE.png
* Frostbite.png
* GAS.png
* GRASPING VINES.png
* MUSHROOM PATCH.png
* OLD WELL.png
* Pinned.png
* PIPE.png
* Poison.png
* RUBBLE.png
* Silence.png
* STALAGMITES.png
* Stunned.png
* Sundered.png
* WATER.png
* Weaken.png

As already mentioned, this is a Spring-Boot application. How to start it you can read in the Spring Boot documentation.