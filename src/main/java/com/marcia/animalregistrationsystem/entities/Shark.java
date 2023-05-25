package com.marcia.animalregistrationsystem.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.marcia.animalregistrationsystem.enums.SharkFood;

@Entity
@Table(name = "tb_shark")
public class Shark extends Animal{
	
	private String sharkeat;
	private String sharkMakeSound;
	
	private SharkFood sharkfood;
	
	public Shark() {
	}
	
	public Shark(UUID id, String name, Double weight, String sharkeat, String sharkMakeSound, SharkFood sharkfood) {
		super(id, name, weight);
		this.sharkeat = sharkeat;
		this.sharkMakeSound = sharkMakeSound;
		this.sharkfood = sharkfood;
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
	public void eat() {
		System.out.println("FHISH, CRUSTACEAN, CEPHALOPOD");
		
	}

	@Override
	public void makeSound() {
		System.out.println("FRHH, FRHH, FRHH");
	}

}
