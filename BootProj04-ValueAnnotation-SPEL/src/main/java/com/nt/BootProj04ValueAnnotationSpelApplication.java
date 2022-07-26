package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Hotel;
import com.nt.beans.MenuItems;

@SpringBootApplication
public class BootProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj04ValueAnnotationSpelApplication.class, args);
	Hotel hotel=ctx.getBean("hotel",Hotel.class);
	System.out.println(hotel);
	//MenuItems m=ctx.getBean("menup",MenuItems.class);
	//System.out.println(m);
	}

}
