package com.technohunk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.technohunk.dto.PurchaseHistoryDto;
import com.technohunk.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Override
	public List<PurchaseHistoryDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(PurchaseHistoryDto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PurchaseHistoryDto getPurchase(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
