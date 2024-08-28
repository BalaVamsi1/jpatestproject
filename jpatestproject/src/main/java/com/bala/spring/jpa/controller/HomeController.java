package com.bala.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.spring.jpa.entity.Employee;
import com.bala.spring.jpa.service.EmployeeService;

@Controller
public class HomeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/")
	public String insertEmployee(Model model) {
		Employee employee=new Employee();
		employee.setName("Balu");
		employee.setDesignation("Team Lead");
		employee.setExp(10);
		employee.setDepartment("Finace");
		Employee emp=employeeService.saveEmployee(employee);
		 String msg="Employee "+emp.getName()+" with id " +emp.getId()+"is saved successfully";
		 model.addAttribute("employee", emp);
		 model.addAttribute("message", msg);
		 return "home";
	}

	

}
