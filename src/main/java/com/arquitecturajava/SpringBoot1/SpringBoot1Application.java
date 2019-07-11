package com.arquitecturajava.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot1Application implements CommandLineRunner{

	@Autowired
	Servicio servicio;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(servicio.mensaje());
	}
}
