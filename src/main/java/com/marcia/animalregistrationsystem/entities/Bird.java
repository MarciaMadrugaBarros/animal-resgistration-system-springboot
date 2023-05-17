package com.marcia.animalregistrationsystem.entities;

import java.util.UUID;

public class Bird extends Animal{

	private String birdEat;
	private String birdMakeSound;
	
	public Bird() {
	}
	
	public Bird(UUID id, String name, Double weight, String birdEat, String birdMakeSound) {
		super(id, name, weight);
		this.birdEat = birdEat;
		this.birdMakeSound = birdMakeSound;
	}

	public String getBirdEat() {
		return birdEat;
	}

	public String getBirdMakeSound() {
		return birdMakeSound;
	}

	@Override
	public void eat() {
		System.out.println("BIRDSEED, SUNFLOWER");
		
	}

	@Override
	public void makeSound() {
		System.out.println("PIU, PIU, PIUU");
		
	}

}
