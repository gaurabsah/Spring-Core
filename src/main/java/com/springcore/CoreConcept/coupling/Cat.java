package com.springcore.CoreConcept.coupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("cat")
public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("Cat Playing");
    }
}
