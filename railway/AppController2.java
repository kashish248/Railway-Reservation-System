package com.example.demo.Controller2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.EntityUsr.usrtable;
import com.example.demo.ServiceSchedule.ScheduleService;
import com.example.demo.ServiceUsr.UsrService;
@Controller
public class AppController2 {
	@Autowired
	UsrService usrser;
	ScheduleService schser;
	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("records", new usrtable());
		return "registration"; 
	}
	@PostMapping("/userdata")
	public String userdata(@ModelAttribute usrtable us) {
		usrser.usave(us);
		return "usersave";
	}
}
