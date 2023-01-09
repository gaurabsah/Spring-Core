package com.springcore.CoreConcept;

import com.springcore.CoreConcept.beanScope.Pepsi;
import com.springcore.CoreConcept.coupling.Animal;
import com.springcore.CoreConcept.coupling.Cat;
import com.springcore.CoreConcept.coupling.Dog;
import com.springcore.CoreConcept.coupling.Person;
import extraPackage.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springcore.CoreConcept","extraPackage"})
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
//		Person personBean = applicationContext.getBean(Person.class);
//		personBean.animalPlay();
//
//		Test testBean = applicationContext.getBean(Test.class);
//		testBean.testing();

//		using qualifier
//		Animal dog = applicationContext.getBean("dog",Animal.class);
//		dog.play();
//		Animal cat = applicationContext.getBean("cat",Animal.class);
//		cat.play();

//		bean scope

		// first request for Pepsi
		Pepsi pepsiBean = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsiBean);
		pepsiBean.drink();

		// Second request for Pepsi
		Pepsi pepsiBean1 = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsiBean1);
		pepsiBean1.drink();

		// third request for Pepsi
		Pepsi pepsiBean2 = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsiBean2);
		pepsiBean2.drink();
	}

}
