package com.technohunk.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VehicleFeatures {

	

		@Id
		@Column(name="FeaturesID")
		private int id;
		
		@Column(name="TyreTypes")
		private String tyresType;
		
		@Column(name="TyrePrice")
		private int tyrePrice;
		
		@Column(name="InteriorDesign")
		String interiorDesing;
		@Column(name="InteriorPrice")
		private int interiorPrice;
		
		@Column(name="SpeakerType")
		private String speakerType;
		
		@Column(name="SpeakerPrice")
		private int speakerPrice;

		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="VehicleID")
		private VehicleEntity vehicle;
		
		
		
		public VehicleFeatures() {
			super();
		}
		

		public VehicleFeatures(String tyresType, int tyrePrice, String interiorDesing, int interiorPrice,
				String speakerType, int speakerPrice) {
			super();
			this.tyresType = tyresType;
			this.tyrePrice = tyrePrice;
			this.interiorDesing = interiorDesing;
			this.interiorPrice = interiorPrice;
			this.speakerType = speakerType;
			this.speakerPrice = speakerPrice;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTyresType() {
			return tyresType;
		}

		public void setTyresType(String tyresType) {
			this.tyresType = tyresType;
		}

		public int getTyrePrice() {
			return tyrePrice;
		}

		public void setTyrePrice(int tyrePrice) {
			this.tyrePrice = tyrePrice;
		}

		public String getInteriorDesing() {
			return interiorDesing;
		}

		public void setInteriorDesing(String interiorDesing) {
			this.interiorDesing = interiorDesing;
		}

		public int getInteriorPrice() {
			return interiorPrice;
		}

		public void setInteriorPrice(int interiorPrice) {
			this.interiorPrice = interiorPrice;
		}

		public String getSpeakerType() {
			return speakerType;
		}

		public void setSpeakerType(String speakerType) {
			this.speakerType = speakerType;
		}

		public int getSpeakerPrice() {
			return speakerPrice;
		}

		public void setSpeakerPrice(int speakerPrice) {
			this.speakerPrice = speakerPrice;
		}


		public VehicleEntity getVehicle() {
			return vehicle;
		}


		public void setVehicle(VehicleEntity vehicle) {
			this.vehicle = vehicle;
		}
		
		

	}

