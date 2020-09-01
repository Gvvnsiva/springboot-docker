package org.dxc.docker.controller;

import org.dxc.docker.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomerController {
	@RequestMapping("/customer")
	public Customer displayCustomer() {
		Customer customer=new Customer("siva","siva@gmail.com","9999378844");
		return customer;
		
		
	}

}
