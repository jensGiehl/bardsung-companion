package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TokenData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-HealingPotion.png")
                        .category(Category.TOKEN)
                        .name("HealingPotion")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Firewood.png")
                        .category(Category.TOKEN)
                        .name("Firewood")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Toolkit.png")
                        .category(Category.TOKEN)
                        .name("Toolkit")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Charm.png")
                        .category(Category.TOKEN)
                        .name("Charm")
                        .build()
        );
    }
}
