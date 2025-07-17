package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.EntityUser.usertable;
import com.example.demo.ServiceUser.UserService;
@Controller
public class AppController {
	
	@Autowired
	UserService userser;
	@GetMapping("/start")
   public String front() {
	   return "start";
   }
	
	@GetMapping("/admin")
	public String admin() {
		   return "admin";
   }
	@GetMapping("/newuser")
	public String newuser(Model model) {
		model.addAttribute("records",new usertable());
		return "newuser"; 
	}
	@PostMapping("/usersave")
	public String usersave(@ModelAttribute usertable u) {
		userser.newuser(u);
		return "usersave";
	}
	
	   
	@GetMapping("/login") 
	public String login() {
		return "login";
	}
	
	@GetMapping("/regcomplete")
	public String regcomplete() {
		return "regcomplete";
	}
	
	@PostMapping("/userlogin")
	public String userlogin(@RequestParam String email,@RequestParam String password,Model model) {
		usertable obj=userser.userlogindata(email, password);
		if(obj!=null) {
			model.addAttribute("msg", "");
			return "userdash";
		}else {
			model.addAttribute("msg", "Invalid email and password");
			return "login";
		}
		
	}
	
	
}


