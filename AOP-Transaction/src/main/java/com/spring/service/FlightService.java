package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.FlightDAO;
import com.spring.model.Flight;


@Service
public class FlightService {
	
	@Autowired
	FlightDAO flightDAO;
	
	public int bookFlight(Integer flightId,Integer bookId,int noOfBookedSeats)
	{
		int result = flightDAO.bookFlight(flightId, bookId, noOfBookedSeats);
		
		if(result == 0) {
			throw new RuntimeException("Booking failed. Rolling back transactions");
		}
		
		return result;
	}
}
