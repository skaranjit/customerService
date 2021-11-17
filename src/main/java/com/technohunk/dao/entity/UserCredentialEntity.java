package com.technohunk.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserCredentialEntity {

	
	@Id
	@Column(name="UserID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String username;
	
	String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CustomerID")
	CustomerEntity customer;

	
	
	public UserCredentialEntity(String username, String password, CustomerEntity customer) {
		super();
		this.username = username;
		this.password = password;
		this.customer = customer;
	}

	public UserCredentialEntity() {
		// TODO Auto-generated constructor stub
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

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	
	
	
}
