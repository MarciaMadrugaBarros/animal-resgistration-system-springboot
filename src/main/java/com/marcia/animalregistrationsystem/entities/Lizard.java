package com.marcia.animalregistrationsystem.entities;

import java.util.UUID;

public class Lizard extends Animal{

	private String lizardEat;
	private String lizardMakeSound;
	
	public Lizard() {
	}
	
	
	
	public Lizard(UUID id, String name, Double weight, String lizardEat, String lizardMakeSound) {
		super(id, name, weight);
		this.lizardEat = lizardEat;
		this.lizardMakeSound = lizardMakeSound;
	}
	
	public String getLizardEat() {
		return lizardEat;
	}

	public String getLizardMakeSound() {
		return lizardMakeSound;
	}


	@Override
	public void eat() {
		System.out.println("SHEETS, FRUITS, EGGS");
	}

	@Override
	public void makeSound() {
		System.out.println("CRRRIII, CRRRIII, CRRRIII");
	}

}
