package ru.geekbrain.empl3sem8.service;

import org.springframework.stereotype.Service;
import ru.geekbrain.empl3sem8.aspect.LogException;

@Service
public class MonitoredService {

    @LogException
    public void potentiallyFailingMethod() {
        // Some logic that might throw an exception
        if (true) { // example condition
            throw new RuntimeException("Oops, something went wrong!");
        }
    }
}
