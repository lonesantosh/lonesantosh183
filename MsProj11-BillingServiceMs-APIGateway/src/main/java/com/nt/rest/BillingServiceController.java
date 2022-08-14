package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/billingMs")
public class BillingServiceController {
	@Autowired
	private RestTemplate template;
@GetMapping("/billing")
	public String doBilling() {
		String msg=template.getForObject("http://localhost:9093/paymentMs/payment",String.class);
		return "Bill Amt :9000"+msg;
	}
}
