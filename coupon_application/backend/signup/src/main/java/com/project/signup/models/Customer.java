package com.project.signup.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Document(collection ="customer")
public class Customer {
	 @Id
	  private String username;
	  private String password;
	  private String email;
	  private long mobileno;
	
	
 

  public Customer() {
	super();	
}


public Customer(String password, String email, long mobileno, String username) {
	super();
	this.password = password;
	this.email = email;
	this.mobileno = mobileno;
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public long getMobileno() {
	return mobileno;
}


public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


@Override
public String toString() {
	return "Customer [password=" + password + ", email=" + email + ", mobileno=" + mobileno + ", username=" + username
			+ "]";
}
  
  

}