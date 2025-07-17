package com.example.demo.ServiceAdminUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EntityAdminUser.useradmin;
import com.example.demo.RepositoryAdminUser.AdminUser;

@Service
public class SerAdminUser {
	@Autowired
	AdminUser adusrrepo;
	public Iterable<useradmin>showall(){
		return adusrrepo.findAll();
	} 
	
	public useradmin insertAdminUsr(useradmin u){
		
		return adusrrepo.save(u);
	}
	
	
	public void deleteAdminusr(String semail){
		adusrrepo.deleteById(semail);
	}
	
	public useradmin findAdminUsrData(String gemail){
		
		return adusrrepo.findById(gemail).get();
	}
	

}
