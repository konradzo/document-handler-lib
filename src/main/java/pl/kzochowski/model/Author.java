package pl.kzochowski.model;

import lombok.Builder;

@Builder
public class Author {

    private String id;
    private String nickname;
    private String profilePictureUrl;
    private String website;
    private Follower followers;
    private String surname;
    private Friend friends;
    private String language;
    private String name;
    private String url;

}
