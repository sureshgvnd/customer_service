package com.mycom.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue
	private int Id;
	
	private String name;
	private String password;
	private String city;
	private String country;
	private String isMarried;
}
