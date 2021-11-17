package com.technohunk.service;

import java.util.List;

import com.technohunk.dto.VehicleFeaturesDto;

public interface VehicleFeaturesService {
	List<VehicleFeaturesDto> findAll();
	boolean save(VehicleFeaturesDto v);
	boolean removeCard(int id);
	boolean update(VehicleFeaturesDto p );
	
	VehicleFeaturesDto finById(int id);
}
