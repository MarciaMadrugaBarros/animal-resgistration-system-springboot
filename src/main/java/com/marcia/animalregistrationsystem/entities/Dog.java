package com.marcia.animalregistrationsystem.entities;

import com.marcia.animalregistrationsystem.enums.Toys;
import com.marcia.animalregistrationsystem.interfaces.DomesticAnimal;

public class Dog extends Animal implements DomesticAnimal {
	
	private String dogEat;
	private String dogMakeSound;
	
	private Toys toys;
	
	public Dog() {
	}
	
	public Dog(Animal animal, String dogEat, String dogMakeSound, Toys toys) {
		super();
		this.dogEat = dogEat;
		this.dogMakeSound = dogMakeSound;
		this.toys = toys;
	}
	

	public String getDogEat() {
		return dogEat;
	}

	public String getDogMakeSound() {
		return dogMakeSound;
	}


	public void setDogMakeSound(String dogMakeSound) {
		this.dogMakeSound = dogMakeSound;
	}

	public Toys getToys() {
		return toys;
	}

	public void setToys(Toys toys) {
		this.toys = toys;
	}
	
	public 	void play() {
		System.out.println("correndo atrás da bolinha");
	}

	@Override
	public void eat() {
		System.out.println("PORTION");
		
	}

	@Override
	public void makeSound() {
		System.out.println("AU, AU, AU");
		
	}
	
	
}

