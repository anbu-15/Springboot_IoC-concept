package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication 
public class IocDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(IocDemoApplication.class, args);
		Theater th=context.getBean(Theater.class);
		th.entertainment();
	}

}
