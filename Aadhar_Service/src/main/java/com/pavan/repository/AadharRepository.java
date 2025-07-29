package com.pavan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.entity.Aadhar;

@Repository
public interface AadharRepository extends JpaRepository<Aadhar, Integer> {

	public Aadhar findByEmployeeid(int employeeID);
}
