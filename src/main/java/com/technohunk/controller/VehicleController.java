package com.technohunk.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technohunk.dto.VehicleDto;
import com.technohunk.dto.VehicleFeaturesDto;
import com.technohunk.service.VehicleService;

@RestController
@RequestMapping("/v1")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	@GetMapping("/vehicles")
	public List<VehicleDto> getAllVehicle(){
		return vehicleService.findAll();
	}
	
	@GetMapping("/vehicles/{vid}")
	public VehicleDto getVehicle(@PathVariable int vid) {
		return vehicleService.finById(vid);
	}
	
	@PostMapping("/vehicles")
	public ResponseEntity<?> addVehicle(@RequestBody VehicleDto vehicle,@RequestBody VehicleFeaturesDto features ) {
		features.setVehicle(vehicle);
		URI v = null; 
		if(vehicleService.save(vehicle)) {
			try {
				v = new URI("/vehicles");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return (ResponseEntity<?>) ResponseEntity.created(v);
		}
		return (ResponseEntity<?>) ResponseEntity.unprocessableEntity();
	}
	
}
