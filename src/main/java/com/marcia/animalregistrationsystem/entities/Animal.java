package com.marcia.animalregistrationsystem.entities;


import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_animal")
public abstract class Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public abstract void eat();
		
	public abstract void makeSound();

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(id, other.id);
	}
		
	}
	

	
	
