package com.technohunk.dto;

public class UserCredentialDto {

	int id;
	String username;
	String password;
	
	CustomerDTO customer;
	
	
	public UserCredentialDto() {
		
	}


	public UserCredentialDto(String username, String password, CustomerDTO customer) {
		super();
		this.username = username;
		this.password = password;
		this.customer = customer;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public CustomerDTO getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	
	
	
}
