package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AbilitiesData implements BardsungData {

    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-AttackCard.png")
                        .category(Category.ABILITY)
                        .name("Attack")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-SkillCard.png")
                        .category(Category.ABILITY)
                        .name("Skill")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-FateCost.png")
                        .category(Category.ABILITY)
                        .name("FateCost")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Active.png")
                        .category(Category.ABILITY)
                        .name("Active")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Passive.png")
                        .category(Category.ABILITY)
                        .name("Passive")
                        .build()
        );
    }
}
