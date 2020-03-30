package com.project.signup.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.signup.models.Customer;


 
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
//  boolean existsByusername(String username);
//  boolean existsBypassword(String password);
}
