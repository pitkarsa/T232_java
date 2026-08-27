package com.itvedant.flightmodeloop.polymorphism;

public class DomesticFlight extends Flight {
	double taxRate = 0.05; // 5% tax

	public DomesticFlight() {
		System.out.println("DomesticFlight object created using zero constructor");
	}

	// method overriding
	@Override
	public double calculateFare() {
		System.out.println("Tax rate for Domestic Flight is: "+ taxRate*100 +"%");
		return baseFare + (baseFare * taxRate);
	}
}
