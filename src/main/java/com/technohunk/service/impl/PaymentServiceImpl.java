package com.technohunk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.technohunk.dto.PaymentDto;
import com.technohunk.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public List<PaymentDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(PaymentDto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeCard(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PaymentDto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PaymentDto selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
