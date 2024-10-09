package com.formacionbdi.springboot.app.eureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootServicioEurekaServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioEurekaServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("**************************************");
		System.out.println("EUREKA V-241008 20:17");
	}

}
