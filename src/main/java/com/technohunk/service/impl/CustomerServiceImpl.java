package com.technohunk.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technohunk.dao.CustomerRepository;
import com.technohunk.dao.entity.CustomerEntity;
import com.technohunk.dto.CustomerDTO;
import com.technohunk.mapper.CustomerMapper;
import com.technohunk.service.CustomerService;

@Service
public class CustomerServiceImpl implements  CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void save(CustomerDTO customerDTO) {
		customerRepository.save(CustomerMapper.toDB(customerDTO, "add"));
	}
	
	@Override
	public CustomerDTO findById(int cid){
		CustomerEntity customerEntity=customerRepository.findById(cid).get();
		return CustomerMapper.toDTO(customerEntity);
	}
	
	@Override
	public void deleteById(int cid) {
		customerRepository.deleteById(cid);
	}
	
	@Override
	public void update(CustomerDTO customerDTO) {
		customerRepository.save(CustomerMapper.toDB(customerDTO, "update"));
	}
	
	@Override
	public List<CustomerDTO> findAll(){
		List<CustomerDTO> customerDTOs=new ArrayList<>();
		List<CustomerEntity> customerList=customerRepository.findAll();
		for(CustomerEntity entity: customerList) {
			customerDTOs.add(CustomerMapper.toDTO(entity));
		}
		//return customerList.stream().map(CustomerMapper::toDTO).collect(Collectors.toList());
		return customerDTOs;
	}

}
