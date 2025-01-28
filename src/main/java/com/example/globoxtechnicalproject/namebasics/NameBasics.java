package com.example.globoxtechnicalproject.namebasics;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "name_basics")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class NameBasics {

    @Id
    @Column(name = "nconst", nullable = false, unique = true)
    private String nconst;

    @Column(name = "primary_name")
    private String primaryName;

    @Column(name = "birth_year")
    private Integer birthYear;

    @Column(name = "death_year")
    private Integer deathYear;

    @ElementCollection
    @CollectionTable(name = "name_professions", joinColumns = @JoinColumn(name = "nconst"))
    @Column(name = "primary_profession")
    private List<String> primaryProfession;

    @ElementCollection
    @CollectionTable(name = "name_known_titles", joinColumns = @JoinColumn(name = "nconst"))
    @Column(name = "known_for_title")
    private List<String> knownForTitles;
}
