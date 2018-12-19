package com.ibm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerTrainingApplication.class, args);
	}

}

