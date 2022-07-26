package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillingConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationController {

	@Autowired
	private IBillingConsumerClient client;
	@GetMapping("/cart")
	public ResponseEntity<String> doShopping()
	{
		String msg=client.getBillingInfo().getBody();
		return new ResponseEntity<String>("Shopping Items are(Bike,Laptop)::"+msg,HttpStatus.OK);
	}
}
