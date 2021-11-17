package com.technohunk.service;

import java.util.List;

import com.technohunk.dto.VehicleDto;

public interface VehicleService {
	List<VehicleDto> findAll();
	boolean save(VehicleDto v);
	boolean removeCard(int id);
	boolean update(VehicleDto p );
	
	VehicleDto finById(int id);
}
