package com.springcore.CoreConcept.lifecycleOfBean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Students {

    public Students(){
        System.out.println("Creating Student");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Using Student object just after object/bean construction");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Using Student object just before object/bean Destroy");
    }
}
