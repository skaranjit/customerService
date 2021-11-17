package com.technohunk.dao.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PurchaseHistory {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PurchaseID")
	int id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CustomerID")
	CustomerEntity customer;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PaymentID")
	PaymentEntity payments;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="VehiclePurchased")
	VehicleEntity vehiclePurchased;
	
	Timestamp datePurchased;

	
	
	
	public PurchaseHistory() {
		super();
	}

	public PurchaseHistory(CustomerEntity customer, PaymentEntity payments, VehicleEntity vehiclePurchased,
			Timestamp datePurchased) {
		super();
		this.customer = customer;
		this.payments = payments;
		this.vehiclePurchased = vehiclePurchased;
		this.datePurchased = datePurchased;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public PaymentEntity getPayments() {
		return payments;
	}

	public void setPayments(PaymentEntity payments) {
		this.payments = payments;
	}

	public VehicleEntity getVehiclePurchased() {
		return vehiclePurchased;
	}

	public void setVehiclePurchased(VehicleEntity vehiclePurchased) {
		this.vehiclePurchased = vehiclePurchased;
	}

	public Timestamp getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(Timestamp datePurchased) {
		this.datePurchased = datePurchased;
	}
	
	
}
