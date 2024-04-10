package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String insertEmployee(Model model)
	{
		Employee employee = new Employee();
		employee.setEname("K");
		employee.setEdesignation("J");
		employee.setEexp(1);
		employee.setEdepartment("C");

		Employee emp=employeeService.saveEmployee(employee);
		String msg ="Employee "+emp.getEname()+" with id "+emp.getEid()+" is saved " ;
		
		model.addAttribute("employee",emp);
		model.addAttribute("message",msg);
		
		
		return "home";
	}

}
