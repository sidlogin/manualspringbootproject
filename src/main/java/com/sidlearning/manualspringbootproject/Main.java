package com.sidlearning.manualspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Main.class);
        ConfigurableApplicationContext container = springApplication.run();

        Student student = container.getBean(Student.class);

        System.out.println(student);
        System.out.println("Student Name: " + student.getStudentName());
    }
}