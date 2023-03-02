package com.blogapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class BlogappapiApplication {
	//private final Logger logger = LoggerFactory.getLogger(BlogappapiApplication.class);

	public static void main(String[] args) {


		System.out.println("Application Started. ");
		SpringApplication.run(BlogappapiApplication.class, args);
	}

}
