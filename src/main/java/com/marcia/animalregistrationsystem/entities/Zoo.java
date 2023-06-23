package com.marcia.animalregistrationsystem.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_zoo")
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
	
	}*/
}
