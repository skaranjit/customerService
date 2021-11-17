package com.technohunk.service;

import java.util.List;

import com.technohunk.dto.CustomerDTO;

public interface CustomerService {

	void save(CustomerDTO customerDTO);

	List<CustomerDTO> findAll();

	void update(CustomerDTO customerDTO);

	void deleteById(int cid);

	CustomerDTO findById(int cid);

}
