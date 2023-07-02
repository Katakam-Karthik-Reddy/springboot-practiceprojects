package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.ShoppingCart.checkOut(..))")
    public void logingBefore(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println(Arrays.toString(jp.getArgs()));
        System.out.println("this is logging before called");
    }

    @After("execution(* *.*.*.*.checkOut(..))")
    public void loggingAfter(){
        System.out.println("this is logging after called");
    }

    @Pointcut("execution(* *.*.*.*.counting(..))")
    public void afterReturningPointcut(){

    }


    @AfterReturning(pointcut = "afterReturningPointcut()", returning = "value")
    public void afterReturning(String value){
        System.out.println("returning value is " + value);
        System.out.println("this is afterreturning");
    }

}
