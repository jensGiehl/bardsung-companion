package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AttackPropertiesData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackProperties/BS-Icons-Grey-Physical.png")
                        .category(Category.ATTACK_PROPERTIES)
                        .name("Physical")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackProperties/BS-Icons-Grey-Magical.png")
                        .category(Category.ATTACK_PROPERTIES)
                        .name("Magical")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackProperties/BS-Icons-Grey-Powerful.png")
                        .category(Category.ATTACK_PROPERTIES)
                        .name("Powerful")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackProperties/BS-Icons-Grey-AOE.png")
                        .category(Category.ATTACK_PROPERTIES)
                        .name("AoE")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackProperties/BS-Icons-Grey-Pulse.png")
                        .category(Category.ATTACK_PROPERTIES)
                        .name("Pulse")
                        .build()

        );
    }
}
