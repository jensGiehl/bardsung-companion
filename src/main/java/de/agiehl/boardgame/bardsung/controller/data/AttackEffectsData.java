package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AttackEffectsData implements BardsungData {

    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-LightWound.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Wound")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-SeriousWound.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("SeriousWound")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Push.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Push")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Dodge.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Dodge")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Inspire.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Inspire")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Quicken.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Quicken")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Haste.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Haste")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Slow.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Slow")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Stop.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Stop")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Bane.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Bane")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Bleed.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Bleed")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Blessing.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Blessing")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Burn.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Burn")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Fatigue.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Fatigue")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Frostbite.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Frostbite")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Pinned.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Pinned")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Poison.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Poison")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-Silence.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Silence")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Stunned.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Stunned")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Sundered.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Sundered")
                        .build(),
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungEnemy/attackEffects/BS-Icons-Grey-Weaken.png")
                        .category(Category.ATTACK_EFFECTS)
                        .name("Weaken")
                        .build()

        );
    }
}
