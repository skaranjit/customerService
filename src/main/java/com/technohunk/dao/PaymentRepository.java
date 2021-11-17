package com.technohunk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technohunk.dao.entity.PaymentEntity;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity,Integer> {

}
