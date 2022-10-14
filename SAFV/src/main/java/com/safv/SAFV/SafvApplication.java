package com.safv.SAFV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication

public class SafvApplication {

	@CrossOrigin(origins="http://localhost:8080")
	public static void main(String[] args) {
		SpringApplication.run(SafvApplication.class, args);
	}

}
