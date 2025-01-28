package com.example.globoxtechnicalproject.titleprincipals;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "title_principals")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class TitlePrincipals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tconst", nullable = false)
    private String tconst;

    @Column(name = "ordering")
    private Integer ordering;

    @Column(name = "nconst")
    private String nconst;

    @Column(name = "category")
    private String category;

    @Column(name = "job")
    private String job;

    @Column(name = "characters")
    private String characters;
}
