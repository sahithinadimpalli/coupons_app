package com.admin.Admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

	
	@Document(collection ="adminLogin")
	public class Admin {
		
		  @Id
		  private String username;
		  private String password;
		 	
  public Admin() {
	 	super();	
	}


	public Admin (String username, String password) {
		super();
		this.password = password;
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Customer [password=" + password  +  ", username=" + username
				+ "]";
	}
	  
	  



}
