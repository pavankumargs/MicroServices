package com.pavan.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.dto.AadharDTO;
import com.pavan.entity.Aadhar;
import com.pavan.repository.AadharRepository;

@Service
public class AadharService {
	
	@Autowired
	private AadharRepository aadharRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AadharDTO getAadharData(int employeeID) {
		Aadhar aadharData = aadharRepository.findByEmployeeid(employeeID);
		AadharDTO aadharDTO = modelMapper.map(aadharData, AadharDTO.class);
		return aadharDTO;
	}
	
	
}
