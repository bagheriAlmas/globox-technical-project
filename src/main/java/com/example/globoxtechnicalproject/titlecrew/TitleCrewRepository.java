package com.example.globoxtechnicalproject.titlecrew;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface TitleCrewRepository extends JpaRepository<TitleCrew, String> {

    @Query("SELECT tc FROM TitleCrew tc WHERE :person MEMBER OF tc.directors AND :person MEMBER OF tc.writers")
    List<TitleCrew> findTitlesByDirectorAndWriter(@Param("person") String person);
}
