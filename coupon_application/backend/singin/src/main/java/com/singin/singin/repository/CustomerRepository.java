package com.singin.singin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.singin.singin.model.Customer;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
