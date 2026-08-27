package com.itvedant.firstproject;

// Import the Scanner class so as to accept user input
import java.util.Scanner;

public class FlightFunctions {
	static String source;
	static String destination;
	static String airlineName;
	static byte noOfPassengers;
	static double ticketPrice = 3499.50; // ticket price can not be the user input
	static double bookingPrice, finalTicketPrice ;
	static boolean bookingStatus = false; 
	static String passengerCategory;
	static double discount = 0.0; // no discount

	// method to accept booking details
	static void setBookingDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Airline Name, Source and Destination");
		airlineName = sc.next();
		source = sc.next();
		destination = sc.next();
		System.out.println("The ticket price is Rs. "+ ticketPrice);
		System.out.println("Plaese enter no of passengers");
		noOfPassengers = sc.nextByte();
		System.out.println("Plaese enter the passenger category as 'regular' or 'student' or 'armed forces'?");
		// use of nextLine() to accept the multi-word string
		sc.nextLine();
		passengerCategory = sc.nextLine();
		if(noOfPassengers > 0 && noOfPassengers <=5 ) // no of passengers must be 1 to 5 
		{
			bookingPrice = noOfPassengers*ticketPrice;
			// nesting switch-case within the if, to set the discount based on passengerCategory
			switch(passengerCategory) 
			// Note that category must be entered EXACTLY as 'regular' or 'student' or 'armed forces'
			// As Java is case sensitive
			{
			case "regular":
				discount = 5.0;
				break;
			case "student":
				discount = 10.0;
				break;
			case "armed forces":
				discount = 20.0;
				break;
			default : // this will be executed, if category is other then 'regular' or 'student' or 'armed forces'
				System.err.println("Please provide valid category");
			}				
			// setting bookingStatus as true, if booking is confirmed
			bookingStatus = true;
		}
		else
		{
			System.err.println("Your booking can not be processed, as no of passengers must be 1 to 5");
			bookingPrice = 0;
		}
		sc.close();
	}

	public static void main(String[] args) {		
		setBookingDetails();
		finalTicketPrice = calculateFinalTicketPrice(5.0);
		if (bookingStatus) // if the booking status is true, then display the booking details
		{
			System.out.println("you need to pay Rs. "+ finalTicketPrice);
			bookingStatus = true;
			System.out.println("Your booking is confirmed !!");
			displayBookingInformation();
		}
	}

	// method to accept discount percent and return total price after discount
	static double calculateFinalTicketPrice(double percent) {
		//		discount = percent;
		double amountToPay = bookingPrice - bookingPrice*discount/100;
		return amountToPay;
	}

	// method to display the booking information
	static void displayBookingInformation() {
		System.out.println("\n****");
		System.out.println("Your flight booking details are as follows:");
		System.out.println("Airline Name: "+ airlineName);
		System.out.println("From: "+ source);
		System.out.println("To: "+ destination);
		System.out.println("No of passengers: "+ noOfPassengers);
		System.out.println("After "+ discount + "% discount, The total booking amount is Rs. "+ finalTicketPrice);
	}
}




