package com.jdbcexample.demo;

import com.jdbcexample.demo.testing.Nurse;
import com.jdbcexample.demo.testing.Stuff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbcexample.demo.testing.Doctor;

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