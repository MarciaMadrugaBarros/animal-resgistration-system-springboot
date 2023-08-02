package com.marcia.animalregistrationsystem.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcia.animalregistrationsystem.entities.Animal;

@RestController
@RequestMapping(value = "/animais")
public interface AnimalService{

	
	List<Animal> animal = new ArrayList<>();
	
	List<Animal> getAnimail();

	public List<Animal> findAll();
	
	
	public Animal findById(UUID id);
	
	
	public Animal create(Animal animal);
	
		
	public Animal insert(Animal obj);
	
	
	public void delete(UUID id);
	
	
	public Animal update(UUID id, Animal obj);
	
	
	}
	
	