package com.example.demo.ServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EntityUser.usertable;
import com.example.demo.RepositoryUser.UserRepository;
@Service
public class UserService {
	@Autowired

	UserRepository userrepo;



	public UserService(UserRepository userrepo) {
		super();
		this.userrepo = userrepo;
	}

	public Iterable<usertable>show(){
		return userrepo.findAll();
	} 

	public usertable newuser(usertable s) {
			
			return userrepo.save(s);
	}

	public usertable userlogindata(String email,String password) {
		 return userrepo.findByEmailAndPassword(email, password);
	}

	 

}
