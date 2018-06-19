package com.mak.springbootapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootDemoApplication.class, args);
		springApplication.run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Running spring boot and standAlone Application.");
	}
}
