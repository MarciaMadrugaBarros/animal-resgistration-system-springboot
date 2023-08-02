package com.marcia.animalregistrationsystem.controllers;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.marcia.animalregistrationsystem.entities.Animal;
import com.marcia.animalregistrationsystem.services.AnimalService;

public class AnimalController {

	@Autowired
	private AnimalService service;
	
	//Recuperar dados a lista de todos os Animais do banco de dados
		@GetMapping
		public ResponseEntity<List<Animal>> findAll(){
			List<Animal> list = service.findAll();
			return ResponseEntity.ok().body(list);		
		}
		
		//Recuperar dados do animal por ID
		@GetMapping(value= "/{id}")
		public ResponseEntity<Animal> findById(@PathVariable UUID id){
			Animal animal = service.findById(id);
			return ResponseEntity.ok().body(animal);
		}
		
		//Inserir novo dado no banco de dados
		@PostMapping
		public ResponseEntity<Animal> insert(@RequestBody Animal animal){
			animal = service.insert(animal);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(animal.getId()).toUri();
			return ResponseEntity.created(uri).body(animal);
		}
		
		//Para deletar
		@DeleteMapping(value= "/{id}")	
		public ResponseEntity<Void> delete(@PathVariable UUID id){
			service.delete(id);
			return ResponseEntity.noContent().build();
		}
			//Para atualizar
		@PutMapping(value= "/{id}")
		public ResponseEntity<Animal> update(@PathVariable UUID id, @RequestBody Animal obj) {
			obj = service.update(id, obj);
			return ResponseEntity.ok().body(obj);
		}
			}

