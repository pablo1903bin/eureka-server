package com.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootMicroservice4EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice4EurekaApplication.class, args);
	}

}
