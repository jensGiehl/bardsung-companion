package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TreasureData implements BardsungData {

    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Rune.png")
                        .category(Category.TREASURE)
                        .name("Rune")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-GemSlot1.png")
                        .category(Category.TREASURE)
                        .name("GemSlot1")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-GemSlot2.png")
                        .category(Category.TREASURE)
                        .name("GemSlot2")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-GemSlot3.png")
                        .category(Category.TREASURE)
                        .name("GemSlot3")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Treasure.png")
                        .category(Category.TREASURE)
                        .name("Gemstones")
                        .build()

        );
    }
}
