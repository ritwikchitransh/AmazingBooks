package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//scanBasePackages={"com.example.demo.service.BookService"}
@SpringBootApplication(scanBasePackages={"com.example.demo.service.BookService,com.example.demo.controller"})
@ComponentScan
public class AmazingBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazingBooksApplication.class, args);
	}

}
