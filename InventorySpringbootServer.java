package com.example.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication

@ComponentScan(basePackages = {"com.example.Spring"})
@EntityScan(basePackages = {"com.example.Spring.model"})
@EnableJpaRepositories("com.example.Spring.repository")
public class InventorySpringbootServer {

	public static void main(String[] args) {
		SpringApplication.run(InventorySpringbootServer.class, args);
	}

}
