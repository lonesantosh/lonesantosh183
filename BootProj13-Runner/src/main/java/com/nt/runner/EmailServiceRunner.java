package com.nt.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("EmailServiceRunner.run()");	
	    System.out.println("No Option args"+args.getNonOptionArgs());
	    System.out.println(" Option arg Names/keys"+args.getOptionNames());
	    System.out.println("Source args"+Arrays.toString(args.getSourceArgs()));
}
}