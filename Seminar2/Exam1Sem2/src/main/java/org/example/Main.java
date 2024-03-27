package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

//        Car bmw = new Car();
//        bmw.setModel("X1");
//        bmw.setMade("BMW");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car simpleCar = context.getBean("BMW",Car.class);
        System.out.println(simpleCar.getModel()+" "+simpleCar.getMade());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}