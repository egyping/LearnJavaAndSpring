package com.amigosmaster.amigosmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class AmigosmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosmasterApplication.class, args);
	}

	}


