package com.project.signup.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.signup.models.Customer;
import com.project.signup.repository.CustomerRepository;



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
	
 
  @PostMapping("/customer/signup")
  public Customer postCustomer(@RequestBody Customer customer)   { 
    return repository.insert(customer);
  }
 


  
//	@PostMapping("/customer/validate")
//	boolean validateUser(@RequestBody Customer userlog) {
//
//	List<Customer> login=repository.findAll();
//	for(Customer dblog:login) {
//		if(dblog.getUsername().equals(userlog.getUsername())&&dblog.getPassword().equals(userlog.getPassword())) {
//			return true;
//	}
//	
//	
//}
//	return false;
//}
}  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  







//@PostMapping("/customer/validate")
//public boolean validateCustomer(@RequestBody Customer customer)  {
//  boolean isTrue;
//if(repository.existsById(customer.getUsername()) && repository.existsById(customer.getPassword()))   {
//   isTrue= true;
//}
//else {
//   isTrue= false;
//}
//return isTrue;
//
//}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
//
//@DeleteMapping("/customers/{username}")
//public ResponseEntity<String> deleteCustomer(@PathVariable("username") String username) 
//{
//  repository.deleteById(username);
//  return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
//}
//

  
//@RequestMapping("/hello")
//public String display() {
//	  System.out.println("hiii");
//	  return "hello";
//}
  
  
// 
//  @DeleteMapping("/customers/delete")
//  public ResponseEntity<String> deleteAllCustomers() {
//    System.out.println("Delete All Customers...");
// 
//    repository.deleteAll();
// 
//    return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
//  }
 
//  @GetMapping("customers/username/{username}")
//  public List<Customer> findByusername(@PathVariable String username) {
// 
//    List<Customer> customers = repository.findByusername(username);
//    return customers;
//  }
 
//  @PutMapping("/customers/{id}")
//  public ResponseEntity<Customer> updateCustomer(@PathVariable("id") String id, @RequestBody Customer customer) {
//    System.out.println("Update Customer with ID = " + id + "...");
// 
//    Optional<Customer> customerData = repository.findBypassword();
// 
//    if (customerData.isPresent()) {
//      Customer _customer = customerData.get();
//      _customer.setUsername(customer.getUsername());
//      _customer.setPassword(customer.getPassword());
//  
//      return new ResponseEntity<>(repository.save(_customer), HttpStatus.OK);
//    } else {
//      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
//  
//  @PostMapping("/coupon")
//	public Customer InsertCustomer(@RequestBody Customer customer) {
//		 int code=rand.nextInt(100000);
//		 customer.setCouponCode(code);
//		 return repository.insert(customer);
//        
//	}
//}