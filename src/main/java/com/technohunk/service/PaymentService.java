package com.technohunk.service;

import java.util.List;

import com.technohunk.dto.PaymentDto;

public interface PaymentService {
	List<PaymentDto> findAll();
	boolean save(PaymentDto p);
	boolean removeCard(int id);
	boolean update(PaymentDto p );
	
	PaymentDto selectOne(int id);
}
