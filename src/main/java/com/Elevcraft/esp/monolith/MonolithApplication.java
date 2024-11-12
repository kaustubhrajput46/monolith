package com.Elevcraft.esp.monolith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonolithApplication {

	private static final Logger log = LoggerFactory.getLogger(MonolithApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MonolithApplication.class, args);
	}
}
