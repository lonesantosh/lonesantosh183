package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.MainController;
import com.nt.model.Employee;
@Component
public class LayredAppTestingRunner implements CommandLineRunner {
	@Autowired
	private MainController controller;
	
	public LayredAppTestingRunner() {
		System.out.println("LayredAppTestingRunner...0-Param constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("LayredAppTestingRunner.RUN()");
		try {
			List<Employee> list=controller.showEmployeeByDesg("sister", "Aai", "Baba");
		list.forEach(emp->
		{
			System.out.println(emp);
		});
		}catch(Exception e)
		{
			e.printStackTrace();
			System.err.println("Internal Server Error --try again"+e.getMessage());
		}
	}

}
