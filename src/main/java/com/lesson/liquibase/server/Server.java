package com.lesson.liquibase.server;

import com.lesson.liquibase.entity.Animal;
import com.lesson.liquibase.reposirory.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Server {

    private AnimalRepository animalRepository;

    @Autowired
    public Server(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public String init(){
        animalRepository.save(new Animal(1, "Joe"));
        return "";
    }
}
