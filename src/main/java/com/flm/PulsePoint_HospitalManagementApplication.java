package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class PulsePoint_HospitalManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PulsePoint_HospitalManagementApplication.class, args);
	}
	

}
