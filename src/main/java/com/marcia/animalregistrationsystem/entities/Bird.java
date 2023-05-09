package com.marcia.animalregistrationsystem.entities;

public class Bird extends Animal{

	private String birdEat;
	private String birdMakeSound;
	
	public Bird() {
	}
	
	public Bird(String name, Double weight, String birdEat, String birdMakeSound) {
		super(name, weight);
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
