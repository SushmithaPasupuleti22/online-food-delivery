package com.capgemini.onlinefooddelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class Onlinefooddelivery {

	public static void main(String[] args) {
		SpringApplication.run(Onlinefooddelivery.class, args);
	}

}
