package com.example.demo.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EntityBooking.booking;
import com.example.demo.RepositoryBooked.BookingRepository;
@Service
public class BookingService {
	@Autowired
	BookingRepository bookingrepo;
	public Iterable<booking>showall(){
		return bookingrepo.findAll();
	} 
}
