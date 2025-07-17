package com.example.demo.RepositoryUsr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EntityUsr.usrtable;
@Repository
public interface UsrRepository extends CrudRepository<usrtable, String>{

}
