package com.itvedant.firstproject;

import java.util.Scanner;

public class FlightBooking {

	public static void main(String[] args) {
		String source;
		String destination;
		byte noOfPassengers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Flight Booking details:");
		System.out.println("Enter the source, destination and no of passengers");
		source = sc.next();
		destination = sc.next();
		noOfPassengers = sc.nextByte();
		// declaring String array to hold passenger names
		String []passengerNames = new String[noOfPassengers];
		byte []passengerAge = new byte[noOfPassengers];
		
		System.out.println("Enter the "+ noOfPassengers + " passenger names and age");
		// accept the passenger names using for loop
		for(byte i=0; i< noOfPassengers; i++) {
			passengerNames[i] = sc.next();
			passengerAge[i] = sc.nextByte();
		}
		sc.close();
		
		System.out.println("Following passengers are travelling from "+ source + " to "+ destination);
		// displaying the passenger names and ages
		for(byte i=0; i< noOfPassengers; i++) {
			System.out.println("Passenger Name: "+ passengerNames[i] + ", Age: "+ passengerAge[i]);
		}		
	}
}
