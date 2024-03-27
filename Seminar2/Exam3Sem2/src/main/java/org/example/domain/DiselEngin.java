package org.example.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class DiselEngin  {
    public DiselEngin() {
        System.out.println("Создан экземпляр DiselEngin");
    }

    // @Override
    public void startEngine() {
        System.out.println("Запущен Дизел 65р.л");
    }
}
