package com.example.demo.ServiceUsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EntityUsr.usrtable;
import com.example.demo.RepositoryUsr.UsrRepository;
@Service
public class UsrService {
	@Autowired
	UsrRepository usrrepo;


	public UsrService(UsrRepository usrrepo) {
		super();
		this.usrrepo = usrrepo;
	}

	public Iterable<usrtable> showall(){
		return usrrepo.findAll();
	}
		  
	public usrtable usave(usrtable us) {
		return usrrepo.save(us);
	}

}
