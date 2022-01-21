package com.santosh.springcomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringComponentApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringComponentApplication.class, args);

        Greeting greeting = context.getBean(Greeting.class);
        greeting.setMessage("Good Morning!");

        System.out.println(greeting.getMessage());
    }
}
