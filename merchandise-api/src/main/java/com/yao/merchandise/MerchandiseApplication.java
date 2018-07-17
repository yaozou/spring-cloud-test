package com.yao.merchandise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MerchandiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchandiseApplication.class, args);
	}
}
