package com.pavan.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pavan.dto.EmployeeDTO;

@FeignClient(name="Aadhar-Service", url="http://localhost:8081")
public interface AadharFeignClient {
	
	@GetMapping("/aadhar/{employeeID}")
	public EmployeeDTO getAadharData(@PathVariable("employeeID") int employeeID);
}
