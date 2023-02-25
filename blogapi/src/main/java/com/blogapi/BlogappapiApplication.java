package com.blogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class BlogappapiApplication {

	public static void main(String[] args) {


		System.out.println("Application Started. ");
		SpringApplication.run(BlogappapiApplication.class, args);
	}

}
