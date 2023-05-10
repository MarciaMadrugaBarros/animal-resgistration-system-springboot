package com.marcia.animalregistrationsystem.entities;

import java.util.HashSet;
import java.util.Set;

public class Zoo {

	public void addAnimal(Animal animal) {
		
				//HashSet, que é a implementação mais rapida
				Set<String> set = new HashSet<>();
				
				//Adiciona os animais
				set.add("Dog");
				set.add("Cat");
				set.add("Bird");
				set.add("Lizard");
				set.add("Shark");
		
				//Remove os animais
				set.remove("Bird");
				set.remove("Lizard");
				
				//Imprime na tela os animais adicionados
				for (String p : set) {
					System.out.println(p);
					}
	}
}
