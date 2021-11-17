package com.technohunk.dto;

import java.sql.Timestamp;
import java.util.List;
public class CustomerDTO {

	private int cid;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private String photo;
	private String education;
	private Timestamp createdate;
	private Timestamp updateddate;
	private List<PaymentDto> paymentCards;
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Timestamp getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public Timestamp getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Timestamp updateddate) {
		this.updateddate = updateddate;
	}

	
	
	
	public List<PaymentDto> getPaymentCards() {
		return paymentCards;
	}

	public void setPaymentCards(List<PaymentDto> paymentCards) {
		this.paymentCards = paymentCards;
	}

	@Override
	public String toString() {
		return "CustomerDTO [cid=" + cid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", photo=" + photo + ", education=" + education + ", createdate=" + createdate
				+ ", updateddate=" + updateddate + "]";
	}
	

}
