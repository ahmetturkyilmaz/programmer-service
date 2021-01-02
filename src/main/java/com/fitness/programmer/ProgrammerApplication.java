package com.fitness.programmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProgrammerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgrammerApplication.class, args);
	}

}
