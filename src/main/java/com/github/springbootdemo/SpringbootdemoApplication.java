package com.github.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
        System.out.println("Starting ***** ");
        SpringApplication.run(SpringbootdemoApplication.class, args);
        System.out.println("*** >> This is a springbootdemo! << ***");
    }
}
