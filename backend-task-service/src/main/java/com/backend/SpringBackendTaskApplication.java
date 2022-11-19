package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

/**
 * @author AvinashSankineni
 *
 */
@SpringBootApplication
@PropertySource("classpath:application.yml")
@EnableDiscoveryClient
public class SpringBackendTaskApplication{

	/**
	 * @param args is an array of parameters of type String
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBackendTaskApplication.class, args);
	}
	
}	

