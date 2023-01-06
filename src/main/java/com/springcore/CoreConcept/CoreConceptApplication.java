package com.springcore.CoreConcept;

import com.springcore.CoreConcept.coupling.Animal;
import com.springcore.CoreConcept.coupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreConceptApplication {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Person person = new Person(animal);
		person.animalPlay();
		SpringApplication.run(CoreConceptApplication.class, args);
	}

}
