package com.mycom.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.customer.entity.Customer;
import com.mycom.customer.service.CustomerService;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/checkme")
	public String isItUP() {
		return "I am here...";
	}
	
	@PostMapping("/addcustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/listcustomers")
	public List<Customer> listCustomers(){
		return customerService.listCustomers();
	}
	
	@PutMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer curtomer) {
		
		return customerService.updateCustomer(curtomer);
	}
	
	@GetMapping("/findcustomers/{name}")
	public List<Customer> findCustomersByName(@PathVariable String name){
		return customerService.listCustomersByName(name);
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public String deleteUser(@PathVariable int id) {
		return customerService.deleteCustomer(id);
	}
}
