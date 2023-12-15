package com.smuproject.grocery.repository;

import com.smuproject.grocery.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
