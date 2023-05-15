package com.marcia.animalregistrationsystem.entities;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
	
	public static List<Animal> animal = new ArrayList<>();

	public static List<Animal> getAnimail(){
		return animal;
	}
	
	//Adicionar os animais
	public static void addAnimal(Animal a) {
		animal.add(a);
	}
		
	//Remove os animais
	public static void deleteAnimal(Animal a) {
			animal.remove(a);
	}
	
	//Imprime na tela os animais adicionados
	static public String listAnimals() {
		
			String saida ="";		
			for (Animal p : animal) {
			saida +=p.toString();
				System.out.println(p);
				}
				return saida;
	}
}
