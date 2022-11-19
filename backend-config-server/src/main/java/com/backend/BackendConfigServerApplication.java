package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author AvinashSankineni
 *
 */
@SpringBootApplication
@EnableConfigServer
public class BackendConfigServerApplication {

	/**
	 * @param args is an array of parameters of type String
	 */
	public static void main(String[] args) {
		SpringApplication.run(BackendConfigServerApplication.class, args);
	}

}
