package com.pavan.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pavan.dto.EmployeeDTO;
import com.pavan.entity.Employee;
import com.pavan.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
//	private final String APP_BASE_URL = "http://localhost:8081";
	
	@Value("${app_base_url}")
	private String APP_BASE_URL;
	
			
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public EmployeeDTO getEmployeeData(int employeeID) {
		Employee employee = employeeRepository.findById(employeeID).get();
		EmployeeDTO aadharData = restTemplate.getForObject(APP_BASE_URL+"/aadhar/{employeeID}", EmployeeDTO.class,employeeID);
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		employeeDTO.setAadharnumber(aadharData.getAadharnumber());
		employeeDTO.setCountry(aadharData.getCountry());
		return employeeDTO;
	}
}
