package com.itvedant.flightmodeloop.polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PassengerData {
	public static void main(String[] args) {
		System.out.println("Pleaze enter the passenger data as per the guidelines below");
		
		String name = null, passportNumber= null;
		int age =0;
		
		Scanner sc = new Scanner(System.in);	
		try {
			System.out.println("Please enter the name as- First name middle name surname");		
			name = sc.nextLine();	
			System.out.println("Please enter the valid passport number");		
			passportNumber = sc.next();
			System.out.println("please enter the age in number");
			age = sc.nextInt();
			sc.close();
			Passenger p = new Passenger();
			p.setName(name);
			p.setAge(age);
			p.setPassportNumber(passportNumber);
			System.out.println(p);
		}
		catch(InputMismatchException e) {
			System.err.println("Please enter the valid input for age");
			System.err.println("Setting the age as 0");
		} 
		catch (InvalidPassportNumber e) {
			System.err.println(e.getMessage());
		}
		
	
	}
}
