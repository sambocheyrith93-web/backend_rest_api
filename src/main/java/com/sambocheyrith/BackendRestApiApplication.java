package com.sambocheyrith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendRestApiApplication.class, args);

        System.out.println("hello_index");
	}

}
