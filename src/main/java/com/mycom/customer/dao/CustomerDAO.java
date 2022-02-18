package com.mycom.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycom.customer.entity.Customer;
import com.mycom.customer.repository.CustomerRepository;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer addCustomer(Customer customer) {
	
		return customerRepository.save(customer);
	}
	
	public List<Customer> listCustomers(){
		return customerRepository.findAll();
	}
	
	public Customer updateCustomer(Customer customer) {
		
		Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
		
		existingCustomer.setName(customer.getName());
		existingCustomer.setCity(customer.getCity());
		existingCustomer.setPassword(customer.getPassword());		
		return customerRepository.save(existingCustomer);
	}
	
	public List<Customer> findCustomerByName(String name) {
		return customerRepository.findByName(name);
	}
	
	public String deleteCustomer(int id) {
		customerRepository.deleteById(id);		
		return "Deleted successfully";
	}
}
