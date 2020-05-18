package pl.kzochowski.model;

import lombok.Builder;

@Builder
public class Metadata {

    private Integer likes;
    private Integer view;
    private Integer dislike;
    private Integer comments;
    private Integer shared;

}
