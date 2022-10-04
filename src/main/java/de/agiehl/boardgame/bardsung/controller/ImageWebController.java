package de.agiehl.boardgame.bardsung.controller;

import de.agiehl.boardgame.bardsung.controller.data.BardsungData;
import de.agiehl.boardgame.bardsung.controller.model.Category;
import de.agiehl.boardgame.bardsung.controller.model.IconDescription;
import de.agiehl.boardgame.bardsung.controller.model.ImageConfiguration;
import de.agiehl.boardgame.bardsung.controller.model.ImageDto;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
@Profile("dev")
public class ImageWebController {

    private List<BardsungData> dataProvider;

    @GetMapping(path = "/images", produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    String getImageUrls() {
        return dataProvider.stream()
                .flatMap(d -> d.getData().stream())
                .sorted(Comparator.comparing(IconDescription::getCategory).thenComparing(IconDescription::getName))
                .map(IconDescription::getIcon)
                .filter(icon -> icon.toLowerCase().startsWith("http"))
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @GetMapping(path = "/gallery/unused")
    public String getUnmappedImages(Model model) throws IOException {
        List<String> usedImages = dataProvider.stream()
                .flatMap(d -> d.getData().stream())
                .map(IconDescription::getIcon)
                .filter(icon -> icon.toLowerCase().startsWith("http"))
                .toList();

        List<ImageDto> unusedImages = getLinksFromFile()
                .stream()
                .filter(url -> url.toLowerCase().endsWith(".png"))
                .filter(name -> !usedImages.contains(name))
                .map(this::toDto)
                .toList();

        List<String> categories = getCategories();

        model.addAttribute("categories", categories);
        model.addAttribute("images", unusedImages);
        model.addAttribute("img", ImageConfiguration.builder().build());

        return "gallery";
    }

    private List<String> getLinksFromFile() throws IOException {
        return Files.readAllLines(ResourceUtils.getFile("classpath:imageLinks.txt").toPath());
    }

    @GetMapping(path = "/gallery")
    public String getGallery(Model model) throws IOException {
        model.addAttribute("img", ImageConfiguration.builder().build());

        List<ImageDto> allImages = getLinksFromFile()
                .stream()
                .filter(url -> url.toLowerCase().endsWith(".png"))
                .map(this::toDto)
                .toList();
        model.addAttribute("images", allImages);

        List<String> categories = getCategories();
        model.addAttribute("categories", categories);

        return "gallery";
    }

    private List<String> getCategories() {
        List<String> categories = Arrays.stream(Category.values())
                .map(Category::name)
                .sorted()
                .toList();
        return categories;
    }

    private ImageDto toDto(String url) {
        return ImageDto.builder()
                .name(url.substring(url.lastIndexOf('/') + 1, url.lastIndexOf('.')))
                .url(url)
                .build();
    }

}
