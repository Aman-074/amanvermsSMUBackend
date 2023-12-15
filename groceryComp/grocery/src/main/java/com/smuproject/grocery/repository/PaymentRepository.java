package com.smuproject.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smuproject.grocery.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
