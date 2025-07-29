package com.pavan.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.dto.EmployeeDTO;
import com.pavan.entity.Employee;
import com.pavan.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeDTO getEmployeeData(int employeeID) {
		Employee employee = employeeRepository.findById(employeeID).get();
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDTO;
	}
}
