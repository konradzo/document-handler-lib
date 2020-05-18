package pl.kzochowski.model;

import lombok.Builder;

import java.util.List;
import java.util.Set;

@Builder
public class Content {

    private String body;
    private String header;
    private String summary;
    private String video;
    private Set<String> attachments;
    private List<Image> images;
}
