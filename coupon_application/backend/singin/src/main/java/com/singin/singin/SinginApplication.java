package com.singin.singin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SinginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinginApplication.class, args);
	}

}
