package com.technohunk.dto;



import java.util.Date;



public class PaymentDto {

	
	int id;
	
	long cardNumber;
	
	int securityCode;
	
	String nameOnCard;
	
	
	Date madeAt;
	
	int price;
	
	private CustomerDTO customer;
	public PaymentDto() {
		
	}
	
	public PaymentDto(long cardNumber, int securityCode, String nameOnCard, Date madeAt, int price) {
		super();
		this.cardNumber = cardNumber;
		this.securityCode = securityCode;
		this.nameOnCard = nameOnCard;
		this.madeAt = madeAt;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public Date getMadeAt() {
		return madeAt;
	}

	public void setMadeAt(Date madeAt) {
		this.madeAt = madeAt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
