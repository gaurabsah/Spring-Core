package com.springcore.CoreConcept.coupling;

public class Person {

    public Person(){

    }

    Animal animal;
    public Person(Animal animal) {
        this.animal = animal;
    }



    public void animalPlay(){
        animal.play();
    }
}
