package com.admin.Admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.admin.Admin.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String>{

}
