package ru.geekbrain.empl3sem8.aspect;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Log
public class LoggingAspect {

    //private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(ru.geekbrain.empl3sem8.aspect.LoggedExecution)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;
        log.info(joinPoint.getSignature() + " executed in " + executionTime + "ms");

        return proceed;
    }

}