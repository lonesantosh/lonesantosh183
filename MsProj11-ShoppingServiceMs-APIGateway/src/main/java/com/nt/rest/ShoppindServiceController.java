package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shoppingMs")
public class ShoppindServiceController {
	@Autowired
	private RestTemplate template;
@GetMapping("/shopping")
	public String doShopping() {
	String msg=template.getForObject("http://localhost:9092/billingMs/billing", String.class);
	return "Shopping Operation"+msg;
	}
}
