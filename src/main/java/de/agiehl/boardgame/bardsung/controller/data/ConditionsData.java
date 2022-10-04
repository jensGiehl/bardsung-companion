package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ConditionsData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("/bs-images/Bane.png")
                        .category(Category.CONDITIONS)
                        .name("Bane")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Bleed.png")
                        .category(Category.CONDITIONS)
                        .name("Bleed")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Blessing.png")
                        .category(Category.CONDITIONS)
                        .name("Blessing")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Burn.png")
                        .category(Category.CONDITIONS)
                        .name("Burn")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Fatigue.png")
                        .category(Category.CONDITIONS)
                        .name("Fatigue")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Frostbite.png")
                        .category(Category.CONDITIONS)
                        .name("Frostbite")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Pinned.png")
                        .category(Category.CONDITIONS)
                        .name("Pinned")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Poison.png")
                        .category(Category.CONDITIONS)
                        .name("Poison")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Silence.png")
                        .category(Category.CONDITIONS)
                        .name("Silence")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Stunned.png")
                        .category(Category.CONDITIONS)
                        .name("Stunned")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Sundered.png")
                        .category(Category.CONDITIONS)
                        .name("Sundered")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/Weaken.png")
                        .category(Category.CONDITIONS)
                        .name("Weaken")
                        .build()
        );
    }
}
