package com.springcore.CoreConcept;

import com.springcore.CoreConcept.coupling.Animal;
import com.springcore.CoreConcept.coupling.Cat;
import com.springcore.CoreConcept.coupling.Dog;
import com.springcore.CoreConcept.coupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreConceptApplication {

//	3 steps for configuring spring core

//	1. get the bean -- use @Component

//	2. get the dependencies -- use @Autowired

//	3. where to scan for beans  -- use @ComponentScan

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Person person = new Person(animal);
//		person.animalPlay();
		ApplicationContext applicationContext = SpringApplication.run(CoreConceptApplication.class, args);
		Person personBean = applicationContext.getBean(Person.class);
		personBean.animalPlay();
	}

}
