package com.pachas.sistemaalmacen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SistemaAlmacen2Application {

	public static void main(String[] args) {
		SpringApplication.run(SistemaAlmacen2Application.class, args);
	}

}
