package com.pavan.dto;

public class AadharDTO {
	
	private int employeeID;
	private long aadharID;
	private String country;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public long getAadharID() {
		return aadharID;
	}

	public void setAadharID(long aadharID) {
		this.aadharID = aadharID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AadharDTO [employeeID=" + employeeID + ", aadharID=" + aadharID + ", country=" + country + "]";
	}

}
