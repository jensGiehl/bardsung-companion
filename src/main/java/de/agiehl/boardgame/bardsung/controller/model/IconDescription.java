package de.agiehl.boardgame.bardsung.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IconDescription {

    private String icon;

    private Category category;

    private String name;

    public String getNameKey() {
        return getKeyPrefix() + ".name";
    }

    public String getDescriptionKey() {
        return getKeyPrefix() + ".description";
    }

    private String getKeyPrefix() {
        return category.name().toLowerCase() + "." + name.toLowerCase();
    }

}
