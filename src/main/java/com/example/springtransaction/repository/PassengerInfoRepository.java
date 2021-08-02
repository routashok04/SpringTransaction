package com.example.springtransaction.repository;

import com.example.springtransaction.entity.PassengerInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
