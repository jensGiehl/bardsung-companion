package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EquipmentData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-WeaponCard.png")
                        .category(Category.EQUIPMENT)
                        .name("Weapon")
                        .build(),

                IconDescription.builder()
                        .icon("https://cardcreator.steamforged.com/icons/bardsungHero/BS-Icons-Gold-ArmourCard.png")
                        .category(Category.EQUIPMENT)
                        .name("Armour")
                        .build()
        );
    }
}
