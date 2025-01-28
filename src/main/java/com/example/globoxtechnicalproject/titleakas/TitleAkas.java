package com.example.globoxtechnicalproject.titleakas;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "title_akas")
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class TitleAkas {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title_id", nullable = false)
    private String titleId;

    @Column(name = "ordering", nullable = false)
    private Integer ordering;

    @Column(name = "title")
    private String title;

    @Column(name = "region")
    private String region;

    @Column(name = "language")
    private String language;

    @ElementCollection
    @CollectionTable(name = "akas_types", joinColumns = @JoinColumn(name = "title_id"))
    @Column(name = "type")
    private List<String> types;

    @ElementCollection
    @CollectionTable(name = "akas_attributes", joinColumns = @JoinColumn(name = "title_id"))
    @Column(name = "attribute")
    private List<String> attributes;

    @Column(name = "is_original_title")
    private Boolean isOriginalTitle;
}
