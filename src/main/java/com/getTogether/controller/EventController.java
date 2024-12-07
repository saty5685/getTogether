package com.getTogether.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventController {
	private static Logger log = LoggerFactory.getLogger(EventController.class);

	@GetMapping("/events")
	private Stream<Integer> getEvents() {
		log.info("Logging events");
		return new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)).stream();
	}
}
