package com.example.demo.RepositoryAdminUser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EntityAdminUser.useradmin;
@Repository
public interface AdminUser extends CrudRepository<useradmin, String>{


}
