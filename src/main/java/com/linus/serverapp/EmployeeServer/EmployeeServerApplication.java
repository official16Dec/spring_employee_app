package com.linus.serverapp.EmployeeServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.linus.serverapp")
@EnableAutoConfiguration
@EnableJpaRepositories("com.linus.serverapp.repo")
@EntityScan("com.linus.serverapp.model")
public class EmployeeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServerApplication.class, args);
	}

}
