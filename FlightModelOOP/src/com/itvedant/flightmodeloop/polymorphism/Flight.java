package com.itvedant.flightmodeloop.polymorphism;

public class Flight {
	String flightNumber;
	String source;
	String destination;
	double baseFare;

	public Flight() {
		System.out.println("Flight object created using zero constructor");
	}

	// constructor overloading, same name of constructor, different no of arguments
	public Flight(String flightNumber, String source, String destination, double baseFare) {
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.baseFare = baseFare;
	}

	public double calculateFare() {
		return baseFare;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", source=" + source + ", destination=" + destination
				+ ", baseFare=" + baseFare + "]";
	}

	//overloaded method
	// method with same name, but difference in arguments
	public double calculateFare(double discount) {
		return baseFare - discount;
	}

	public static void main(String[] args) {
		double totalFare;
		InternationalFlight internationalFlight = new InternationalFlight();
		internationalFlight.flightNumber = "I123";
		internationalFlight.source = "Mumbai";
		internationalFlight.destination = "Dubai";
		internationalFlight.baseFare = 10000.00;		
		totalFare = internationalFlight.calculateFare();
		System.out.println(internationalFlight);
		System.out.println("Total fare is Rs." + totalFare);
	}
}