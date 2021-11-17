package com.technohunk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technohunk.dao.entity.VehicleEntity;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity,Integer>{

}
