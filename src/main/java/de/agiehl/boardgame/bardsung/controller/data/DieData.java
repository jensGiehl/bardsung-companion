package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DieData implements BardsungData {

    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-DamageDiceD4.png")
                        .category(Category.DIE)
                        .name("D4")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-DamageDiceD6.png")
                        .category(Category.DIE)
                        .name("D6")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-DamageDiceD8.png")
                        .category(Category.DIE)
                        .name("D8")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-DamageDiceD10.png")
                        .category(Category.DIE)
                        .name("D10")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-DamageDiceD12.png")
                        .category(Category.DIE)
                        .name("D12")
                        .build()
        );
    }
}
