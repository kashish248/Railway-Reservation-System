package com.example.demo.ControllerSchedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.EntitySchedule.schedule;
import com.example.demo.ServiceSchedule.ScheduleService;
@Controller
public class ScheduleController {
	@Autowired
	ScheduleService schser;
	@GetMapping("/showsch")
	public String showuser(Model model){
		model.addAttribute("records", schser.showall());
		return "showsch";
		
	}
	@GetMapping("/insertsch")
	public String insertsch(Model model) {
		model.addAttribute("records", new schedule());
		return "insertsch"; 
	}
	@PostMapping("/savesch")
	public String savesch(@ModelAttribute schedule  s) {
		
		schser.insertschmanage(s);
		return "usersave";
	}
	
	@GetMapping("/deletesch/{gpnr}")
	public  String deletesch(@PathVariable int gpnr,Model model) {
		schser.deleteschmanage(gpnr);
		model.addAttribute("records", schser.showall());
		return "showuser";
	}
	
	
	@GetMapping("/updatetrain/{gemail}")
	public ModelAndView updatetrain(@PathVariable int gpnr) {
		ModelAndView mv=new ModelAndView("insertsch");
		schedule s=schser.findschdata(gpnr);
		mv.addObject("records", s);
		return mv;
	}
}
