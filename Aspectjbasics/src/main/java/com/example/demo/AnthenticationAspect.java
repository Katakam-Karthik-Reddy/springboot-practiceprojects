package com.example.demo;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnthenticationAspect {

    @Pointcut("within(com..*)")
   public void authentication(){
       System.out.println("this is anthentication called");
   }

   @Pointcut("within(com..*)")
   public void authorization(){
       System.out.println("this is authorization called");
   }

   @Before("authentication() && authorization()")
   public void authenticate(){
        System.out.println("this is authenicate called");
   }




}
