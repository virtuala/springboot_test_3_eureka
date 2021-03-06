package com.example.springboot_test_3_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootTest3EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest3EurekaApplication.class, args);
	}

}
