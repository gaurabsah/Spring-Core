package com.springcore.CoreConcept.beanScope;

/*
Bean Scope follows Singleton by default.

Singleton :- only one instance is created.
             Even if you request multiple times,it will return same bean/object

ProtoType :- (opposite of singleton) multiple instance is created.
             If you request multiple times, it will return different bean/object
 */
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") or
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Pepsi {

    public Pepsi(){
        System.out.println("Creating Pepsi Object/bean");
    }

    public void drink(){
        System.out.println("Drinking Pepsi");
    }
}
