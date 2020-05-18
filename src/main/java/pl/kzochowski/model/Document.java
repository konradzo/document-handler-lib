package pl.kzochowski.model;

import lombok.Builder;

import java.util.Date;
import java.util.Set;

@Builder
public class Document {

    private Source source;
    private Author author;
    private Content content;
    private Set<String> countryCode;
    private String group;
    private Date timestamp;
    private Date createAt;
    private Metadata metadata;
    private String lang;
}
