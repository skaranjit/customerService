package com.technohunk.dto;

import java.sql.Timestamp;

public class PurchaseHistoryDto {
	
	int id;
	
	CustomerDTO customer;
	
	PaymentDto payments;
	
	VehicleDto vehiclePurchased;
	
	Timestamp datePurchased;

	
	
	
	public PurchaseHistoryDto() {
		super();
	}

	public PurchaseHistoryDto(CustomerDTO customer, PaymentDto payments, VehicleDto vehiclePurchased,
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

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public PaymentDto getPayments() {
		return payments;
	}

	public void setPayments(PaymentDto payments) {
		this.payments = payments;
	}

	public VehicleDto getVehiclePurchased() {
		return vehiclePurchased;
	}

	public void setVehiclePurchased(VehicleDto vehiclePurchased) {
		this.vehiclePurchased = vehiclePurchased;
	}

	public Timestamp getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(Timestamp datePurchased) {
		this.datePurchased = datePurchased;
	}
	
}
