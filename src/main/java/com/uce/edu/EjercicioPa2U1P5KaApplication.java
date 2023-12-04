package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioPa2U1P5KaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPa2U1P5KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundo");
	}
}
