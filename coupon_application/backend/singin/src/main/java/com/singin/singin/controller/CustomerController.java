package com.singin.singin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singin.singin.model.Customer;
import com.singin.singin.repository.CustomerRepository;

@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping("/api")
	public class CustomerController {
	 
		@Autowired
	    CustomerRepository repository;
		 @GetMapping("/customer")
		  public List<Customer> getAllCustomers() {
		   return  repository.findAll();
		  }


		  @PostMapping("/customer/validate")
		  public Customer validateUser(@RequestBody Customer userlog) {

		  	List<Customer> login=repository.findAll();
//		  	System.out.println(login);
		  	for(Customer dblog:login) {
		  		if(dblog.getUsername().equals(userlog.getUsername())&&dblog.getPassword().equals(userlog.getPassword())) {
		  			return dblog;
		  	}
		  	
		  	
		  }
		  	return null;
		  }

}
