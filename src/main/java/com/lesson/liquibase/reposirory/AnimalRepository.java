package com.lesson.liquibase.reposirory;

import com.lesson.liquibase.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
