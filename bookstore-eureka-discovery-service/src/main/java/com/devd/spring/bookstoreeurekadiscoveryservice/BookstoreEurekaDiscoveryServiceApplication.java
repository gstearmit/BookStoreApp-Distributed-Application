package com.devd.spring.bookstoreeurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class BookstoreEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreEurekaDiscoveryServiceApplication.class, args);
	}

}
