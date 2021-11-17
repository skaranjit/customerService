package com.technohunk.dto;



public class VehicleFeaturesDto {

	
	private int id;
	
	private String tyresType;
	
	private int tyrePrice;
	private String interiorDesing;
	private int interiorPrice;
	
	private String speakerType;
	
	private int speakerPrice;

	private VehicleDto vehicle;
	
	
	public VehicleFeaturesDto() {
		super();
	}
	

	public VehicleFeaturesDto(String tyresType, int tyrePrice, String interiorDesing, int interiorPrice,
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
	public VehicleDto getVehicle() {
		return vehicle;
	}


	public void setVehicle(VehicleDto vehicle2) {
		this.vehicle = vehicle2;
	}
	
	
	

}
