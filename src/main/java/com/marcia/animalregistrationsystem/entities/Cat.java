package com.marcia.animalregistrationsystem.entities;

import java.util.UUID;

import com.marcia.animalregistrationsystem.interfaces.DomesticAnimal;

public class Cat extends Animal implements DomesticAnimal {

	private String catEat;
	private String catMakeSound;
	private Boolean vaccine;
	
	public Cat() {
	}

	public Cat(UUID id, String name, Double weight, String catEat, String catMakeSound, Boolean vaccine) {
		super(id, name, weight);
		this.catEat = catEat;
		this.catMakeSound = catMakeSound;
		this.vaccine = vaccine;
	}

	public String getCatEat() {
		return catEat;
	}

	public String getCatMakeSound() {
		return catMakeSound;
	}
	
	public Boolean getVaccine() {
		return vaccine;
	}

	public void setVaccine(Boolean vaccine) {
		this.vaccine = vaccine;
	}
	
	public 	void play() {
		System.out.println("simulando caçada");
	}

	@Override
	public void eat() {
		System.out.println("PORTION FOR CAR");
		
	}

	@Override
	public void makeSound() {
		System.out.println("MIAU, MIAU, MIAU");
		
	}

}
