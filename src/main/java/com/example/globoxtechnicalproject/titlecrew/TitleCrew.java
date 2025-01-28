package com.example.globoxtechnicalproject.titlecrew;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "title_crew")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class TitleCrew {

    @Id
    @Column(name = "tconst", nullable = false, unique = true)
    private String tconst;

    @ElementCollection
    @CollectionTable(name = "crew_directors", joinColumns = @JoinColumn(name = "tconst"))
    @Column(name = "director")
    private List<String> directors;

    @ElementCollection
    @CollectionTable(name = "crew_writers", joinColumns = @JoinColumn(name = "tconst"))
    @Column(name = "writer")
    private List<String> writers;
}
