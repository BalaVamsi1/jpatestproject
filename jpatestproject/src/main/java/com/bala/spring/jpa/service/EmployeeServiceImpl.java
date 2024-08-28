package com.bala.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.spring.jpa.entity.Employee;
import com.bala.spring.jpa.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee) ;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

	@Override
	public Employee findById(long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

}
