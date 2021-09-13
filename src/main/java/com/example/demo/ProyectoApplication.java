package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ProyectoApplication {
// en spring boot YA NO HAY ARCHIVOS DE BEANS XML
	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

}
