package com.springcore.CoreConcept.coupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("dog")
public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("Dog Playing");
    }
}
