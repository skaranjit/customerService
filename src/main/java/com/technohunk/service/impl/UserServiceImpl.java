package com.technohunk.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technohunk.dao.UserRepository;
import com.technohunk.dao.entity.CustomerEntity;
import com.technohunk.dao.entity.PaymentEntity;
import com.technohunk.dao.entity.UserCredentialEntity;
import com.technohunk.dto.CustomerDTO;
import com.technohunk.dto.PaymentDto;
import com.technohunk.dto.UserCredentialDto;
import com.technohunk.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public boolean save(UserCredentialDto user) {
		try {
			UserCredentialEntity userEntity = new UserCredentialEntity();
			CustomerEntity customer = new CustomerEntity();
			BeanUtils.copyProperties(user.getCustomer(), customer);
			PaymentEntity pEntity = new PaymentEntity();
			List<PaymentEntity> paymentList = new ArrayList<>();
			if(user.getCustomer().getPaymentCards() != null) {
			for(PaymentDto p : user.getCustomer().getPaymentCards() ) {
				BeanUtils.copyProperties(p, pEntity);
				pEntity.setCustomer(customer);
				paymentList.add(pEntity);
			}
			customer.setPaymentCards(paymentList);
			}
			BeanUtils.copyProperties(user, userEntity);
			userEntity.setCustomer(customer);
			userRepo.save(userEntity);
			return true;
		}
		catch(Exception e) {
		return false;
		}
	}

	@Override
	public boolean deleteById(int id) {
	
		try {
			userRepo.deleteById(id);
			
			return true;
		}
		catch(Exception e) {
		return false;
		}
	}

	@Override
	public UserCredentialDto findById(int id) {
		try {
		UserCredentialDto userDto = new UserCredentialDto();
		UserCredentialEntity userEntity = userRepo.findById(id).get();
		CustomerDTO customer = new CustomerDTO();
		BeanUtils.copyProperties(userEntity.getCustomer(), customer);
		PaymentDto pDto = new PaymentDto();
		List<PaymentDto> paymentList = new ArrayList<>();
		
		for(PaymentEntity p : userEntity.getCustomer().getPaymentCards() ) {
			BeanUtils.copyProperties(p, pDto);
			pDto.setCustomer(customer);
			paymentList.add(pDto);
			
		}
		customer.setPaymentCards(paymentList);
		BeanUtils.copyProperties(userEntity, userDto);
		userDto.setCustomer(customer);
		return userDto;
		
		}
		catch(Exception e) {
		return null;
		}
	}

}
