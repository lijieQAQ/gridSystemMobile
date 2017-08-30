package com.bjdv.gridSystemMobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class gridSystemApplication {
	public static void main(String[] args) {
		System.out.println(" springApplication run !");
		SpringApplication.run(gridSystemApplication.class, args);
	}
}
