package com.mycom.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.customer.dao.CustomerDAO;
import com.mycom.customer.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public Customer addCustomer(Customer customer) {
		return customerDAO.addCustomer(customer);
	}
	
	public List<Customer> listCustomers(){
		return customerDAO.listCustomers();
	}
	
	public Customer updateCustomer(Customer customer) {
		return customerDAO.updateCustomer(customer);
	}
	
	public List<Customer> listCustomersByName(String name){
		return customerDAO.findCustomerByName(name);
	}
	
	public String deleteCustomer(int id) {
		return customerDAO.deleteCustomer(id);
	}
}
