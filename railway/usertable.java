package com.example.demo.EntityUser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class usertable {
	@Id
	String email;
	String password;
	
	public usertable() {}

	public usertable(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
