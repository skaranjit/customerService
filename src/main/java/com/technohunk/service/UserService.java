package com.technohunk.service;

import com.technohunk.dto.UserCredentialDto;

public interface UserService {
	boolean save(UserCredentialDto user);
	boolean deleteById(int id);
	UserCredentialDto findById(int id);
}
