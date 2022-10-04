package de.agiehl.boardgame.bardsung.controller;

import de.agiehl.boardgame.bardsung.controller.data.BardsungData;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import de.agiehl.boardgame.bardsung.controller.model.ImageConfiguration;
import de.agiehl.boardgame.bardsung.controller.model.Row;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class BardsungWebController {

    private final Environment environment;

    private List<BardsungData> dataProvider;

    @GetMapping({"/", "/iconography"})
    public String iconography(Model model) {
        model.addAttribute("img", ImageConfiguration.builder().build());

        Map<String, List<IconDescription>> groupedByCategory = dataProvider.stream()
                .flatMap(d -> d.getData().stream())
                .sorted(Comparator.comparing(IconDescription::getName))
                .collect(Collectors.groupingBy(desc -> desc.getCategory().name()));

        List<String> sortedCategories = groupedByCategory
                .keySet()
                .stream()
                .sorted()
                .toList();

        List<Row> result = new ArrayList<>();
        for (String category : sortedCategories) {
            List<IconDescription> iconDescriptions = groupedByCategory.get(category);
            Row headerRow = Row.builder()
                    .isHeader(true)
                    .name(category)
                    .build();

            result.add(headerRow);

            for (int i = 0; i < iconDescriptions.size(); i = i + 2) {
                IconDescription left = iconDescriptions.get(i);
                IconDescription right = iconDescriptions.size() > i + 1 ? iconDescriptions.get(i + 1) : null;

                Row row = Row.builder()
                        .left(left)
                        .right(right)
                        .isHeader(false)
                        .build();
                result.add(row);
            }
        }

        model.addAttribute("rows", result);

        return "iconography";
    }

}
