package com.pavan.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.pavan.dto.EmployeeDTO;
import com.pavan.entity.Employee;
import com.pavan.feignclient.AadharFeignClient;
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
	
	@Autowired
	private WebClient webClient;
	
	@Autowired
	private AadharFeignClient aadharFeignClient;
	
	public EmployeeDTO getEmployeeData(int employeeID) {
		Employee employee = employeeRepository.findById(employeeID).get();
		
//		Below one is Rest Template we are getting the aadhar response by using Rest Template(synchronus)
//		EmployeeDTO aadharData = restTemplate.getForObject(APP_BASE_URL+"/aadhar/{employeeID}", EmployeeDTO.class,employeeID);
		
//		below one is web client, we are getting the aadhar response by using web client(asyncronus)
//		EmployeeDTO aadharData = webClient.get().uri(APP_BASE_URL+"/aadhar/{employeeID}",employeeID).retrieve().bodyToMono(EmployeeDTO.class).block();
		
//		below one is feign client, we are getting the aadhar response by using feign client
		EmployeeDTO aadharData = aadharFeignClient.getAadharData(employeeID);
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		employeeDTO.setAadharnumber(aadharData.getAadharnumber());
		employeeDTO.setCountry(aadharData.getCountry());
		return employeeDTO;
	}
}
