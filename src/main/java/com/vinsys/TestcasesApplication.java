package com.vinsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TestcasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcasesApplication.class, args);
	}

}
