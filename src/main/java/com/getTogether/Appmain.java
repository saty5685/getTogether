package com.getTogether;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Appmain {
	private static Logger log = LoggerFactory.getLogger(Appmain.class);

	public static void main(String[] args) {
		log.info("Testing Logger");
		SpringApplication.run(Appmain.class, args);
	}

}
