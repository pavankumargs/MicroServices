package com.pavan.dto;

public class AadharDTO {

	private int employeeID;
	private long aadharnumber;
	private String country;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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
		return "AadharDTO [employeeID=" + employeeID + ", aadharnumber=" + aadharnumber + ", country=" + country + "]";
	}

}
