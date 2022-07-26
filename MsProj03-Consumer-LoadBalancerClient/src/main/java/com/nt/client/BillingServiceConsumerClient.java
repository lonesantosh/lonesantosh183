package com.nt.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {
	@Autowired
	private LoadBalancerClient client;

	public String getBillingInfo() {
		ServiceInstance instance = client.choose("Billing-Service");//Billing-Service
		URI uri = instance.getUri();
		String url = uri.toString() + "/billing/api/info";
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		String resultContent=response.getBody();
		return resultContent;
	}

}
