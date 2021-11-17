package com.technohunk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technohunk.dao.entity.CustomerEntity;

//CTR+SHIFT+O
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
