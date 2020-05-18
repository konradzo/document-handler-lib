package pl.kzochowski.model;

import lombok.Builder;

import java.util.Set;

@Builder
public class Source {

    private Set<Long> topics;
    private Long siteId;
    private Long sourceId;
    private SourceType sourceType;
}
