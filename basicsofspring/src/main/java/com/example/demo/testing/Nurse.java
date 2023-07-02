package com.example.demo.testing;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Stuff{
    public void assist(){
        System.out.println("this is nurse is assisting");
    }

}
