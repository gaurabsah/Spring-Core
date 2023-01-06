package com.springcore.CoreConcept.coupling;

public class Person {

    public Person(){

    }

    public Person(Animal animal) {
        this.animal = animal;
    }

    Animal animal = new Animal();

    public void animalPlay(){
        animal.play();
    }
}
