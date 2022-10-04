package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AspectData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Immediate.png")
                        .category(Category.ASPECT)
                        .name("Immediate")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Sustained.png")
                        .category(Category.ASPECT)
                        .name("Sustained")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Delay.png")
                        .category(Category.ASPECT)
                        .name("Delay")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Engagement.png")
                        .category(Category.ASPECT)
                        .name("Engagement")
                        .build()


        );
    }
}
