package de.agiehl.boardgame.bardsung.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImageDto {

    private String url;

    private String name;

}
