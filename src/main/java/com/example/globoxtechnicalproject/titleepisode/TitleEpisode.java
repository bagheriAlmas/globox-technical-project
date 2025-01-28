package com.example.globoxtechnicalproject.titleepisode;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "title_episode")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class TitleEpisode {

    @Id
    @Column(name = "tconst", nullable = false, unique = true)
    private String tconst;

    @Column(name = "parent_tconst")
    private String parentTconst;

    @Column(name = "season_number")
    private Integer seasonNumber;

    @Column(name = "episode_number")
    private Integer episodeNumber;
}
