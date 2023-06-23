	package com.marcia.animalregistrationsystem.services.servicesImpl;
	
	import java.util.ArrayList;
import java.util.List;
	import java.util.Optional;
	import java.util.UUID;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.marcia.animalregistrationsystem.entities.Animal;
	import com.marcia.animalregistrationsystem.repositories.AnimalRepository;
import com.marcia.animalregistrationsystem.services.AnimalService;
	
	@Service
	public class AnimalServiceImpl implements AnimalService{
	
		@Autowired
		private AnimalRepository repository;
		
		//create
		public Animal create(Animal animal) {
		//	Animal copy = new Animal(new  animal.getId(),animal.getName(), animal.getWeight(), 
		}
	
		public Optional<Animal> find(UUID id) {
			return repository.findById(id);
		}
		
		public void delete(UUID id) {
				repository.deleteById(id);
		}
		//update
		public Optional<Animal> update(UUID id, Animal obj) {
			return repository.findById(id)
					.map(oldAnimal -> {
						Animal update = oldAnimal.updateWith(obj);
						return repository.save(updated);
					});
		}
		
		//list
		public List<Animal> findAll(){
			List<Animal> list = new ArrayList<>();
			Iterable<Animal> animal = repository.findAll();
			animal.forEach(list::add);
			return list;
		}
	

}

