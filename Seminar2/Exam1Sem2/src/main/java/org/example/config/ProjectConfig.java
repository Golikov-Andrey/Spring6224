package org.example.config;

import org.example.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("BMW")
    Car car1()
    {
        Car obCar = new Car();
        obCar.setModel("X1");
        obCar.setMade("BMW");
        return obCar;
    }

    @Bean(name="Audi")
    Car car2()
    {
        Car obCar = new Car();
        obCar.setModel("S8");
        obCar.setMade("Audi");
        return obCar;
    }

    @Bean
    @Primary
    Car car3()
    {
        Car obCar = new Car();
        obCar.setModel("H7");
        obCar.setMade("HAVAL");
        return obCar;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }

}
