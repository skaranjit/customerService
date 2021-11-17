package com.technohunk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.technohunk.dao.entity.UserCredentialEntity;

@Repository
public interface UserRepository extends JpaRepository<UserCredentialEntity,Integer>{

	

	
}
