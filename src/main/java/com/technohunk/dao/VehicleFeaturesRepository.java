package com.technohunk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technohunk.dao.entity.VehicleFeatures;

@Repository
public interface VehicleFeaturesRepository extends JpaRepository<VehicleFeatures,Integer>{

}
