package com.marcia.animalregistrationsystem.entities;

import com.marcia.animalregistrationsystem.services.DomesticAnimal;

public class Cat extends Animal implements DomesticAnimal {

	private String catEat;
	private String catMakeSound;
	private Boolean vaccine;
	
	public Cat() {
	}
	
	public Cat(String catEat, String catMakeSound, Boolean vaccine) {
		super();
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
	
	public 	String play() {
		return "simulando caçada";
	}

	@Override
	public String eat() {
		return catEat = "PORTION FOR CAR";
		
	}

	@Override
	public String makeSound() {
		return catMakeSound = "MIAU, MIAU, MIAU";
		
	}

}
