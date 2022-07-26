package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServcieConsumerClient {
	@Autowired
	private DiscoveryClient client;

	public String getBillingInfo() {
		List<ServiceInstance> listinstance = client.getInstances("Billing-Service");
		ServiceInstance instance = listinstance.get(0);
		URI uri = instance.getUri();
		String url = uri.toString() + "/billing/api/info";
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity(url, String.class);

		String responseContent = response.getBody();
		return responseContent;
	}
}
