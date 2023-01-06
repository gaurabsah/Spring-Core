package com.springcore.CoreConcept;

import com.springcore.CoreConcept.coupling.Animal;
import com.springcore.CoreConcept.coupling.Cat;
import com.springcore.CoreConcept.coupling.Dog;
import com.springcore.CoreConcept.coupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreConceptApplication {

	public static void main(String[] args) {
		Animal animal = new Dog();
		Person person = new Person(animal);
		person.animalPlay();
		SpringApplication.run(CoreConceptApplication.class, args);
	}

}
