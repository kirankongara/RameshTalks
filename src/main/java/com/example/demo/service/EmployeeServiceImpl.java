package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	@SuppressWarnings("null")
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@SuppressWarnings("null")
	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
    @SuppressWarnings("null")
	@Override
	public void deleteEmployee( Employee employee) {
		 employeeRepository.delete(employee);
	}
	
	@Override
	public Employee findbyID(long eid) {
		return employeeRepository.findById(eid).get();
	}
  
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

}
