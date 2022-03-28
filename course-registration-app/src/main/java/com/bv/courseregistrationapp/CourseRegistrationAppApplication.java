package com.bv.courseregistrationapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()
public class CourseRegistrationAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseRegistrationAppApplication.class, args);
        System.out.println("---------------------");
        System.out.println("Server Up and Running");
        System.out.println("Connected to Database");
        System.out.println("---------------------");
    }

}
