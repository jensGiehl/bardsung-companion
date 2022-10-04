package de.agiehl.boardgame.bardsung.controller;

import de.agiehl.boardgame.bardsung.controller.data.BardsungData;
import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@AllArgsConstructor
@Profile("dev")
public class MessagesWebController {

    private List<BardsungData> dataProvider;

    private MessageSource messageSource;

    @GetMapping(value = "/messages", produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    String generateProperties() {
        String iconMessages = dataProvider.stream()
                .flatMap(d -> d.getData().stream())
                .sorted(Comparator.comparing(IconDescription::getCategory).thenComparing(IconDescription::getName))
                .flatMap(this::toStrings)
                .collect(Collectors.joining(System.lineSeparator()));

        String headlines = dataProvider.stream()
                .flatMap(d -> d.getData().stream())
                .map(IconDescription::getCategory)
                .map(Category::name)
                .sorted()
                .distinct()
                .flatMap(this::toMessageString)
                .collect(Collectors.joining(System.lineSeparator()));

        return headlines +
                System.lineSeparator() +
                System.lineSeparator() +
                iconMessages;
    }

    private Stream<String> toMessageString(String name) {
        return Stream.of(
                getPropertieString(name.toLowerCase() + ".name"),
                getPropertieString(name.toLowerCase() + ".description")
        );
    }

    private Stream<String> toStrings(IconDescription iconDescription) {
        return Stream.of(
                getPropertieString(iconDescription.getNameKey()),
                getPropertieString(iconDescription.getDescriptionKey())
        );
    }

    private String getPropertieString(String key) {
        return key + "=" + messageSource.getMessage(key, null, "", LocaleContextHolder.getLocale());
    }

}
