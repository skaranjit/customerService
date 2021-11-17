package com.technohunk.service;

import java.util.List;

import com.technohunk.dto.PurchaseHistoryDto;


public interface PurchaseService {
	
	List<PurchaseHistoryDto> findAll();
	
	boolean save(PurchaseHistoryDto p );
	
	boolean deleteById(int id);
	
	PurchaseHistoryDto getPurchase(int id);
	

}
