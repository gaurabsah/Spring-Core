package com.springcore.CoreConcept.coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {


//   Field/Property based dependency injection
    @Autowired
    @Qualifier("dog")  // dog or cat
    Animal animal;


//    constructor based dependency injection
//    @Autowired
//    public Person(@Qualifier("cat") Animal animal) {
//        this.animal = animal;
//    }


//    setter based dependency injection
//    @Autowired
//    @Qualifier("dog")
//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }

    public void animalPlay(){
        animal.play();
    }
}
