package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EnemyData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungEnemy/common/BS-Cards-Elements-Enemy-Slot-Speed.png")
                        .category(Category.ENEMY)
                        .name("Speed")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungEnemy/common/BS-Cards-Elements-Enemy-Slot-Threat.png")
                        .category(Category.ENEMY)
                        .name("Toughness")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungEnemy/common/BS-Cards-Elements-Enemy-Slot-Health.png")
                        .category(Category.ENEMY)
                        .name("Grit")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungEnemy/common/BS-Cards-Elements-Enemy-Slot-Treasure.png")
                        .category(Category.ENEMY)
                        .name("Treasure")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/grit/BS-Icons-Enemy-Type-FlipCard.png")
                        .category(Category.ENEMY)
                        .name("FlipCard")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/frames/bardsungEnemy/common/BS-Icons-Grey-Range.png")
                        .category(Category.ENEMY)
                        .name("Range")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/grit/BS-Icons-Enemy-Type-Kill.png")
                        .category(Category.ENEMY)
                        .name("Kill")
                        .build()
        );
    }
}
