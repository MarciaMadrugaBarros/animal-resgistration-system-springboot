package com.marcia.animalregistrationsystem.entities;

public class Bird extends Animal{

	private String birdEat;
	private String birdMakeSound;
	
	public Bird() {
	}
	
	public Bird(String birdEat, String bidMakeSound) {
		super();
		this.birdEat = birdEat;
		this.birdMakeSound = bidMakeSound;
	}


	public String getBirdEat() {
		return birdEat;
	}

	public String getBirdMakeSound() {
		return birdMakeSound;
	}

	@Override
	public String eat() {
		return birdEat = "BIRDSEED, SUNFLOWER";
		
	}

	@Override
	public String makeSound() {
		return birdMakeSound = "PIU, PIU, PIUU";
		
	}

}
