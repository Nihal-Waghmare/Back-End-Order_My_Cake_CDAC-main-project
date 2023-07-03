package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
