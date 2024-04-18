package ru.maliutin.seminar6hw1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.maliutin.seminar6hw1.models.exceptions.ExceptionBody;
import ru.maliutin.seminar6hw1.models.exceptions.ResourceNotFoundException;

import java.time.LocalDateTime;

/**
 * Контроллер обработки исключений.
 */

@RestControllerAdvice
public class AdviceController {
    /**
     * Обработка исключения ResourceNotFoundException.
     * @param e объект исключения.
     * @return ответ оберткой исключения.
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionBody resourceNotFound(ResourceNotFoundException e){
        ExceptionBody exceptionBody = new ExceptionBody();
        exceptionBody.setMessage(e.getMessage());
        exceptionBody.setLocalDateTime(LocalDateTime.now());
        return exceptionBody;
    }

    /**
     * Обработка исключения Exception
     * @param e объект исключения.
     * @return ответ оберткой исключения.
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionBody badCase(Exception e){
        ExceptionBody exceptionBody = new ExceptionBody();
        exceptionBody.setMessage("Все пропало, сервер помер!");
        exceptionBody.setLocalDateTime(LocalDateTime.now());
        return exceptionBody;
    }

}
