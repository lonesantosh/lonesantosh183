package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Hotel {
	@Value("123")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.add}")
	private String hotelAddrs;
	@Value("${hotel.contact}")
	private Long mobileNo;
	
	@Value("${customer.name}")
	private String customerName;
	@Value("#{menup.biryani + menup.vadaPav}")
	private Float billAmt;
	
	@Value("${os.name}")
	private String osName;
	@Value("${user.name}")
	private String windowsName;
	@Value("${path}")
	private String pathData;

}
