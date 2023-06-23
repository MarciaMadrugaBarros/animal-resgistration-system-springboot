package com.marcia.animalregistrationsystem.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.marcia.animalregistrationsystem.entities.Animal;
import com.marcia.animalregistrationsystem.repositories.AnimalRepository;

public class AnimalService{
			

	@Autowired
	private AnimalRepository repository;
	
	public Animal create(Animal animal) {
		return repository.save(animal);
	}
	
	public List<Animal> findAll() {
		return repository.findAll();
	}

	public Animal findById(UUID id) {
		Optional<Animal> obj = repository.findById(id);
		return obj.get();
	}
	
	public Animal insert(Animal obj) {
		return repository.save(obj);
	}
	
	public void delete(UUID id) {
			repository.deleteById(id);
	}
	
	public Animal update(UUID id, Animal obj) {
		Animal entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	
	}
	
	private void updateData(Animal entity, Animal obj) {
		entity.setName(obj.getName());
		entity.setWeight(obj.getWeight());
	
	}
	
	public static List<Animal> animal = new ArrayList<>();
	
	public static List<Animal> getAnimail(){
		return animal;
}
		}
