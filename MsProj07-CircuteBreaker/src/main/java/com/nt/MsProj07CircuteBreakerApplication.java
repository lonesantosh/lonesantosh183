package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class MsProj07CircuteBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj07CircuteBreakerApplication.class, args);
	}

}
