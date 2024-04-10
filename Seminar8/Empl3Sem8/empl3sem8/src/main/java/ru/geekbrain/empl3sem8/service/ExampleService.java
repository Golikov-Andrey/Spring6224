package ru.geekbrain.empl3sem8.service;

import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import ru.geekbrain.empl3sem8.aspect.LoggedExecution;

@Service
@Log
public class ExampleService {

    @LoggedExecution
    public void method1() {
        log.info("method1");
    }

    public void method2() {
        log.info("method2");
    }

    @LoggedExecution
    public void method3() {
        log.info("method3");
    }

}