package com.example.demo.RepositoryBooked;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EntityBooking.booking;

@Repository
public interface BookingRepository extends CrudRepository<booking, Integer> {
          
}
