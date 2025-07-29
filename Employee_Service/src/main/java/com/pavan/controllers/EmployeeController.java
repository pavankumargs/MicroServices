package com.pavan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.dto.EmployeeDTO;
import com.pavan.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{employeeID}")
	public EmployeeDTO getEmployeeData(@PathVariable("employeeID") int employeeID) {
		EmployeeDTO employeeDTO = employeeService.getEmployeeData(employeeID);
		return employeeDTO;
	}
}
