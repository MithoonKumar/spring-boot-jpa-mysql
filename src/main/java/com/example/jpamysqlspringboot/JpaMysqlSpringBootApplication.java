package com.example.jpamysqlspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class JpaMysqlSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaMysqlSpringBootApplication.class, args);
	}
}
