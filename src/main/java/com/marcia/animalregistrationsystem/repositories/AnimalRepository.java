package com.marcia.animalregistrationsystem.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcia.animalregistrationsystem.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, UUID> {

}
