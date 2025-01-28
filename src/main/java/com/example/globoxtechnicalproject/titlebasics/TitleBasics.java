package com.example.globoxtechnicalproject.titlebasics;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "title_basics")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class TitleBasics {

    @Id
    @Column(name = "tconst", nullable = false, unique = true)
    private String tconst;

    @Column(name = "title_type")
    private String titleType;

    @Column(name = "primary_title")
    private String primaryTitle;

    @Column(name = "original_title")
    private String originalTitle;

    @Column(name = "is_adult")
    private Boolean isAdult;

    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "runtime_minutes")
    private Integer runtimeMinutes;

    @ElementCollection
    @CollectionTable(name = "title_genres", joinColumns = @JoinColumn(name = "tconst"))
    @Column(name = "genre")
    private List<String> genres;
}
