package com.egg.springLibreria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.egg.springLibrary")
public class SpringLibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLibreriaApplication.class, args);
	}

}
