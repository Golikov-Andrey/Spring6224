package ru.geekbrain.empl3sem8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrain.empl3sem8.service.ExampleService;


@SpringBootApplication
public class Empl3sem8Application {

	public static void main(String[] args) {
		SpringApplication.run(Empl3sem8Application.class, args);

		var c = new AnnotationConfigApplicationContext(Empl3sem8Application.class);
		var service = c.getBean(ExampleService.class);
		service.method1();
		service.method2();
		service.method3();

	}

}
