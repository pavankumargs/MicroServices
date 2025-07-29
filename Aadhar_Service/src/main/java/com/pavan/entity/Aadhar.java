package com.pavan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {

	@Id
	private int id;
	private int employeeid;
	private long aadharnumber;
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public long getAadharnumber() {
		return aadharnumber;
	}

	public void setAadharnumber(long aadharnumber) {
		this.aadharnumber = aadharnumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", employeeid=" + employeeid + ", aadharnumber=" + aadharnumber + ", country="
				+ country + "]";
	}

}
