package com.example.demo.ControllerBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.ServiceBooking.BookingService;
@Controller
public class BookingController {
	@Autowired
	BookingService bookingser;
	@GetMapping("/bookingshow")
	public String bookingshow(Model model){
		model.addAttribute("records", bookingser.showall());
		return "bookingshow";	
	}
	@GetMapping("/confirmed")
	public String confirmed() {
		return "confirmed";
	}
	
}
