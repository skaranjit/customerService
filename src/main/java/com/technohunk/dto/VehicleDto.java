package com.technohunk.dto;

import java.sql.Timestamp;
import java.util.List;


public class VehicleDto {
	
		int id;
		
		String model;
		
		String make;
		
		int year;
		
		Timestamp createdDate;
		
		Timestamp lastUpdated;

		List<VehicleFeaturesDto> vehicleFeatures;
		
		public VehicleDto(String model, String make, int year, Timestamp createdDate, Timestamp lastUpdated) {
			super();
			
			this.model = model;
			this.make = make;
			this.year = year;
			this.createdDate = createdDate;
			this.lastUpdated = lastUpdated;
		}
		

		public VehicleDto() {
			super();
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

		public Timestamp getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Timestamp createdDate) {
			this.createdDate = createdDate;
		}

		public Timestamp getLastUpdated() {
			return lastUpdated;
		}

		public void setLastUpdated(Timestamp lastUpdated) {
			this.lastUpdated = lastUpdated;
		}


		public List<VehicleFeaturesDto> getVehicleFeatures() {
			return vehicleFeatures;
		}

		public void setVehicleFeatures(List<VehicleFeaturesDto> vehicleFeatures) {
			this.vehicleFeatures = vehicleFeatures;
		}
		
		
		
		
		
		
		
	}


