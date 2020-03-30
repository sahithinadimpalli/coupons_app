package com.admin.Admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.Admin.Repository.AdminRepository;
import com.admin.Admin.model.Admin;




	
	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping("/api")
	public class Controller {
	 
		@Autowired
		AdminRepository repository;
		  @PostMapping("/admin/signup")
		  public void isertnew(@RequestBody Admin admin) {
			  repository.insert(admin);
		  }
	  @PostMapping("/admin/validate")
	  public Admin validateUser(@RequestBody Admin admin) {
		  System.out.println(admin);
System.out.println("hello");
	  	List<Admin> login=repository.findAll();
	  	System.out.println(login);
	  	for(Admin dblog:login) {
	  		
	  		System.out.println(dblog);
	  		
	  		if(dblog.getUsername().equals(admin.getUsername())&&dblog.getPassword().equals(admin.getPassword())) {
	  			
	  			return dblog;
	  			
	  	}
	  	
	  	
	  }
	  	return null;
	  }
}
	
 	