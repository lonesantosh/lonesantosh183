package com.nt.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingInfoController {
	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceid;
	
	@GetMapping("/info")
	public ResponseEntity<String> fetchBillingInfo(){
		return new ResponseEntity<String>("Final Bill Amt=BillAmt-discount(Rs.5000)::using instanceid"+instanceid+" "+port,HttpStatus.OK);
	}

}
