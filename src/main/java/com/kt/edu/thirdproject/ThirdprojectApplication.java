package com.kt.edu.thirdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kt")
@EnableFeignClients
public class ThirdprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdprojectApplication.class, args);
	}

}

