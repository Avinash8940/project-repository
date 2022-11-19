package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author AvinashSankineni
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class BackendEurekaRegistryApplication {

	/**
	 * @param args is an array of parameters of type String
	 */
	public static void main(String[] args) {
		SpringApplication.run(BackendEurekaRegistryApplication.class, args);
	}

}
