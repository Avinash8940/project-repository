package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author AvinashSankineni
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BackendCloudGatewayApplication {

	/**
	 * @param args is an array of parameters of type String
	 */
	public static void main(String[] args) {
		SpringApplication.run(BackendCloudGatewayApplication.class, args);
	}

}
