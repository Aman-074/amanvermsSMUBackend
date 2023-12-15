package com.smuproject.grocery.repository;

import com.smuproject.grocery.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
