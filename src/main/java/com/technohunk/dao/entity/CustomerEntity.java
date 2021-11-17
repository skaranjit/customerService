package com.technohunk.dao.entity;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers_tbl")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(length = 50)
	private String name;
	
	@Column(length = 120)
	private String email;

	@Column(length = 15)
	private String mobile;
	
	@Column(length = 6)
	private String gender;
	
	private String photo;
	
	private String education;
	
	private Timestamp createdate;
	
	private Timestamp updateddate;

	@OneToMany(mappedBy="customer")
	private List<PaymentEntity> paymentCards;
	
	
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

	public List<PaymentEntity> getPaymentCards() {
		return paymentCards;
	}

	public void setPaymentCards(List<PaymentEntity> paymentCards) {
		this.paymentCards = paymentCards;
	}

	@Override
	public String toString() {
		return "CustomerEntity [cid=" + cid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", photo=" + photo + ", education=" + education + ", createdate=" + createdate
				+ ", updateddate=" + updateddate + "]";
	}
	

}
