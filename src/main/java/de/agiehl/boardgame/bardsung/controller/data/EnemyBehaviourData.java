package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EnemyBehaviourData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Berserk.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Berserk")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-CardDraw.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("CardDraw")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Cautious.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Cautious")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Devour.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Devour")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Disciplined.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Disciplined")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Eliminate.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Eliminate")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Ferocious.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Ferocious")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Opportunistic.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Opportunistic")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Reform.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Reform")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Reposition.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Reposition")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Retreat.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Retreat")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-TimeStopper.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("TimeStopper")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Unrelenting.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Unrelenting")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/behaviours/BS-Icons-Enemy-Behaviour-Vengeful.png")
                        .category(Category.ENEMY_BEHAVIOUR)
                        .name("Vengeful")
                        .build()
        );
    }
}
