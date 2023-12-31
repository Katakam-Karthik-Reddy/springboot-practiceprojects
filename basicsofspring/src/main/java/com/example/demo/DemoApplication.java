package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.testing.Doctor;

public class DemoApplication {


	public static void main(String[] args) {
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.setName("bean");
        System.out.println(doctor);
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);

    }

}