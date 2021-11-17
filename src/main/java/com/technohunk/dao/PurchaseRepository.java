package com.technohunk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technohunk.dao.entity.PurchaseHistory;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseHistory,Integer> {

}
