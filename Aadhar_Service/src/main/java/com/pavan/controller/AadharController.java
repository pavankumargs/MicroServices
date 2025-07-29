package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.dto.AadharDTO;
import com.pavan.service.AadharService;

@RestController
@RequestMapping("/aadhar")
public class AadharController {
	
	@Autowired
	private AadharService aadharService;
	
	@GetMapping("/{employeeID}")
	public AadharDTO getAadharData(@PathVariable("employeeID") int employeeID) {
		AadharDTO aadharDTO = aadharService.getAadharData(employeeID);
		return aadharDTO;
	}
}
