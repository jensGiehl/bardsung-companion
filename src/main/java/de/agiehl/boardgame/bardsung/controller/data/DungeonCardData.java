package de.agiehl.boardgame.bardsung.controller.data;

import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DungeonCardData implements BardsungData {
    @Override
    public List<IconDescription> getData() {
        return Arrays.asList(
                IconDescription.builder()
                        .icon("/bs-images/door.png")
                        .category(Category.DUNGEON_CARD)
                        .name("Door")
                        .build(),
                IconDescription.builder()
                        .icon("/bs-images/fixedEntrances.png")
                        .category(Category.DUNGEON_CARD)
                        .name("FixedEntrances")
                        .build()
        );
    }
}
