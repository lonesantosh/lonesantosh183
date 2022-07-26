package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menup")
@Data
public class MenuItems {
	@Value("${menu.vadapav}")
	private Float VadaPav;
	@Value("${menu.idly}")
	private Float IdlyDosa;
	@Value("${menu.samosa}")
	private Float Samosa;
	@Value("${menu.biryani}")
	private Float Biryani;
	
	
}
