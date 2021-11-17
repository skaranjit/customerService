package com.technohunk.dao.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PaymentHistory")
public class PaymentEntity {

	@Id
	@Column(name="PaymentId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	long CardNumber;
	
	int securityCode;
	
	String nameOnCard;
	
	
	Date madeAt;
	
	int price;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CustomerID")
	private CustomerEntity customer;
	
	
	public PaymentEntity() {
		
	}
	
	public PaymentEntity(long cardNumber, int securityCode, String nameOnCard, Date madeAt, int price) {
		super();
		CardNumber = cardNumber;
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
		return CardNumber;
	}

	public void setCardNumber(long cardNumber) {
		CardNumber = cardNumber;
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

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	
	
	
	
}
