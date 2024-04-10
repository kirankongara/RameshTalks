package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findbyID(long eid);
	public List<Employee> findAll();
	
	
	

}
