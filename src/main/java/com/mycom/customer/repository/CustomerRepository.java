package com.mycom.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycom.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByName(String name);
}
