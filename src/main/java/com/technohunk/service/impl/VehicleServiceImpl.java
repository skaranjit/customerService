package com.technohunk.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technohunk.dao.VehicleRepository;
import com.technohunk.dao.entity.VehicleEntity;
import com.technohunk.dao.entity.VehicleFeatures;
import com.technohunk.dto.VehicleDto;
import com.technohunk.dto.VehicleFeaturesDto;
import com.technohunk.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleRepository vehicleRepo;
	
	@Override
	public List<VehicleDto> findAll() {
		List<VehicleDto> vDtos = new ArrayList<>();
		List<VehicleEntity> v = vehicleRepo.findAll();
	
		for(VehicleEntity vE : v) {
			VehicleDto vDto = new VehicleDto();
			BeanUtils.copyProperties(vE, vDto);
			VehicleFeaturesDto vF = new VehicleFeaturesDto();
			List<VehicleFeaturesDto> vFDtos = new ArrayList<>();

			for(VehicleFeatures vFe : vE.getVehicleFeatures() ) {
				BeanUtils.copyProperties(vFe, vF);
				
				vFDtos.add(vF);
			}
			vDto.setVehicleFeatures(vFDtos);
			vDtos.add(vDto);
			
		}
		return vDtos;
	}

	@Override
	public boolean save(VehicleDto v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeCard(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(VehicleDto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public VehicleDto finById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
