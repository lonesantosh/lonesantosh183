package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestServiceController {

	@GetMapping("/data")
	public ResponseEntity<String> show()
	{
		return new ResponseEntity<String>("Welcome to Spring Boot MS",HttpStatus.OK);
	}
}
