package org.example.services;

import org.example.aspects.ToLog;
import org.example.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Component
public class CommentService {



    @ToLog
    public String publishComment(Comment comment) {
        System.out.println("Опубликовать комментарий: " + comment.getText());
        return "SUCCESS";
    }

//    public void method1()
//    {
//        System.out.println("Вызван метод1");
//    }
//
//    public void setLogger(Logger logger) {
//        this.logger = logger;
//    }
}




