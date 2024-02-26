package com.back.payetonkawa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PayetonkawaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PayetonkawaApplication.class, args);
	}

}
