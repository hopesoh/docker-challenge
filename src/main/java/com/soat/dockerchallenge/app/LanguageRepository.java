package com.soat.dockerchallenge.app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

    boolean existsByName(String name);
}