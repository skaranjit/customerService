package com.technohunk.dao.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="Car")
public class VehicleEntity {
	@Id
	@Column(name="VehicleID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	int id;
	
	@Column(name="VehicleModel")
	String model;
	
	@Column(name="VehicleMake")
	String make;
	
	@Column(name="Year")
	int year;
	
	private Timestamp createdDate;
	
	private Timestamp lastUpdated;


	@OneToMany(mappedBy = "vehicle")
	List<VehicleFeatures> vehicleFeatures;
	
	public VehicleEntity() {}
	
	public VehicleEntity(String model, String make, int year, Timestamp createdDate, Timestamp lastUpdated) {
		super();
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.createdDate = createdDate;
		this.lastUpdated = lastUpdated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public List<VehicleFeatures> getVehicleFeatures() {
		return vehicleFeatures;
	}

	public void setVehicleFeatures(List<VehicleFeatures> vehicleFeatures) {
		this.vehicleFeatures = vehicleFeatures;
	}
	
	
	
	
	
}
