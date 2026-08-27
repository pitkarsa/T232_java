package com.itvedant.flightmodeloop.polymorphism;

public class InternationalFlight extends Flight {
	double taxRate = 0.10;     // 10% tax
	double visaFee = 2000;     // fixed visa fee

	public InternationalFlight() {
		System.out.println("InternationalFlight object created using zero constructor");
	}
	// method overriding
	@Override
	public double calculateFare() {
		System.out.println("Tax rate for International Flight is: "+ taxRate*100 +"%");
		System.out.println("Visa fee for International Flight is: "+ visaFee);
		return baseFare + (baseFare * taxRate) + visaFee;
	}
}
