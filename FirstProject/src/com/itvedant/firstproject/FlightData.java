package com.itvedant.firstproject;

public class FlightData {
	public static void main(String[] args) {
		//variable declaration and initialization
		// Integer data types
		byte runwayNumber = 12;         // byte (1 byte)
		short flightCode = 101;         // short (2 bytes)
		int noOfSeats = 100;            // int (4 bytes)
		long totalPassengers = 150000L; // long (8 bytes)

		// floating point values
		float ticketPrice = 5999.50F;   // float (decimal, 4 bytes)
		double distance = 1150.75;      // double (more precision)

		// character and boolean 
		char terminal = 'A';            // single character
		boolean isOnTime = true;        // true/false
		
		//String types
		String source = "Mumbai";
		String destination = "Delhi";
		String airlineName;         // variable declaration
		airlineName = "Indigo";       // Assigning value to variable
		
		// displaying the flight information
		System.out.println("*** Flight Details ***");
		System.out.println("Runway No: "+runwayNumber);
		System.out.println("Flight Code: "+flightCode);
		System.out.println("No of Seats: "+ noOfSeats);	
		System.out.println("Total Passengers: "+totalPassengers);
		System.out.println("Ticket Price: "+ticketPrice);
		System.out.println("Distnace: "+distance);
		System.out.println("Terminal: "+terminal);
		System.out.println("On Time? "+ isOnTime);
		System.out.println("Airline Name: "+ airlineName);
		System.out.println("From: "+ source);
		System.out.println("To: "+ destination);		
		/*
 		displaying flight information using System.out.print()
		expected output is as follows:
		Indigo flight from Mumbai to Delhi is expected on runway no 12
		*/
		System.out.println("*** Flight Details ***");
		System.out.print(airlineName);
		System.out.print(" flight from ");
		System.out.print(source);
		System.out.print(" to ");
		System.out.print(destination);
		System.out.print(" is expected on runway no ");
		System.out.println(runwayNumber);		
		/*
 		displaying flight information using System.out.println(), using string concatination
		expected output is as follows:
		Indigo flight from Mumbai to Delhi is expected on runway no 12
		*/
		System.out.println("*** Flight Details ***");
		System.out.println(airlineName+" flight from "+source+" to "+destination+" is expected on runway no "+runwayNumber);
	}
}
