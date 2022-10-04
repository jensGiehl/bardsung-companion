package de.agiehl.boardgame.bardsung.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Row {

    private boolean isHeader;

    private IconDescription left;

    private IconDescription right;

    private String name;

    public String getHeaderKey() {
        return name.toLowerCase() + ".name";
    }

    public String getHeaderDescriptionKey() {
        return name.toLowerCase() + ".description";
    }

}
