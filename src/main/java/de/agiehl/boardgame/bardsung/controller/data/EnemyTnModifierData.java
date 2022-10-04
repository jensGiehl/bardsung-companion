package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EnemyTnModifierData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/modifiers/BS-Icons-Black-EnemyPhysicalAdvantage.png")
                        .category(Category.ENEMY_TN_MODIFIER)
                        .name("EnemyPhysicalAdvantage")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/modifiers/BS-Icons-Black-EnemyPhysicalDisadvantage.png")
                        .category(Category.ENEMY_TN_MODIFIER)
                        .name("EnemyPhysicalDisadvantage")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/modifiers/BS-Icons-Black-EnemyMagicalAdvantage.png")
                        .category(Category.ENEMY_TN_MODIFIER)
                        .name("EnemyMagicalAdvantage")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/modifiers/BS-Icons-Black-EnemyMagicalDisadvantage.png")
                        .category(Category.ENEMY_TN_MODIFIER)
                        .name("EnemyMagicalDisadvantage")
                        .build()
        );
    }
}
