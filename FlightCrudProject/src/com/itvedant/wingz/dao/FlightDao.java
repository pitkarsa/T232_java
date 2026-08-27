package com.itvedant.wingz.dao;

import java.util.List;
import com.itvedant.wingz.models.Flight;

public interface FlightDao {	
	public boolean addFlight(Flight flight);
	public boolean updateFlight(Flight flight);
	public boolean deleteFlightById(String flightNo);
	public Flight getFlightById(String flightNo);
	public List<Flight> getAllFlights();
}
