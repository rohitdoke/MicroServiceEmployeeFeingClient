package com.justimagine.Response;

public class EmployeeResponse {
	
	private Integer id;
	
	
	private String name;
	
	
	private String email;
	
	
	private String bloodgroup;
	
	private AddressResponse addressresponse;


	public Integer getId() {
		return id;
	}


	public AddressResponse getAddressresponse() {
		return addressresponse;
	}


	public void setAddressresponse(AddressResponse addressresponse) {
		this.addressresponse = addressresponse;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}


	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	

}
