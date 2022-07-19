package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;
@Component("cont")
public class MainController {
		@Autowired
		private IEmployeeMgmtService service;
		public List<Employee> showEmployeeByDesg(String desg1,String desg2,String desg3)throws Exception
		{
			System.out.println("MainController.showEmployeeByDesg()");
			List<Employee> list=service.fetchEmployeeByDesg(desg1, desg2, desg3);
			return  list;
		}
	
}
