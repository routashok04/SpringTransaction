package com.example.springtransaction.repository;

import com.example.springtransaction.entity.PaymentInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
