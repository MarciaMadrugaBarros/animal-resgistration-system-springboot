package com.marcia.animalregistrationsystem.entities;

public class Lizard extends Animal{

	private String lizardEat;
	private String lizardMakeSound;
	
	public Lizard() {
	}
	
	public Lizard(String lizardEat, String lizardMakeSound) {
		super();
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
	public String eat() {
		return lizardEat = "SHEETS, FRUITS, EGGS";
		
	}

	@Override
	public String makeSound() {
		return lizardMakeSound = "CRRRIII, CRRRIII, CRRRIII";
		
	}

}
