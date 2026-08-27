package com.itvedant.wingz.models;

import java.time.LocalDateTime;

public class Flight {
	
	public String flightNo, airlineName, source, destination, duration;
	public LocalDateTime departure, arrival;
	public int ticketPrice;
	
	public Flight(String flightNo, String airlineName, String source, String destination, String duration,
			LocalDateTime departure, LocalDateTime arrival, int ticketPrice) {
		this.flightNo = flightNo;
		this.airlineName = airlineName;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.departure = departure;
		this.arrival = arrival;
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", airlineName=" + airlineName + ", source=" + source + ", destination="
				+ destination + ", duration=" + duration + ", departure=" + departure + ", arrival=" + arrival
				+ ", ticketPrice=" + ticketPrice + "]";
	}
}
