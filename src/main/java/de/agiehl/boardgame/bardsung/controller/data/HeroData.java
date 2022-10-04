package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class HeroData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungHero/shadow/BS-Element-Hero-Profile-Shadow-Range.png")
                        .name("Range")
                        .category(Category.HERO)
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungHero/shadow/BS-Element-Hero-Profile-Shadow-Speed.png")
                        .name("Speed")
                        .category(Category.HERO)
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungHero/shadow/BS-Element-Hero-Profile-Shadow-Resilience.png")
                        .name("Resilience")
                        .category(Category.HERO)
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungHero/shadow/BS-Element-Hero-Profile-Shadow-Grit.png")
                        .name("Grit")
                        .category(Category.HERO)
                        .build()
        );
    }
}
