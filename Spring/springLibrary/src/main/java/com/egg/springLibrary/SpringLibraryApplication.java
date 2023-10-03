package com.egg.springLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.egg.springLibrary")
public class SpringLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLibraryApplication.class, args);
	}

}
