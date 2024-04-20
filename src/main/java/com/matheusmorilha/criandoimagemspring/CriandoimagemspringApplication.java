package com.matheusmorilha.criandoimagemspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class CriandoimagemspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriandoimagemspringApplication.class, args);
		System.out.println("Hello World");
	}

}
