package com.singin.singin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

	@Document(collection ="customer")
	public class Customer {
		 
		@Id
		  private String username;
		  private String password;
		
		public Customer(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		
		 public String getUsername() {
				return username;
			}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}


	}
