package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.DiselEngin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       // System.out.println("Hello world!");
        Car p = context.getBean(Car.class);
        p.go();
        System.out.println("----------------------");
        DiselEngin dEng = context.getBean(DiselEngin.class);
    }
}