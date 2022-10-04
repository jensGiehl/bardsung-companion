package de.agiehl.boardgame.bardsung.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ImageConfiguration {

    @Builder.Default
    private Integer width = 34;

    @Builder.Default
    private Integer height = 34;

}
