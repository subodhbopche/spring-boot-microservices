package com.bootj8.bootj8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BootJ8Application {

	public static void main(String[] args) {
		SpringApplication.run(BootJ8Application.class, args);
	}

}
