package com.example.globoxtechnicalproject.namebasics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

interface NameBasicsRepository extends JpaRepository<NameBasics, String> {
    @Query("SELECT nb FROM NameBasics nb WHERE nb.nconst = :nconst AND (nb.deathYear IS NULL OR nb.deathYear = '\\N')")
    Optional<NameBasics> findAlivePerson(String nconst);
}
