package com.itvedant.flightmodeloop.models;

import java.util.Scanner;

public class Flight {
	// instance variables
	String airlineName, source, destination, duration;
	double ticketPrice;

	public static void main(String[] args) {
//		Flight f1 = new Flight();// zero constructor is called
//		f1.setFlightDetails();
//		f1.displayFlightDetails();
		
		Flight f2 = new Flight("Indigo","Mumbai","Dubai","2:30 hrs",10000.00);
		// in the above code, we are passing the values directly, however, we can accept the user input using Scanner
		System.out.println(f2);
	}
	
	Flight() {
		System.out.println("Flight object created using zero constructor");
	}
	
	// Note that, if parameterized constructor is declared, it is recommended to declare zero constructor as well
	Flight(String airlineName, String source, String destination, String duration, double ticketPrice) {
		this.airlineName = airlineName;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.ticketPrice = ticketPrice;
		System.out.println("Flight object created and initialized using parameterized constructor");
	}

	void displayFlightDetails() {
		System.out.println("*** Flight Details ***");
		System.out.println("Airline name: "+ airlineName);
		System.out.println("Source: "+ source);
		System.out.println("Destination: "+ destination);
		System.out.println("Duration: "+ duration);
		System.out.println("Ticket Price: Rs."+ ticketPrice);
	}
	void setFlightDetails() {
		// define the Scanner object to accept user input and set the instance variables 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the flight details: airlineName, source, destination, duration and ticket price");
		this.airlineName = sc.next();
		this.source = sc.next();
		this.destination = sc.next();
		this.duration = sc.next();
		this.ticketPrice = sc.nextDouble();
		sc.close();
	}
	
	public String toString() {
		return "Flight [airlineName=" + airlineName + ", source=" + source + ", destination=" + destination
				+ ", duration=" + duration + ", ticketPrice=" + ticketPrice + "]";
	}
}
