package com.example.demo.RepositoryUser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EntityUser.usertable;
@Repository
public interface UserRepository extends CrudRepository<usertable, String> {
	public usertable findByEmailAndPassword(String email,String password);
	
}
