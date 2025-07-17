package com.example.demo.ControllerAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.EntityAdminUser.useradmin;
import com.example.demo.ServiceAdminUser.SerAdminUser;
@Controller
public class AdminController {
	@Autowired
	SerAdminUser adminusr;
	@GetMapping("/showuser")
	public String showuser(Model model){
		model.addAttribute("records", adminusr.showall());
		return "showuser";
		
	}
	@GetMapping("/insertuser")
	public String insertuser(Model model) {
		model.addAttribute("records", new useradmin());
		return "insertuser"; 
	}
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute useradmin  u) {
		
		adminusr.insertAdminUsr(u);
		return "usersave";
	}
	
	@GetMapping("/deleteuser/{gemail}")
	public  String deleteuser(@PathVariable String gemail,Model model) {
		adminusr.deleteAdminusr(gemail);
		model.addAttribute("records", adminusr.showall());
		return "showuser";
	}
	
	
	@GetMapping("/updateuser/{gemail}")
	public ModelAndView updateuser(@PathVariable String gemail) {
		ModelAndView mv=new ModelAndView("insertuser");
		useradmin u=adminusr.findAdminUsrData(gemail);
		mv.addObject("records", u);
		return mv;
	}

}
