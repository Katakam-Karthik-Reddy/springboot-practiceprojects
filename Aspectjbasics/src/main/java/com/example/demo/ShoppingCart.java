package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status){
        System.out.println("checkout method from shoppingcart is called");
    }
    public int counting(int count){
        return count;
    }
}
