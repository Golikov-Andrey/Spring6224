package ru.maliutin.task_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Контроллер приложения.
 */
@Controller
public class AppController {
    /**
     * Домашняя страница.
     * @return представление домашней страницы.
     */
    @GetMapping("/")
    public String home(){
        return "home";
    }

    /**
     * Страница для пользователей с ролью USER.
     * @return публичное представление.
     */
    @GetMapping("/public-data")
    public String userPage(){
        return "public_page";
    }

    /**
     * Страница для пользователей с ролью ADMIN.
     * @return закрытое представление.
     */
    @GetMapping("/private-data")
    public String adminPage(){
        return "private_page";
    }

    /**
     * Страница отказа в доступе.
     * @return представление отказа в доступе.
     */
    @GetMapping("/access-denied")
    public String accessDenied(){
        return "access-denied";
    }

    /**
     * Аутентификация пользователя.
     * @return представление аутентификации.
     */
    @GetMapping("/login")
    public String auth(){
        return "login-page";
    }
}
