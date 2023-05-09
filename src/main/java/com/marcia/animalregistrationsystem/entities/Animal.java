package com.marcia.animalregistrationsystem.entities;

import java.io.Serializable;

//entidades de dominio
public abstract class Animal{
	
	private String name;
	private Double weight;
	
	
	public Animal() {
		//é obrigado a colocar um construtor vazio quando estiver usando framework
	}
	
	public Animal(String name, Double weight) {
		this.name = name;
		this.weight = weight;
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
	
	
	
