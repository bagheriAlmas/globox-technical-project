package com.example.globoxtechnicalproject.titleratings;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "title_ratings")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class TitleRatings {

    @Id
    @Column(name = "tconst", nullable = false, unique = true)
    private String tconst;

    @Column(name = "average_rating")
    private Double averageRating;

    @Column(name = "num_votes")
    private Integer numVotes;
}
