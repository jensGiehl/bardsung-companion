package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EnemyTypeData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/BS-Icons-Black-Hobgoblin.png")
                        .category(Category.ENEMY_TYPE)
                        .name("Hobgoblin")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/BS-Icons-Black-Bugbear.png")
                        .category(Category.ENEMY_TYPE)
                        .name("Bugbear")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/BS-Icons-Black-Duergar.png")
                        .category(Category.ENEMY_TYPE)
                        .name("Duergar")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/BS-Icons-Black-Mechanica.png")
                        .category(Category.ENEMY_TYPE)
                        .name("Mechanica")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/BS-Icons-Black-Spirit.png")
                        .category(Category.ENEMY_TYPE)
                        .name("Spirit")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/BS-Icons-Black-WanderingMonster.png")
                        .category(Category.ENEMY_TYPE)
                        .name("WanderingMonster")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/BS-Icons-Enemy-Undead.png")
                        .category(Category.ENEMY_TYPE)
                        .name("Undead")
                        .build()
        );
    }
}
