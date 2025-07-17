package com.example.demo.ServiceSchedule;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.EntitySchedule.schedule;
import com.example.demo.RepositorySchedule.ScheduleRepository;

@Service
public class ScheduleService {
	@Autowired
	ScheduleRepository schrepo;
	
	
	public Iterable<schedule>showall(){
		return schrepo.findAll();
	} 
	
	public schedule insertschmanage(schedule s) {
		return schrepo.save(s);
	}
	
	
	public void deleteschmanage(int spnr){
		schrepo.deleteById(spnr);
	}
	
	public schedule findschdata(int gpnr){
		
		return schrepo.findById(gpnr).get();
	}

  
	
}
