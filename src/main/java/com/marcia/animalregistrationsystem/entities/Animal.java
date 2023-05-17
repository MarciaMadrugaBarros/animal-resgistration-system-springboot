package com.marcia.animalregistrationsystem.entities;


import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//entidades de dominio
public abstract class Animal{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private String name;
	private Double weight;
	
	
	public Animal() {
		//é obrigado a colocar um construtor vazio quando estiver usando framework
	}
	
	public Animal(UUID id, String name, Double weight) {
		this.id = id;
		this.name = name;
		this.weight = weight;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getWeight() {
		return weight;
	}

	public abstract void eat();
		
	public abstract void makeSound();
		
	}
	
	
	
