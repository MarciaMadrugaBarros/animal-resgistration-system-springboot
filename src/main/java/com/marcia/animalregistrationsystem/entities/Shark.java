package com.marcia.animalregistrationsystem.entities;

import com.marcia.animalregistrationsystem.enums.SharkFood;

public class Shark extends Animal{
	
	private String sharkeat;
	private String sharkMakeSound;
	
	private SharkFood sharkfood;
	
	public Shark() {
	}
	
	public Shark(String sharkeat, String sharkMakeSound) {
		super();
		this.sharkeat = sharkeat;
		this.sharkMakeSound = sharkMakeSound;
	}
	
	public String getSharkeat() {
		return sharkeat;
	}

	public String getSharkMakeSound() {
		return sharkMakeSound;
	}

	public SharkFood getSharkfood() {
		return sharkfood;
	}

	@Override
	public String eat() {
		return sharkeat = "FHISH, CRUSTACEAN, CEPHALOPOD";
		
	}

	@Override
	public String makeSound() {
		return sharkMakeSound = "FRHH, FRHH, FRHH";
		
	}

}
