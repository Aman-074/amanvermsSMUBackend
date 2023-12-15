package com.smuproject.grocery.repository;

import com.smuproject.grocery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
