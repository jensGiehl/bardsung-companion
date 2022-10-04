package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CharacteristicsData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Hero-Generic-CHA.png")
                        .category(Category.CHARACTERISTICS)
                        .name("Charisma")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Hero-Generic-CON.png")
                        .category(Category.CHARACTERISTICS)
                        .name("Constitution")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Hero-Generic-DEX.png")
                        .category(Category.CHARACTERISTICS)
                        .name("Dexterity")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Hero-Generic-INT.png")
                        .category(Category.CHARACTERISTICS)
                        .name("Intelligence")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Hero-Generic-STR.png")
                        .category(Category.CHARACTERISTICS)
                        .name("Strength")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Hero-Generic-WIS.png")
                        .category(Category.CHARACTERISTICS)
                        .name("Wisdom")
                        .build()

        );
    }
}
