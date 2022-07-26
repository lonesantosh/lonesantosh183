package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingServcieConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationController {
	@Autowired
	private BillingServcieConsumerClient service;

	@GetMapping("/cart")
	public ResponseEntity<String> doShopping() {
		String resultMsg = service.getBillingInfo();
		return new ResponseEntity<String>("Shopping Items(Shirt,Shoes) ::" + resultMsg, HttpStatus.OK);
	}
}
