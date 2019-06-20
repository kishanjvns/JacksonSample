package com.tech.kj.JacksonSample;

import javax.validation.constraints.NotNull;
public class Address {
	private String addressLine1;
	@NotNull
	private String addressLine2;
	@NotNull
	private String contactNo;
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", contactNo=" + contactNo
				+ "]";
	}
	
}
