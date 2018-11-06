package com.example.springcloudbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudBusApplication.class, args);
	}
}
