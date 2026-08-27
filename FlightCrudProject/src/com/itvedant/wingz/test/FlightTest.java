package com.itvedant.wingz.test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import com.itvedant.wingz.dao.FlightDao;
import com.itvedant.wingz.dao_impl.FlightDaoImpl;
import com.itvedant.wingz.models.Flight;

public class FlightTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(true) {
			System.out.println();
			System.out.println("*** Flight Data Management ***");
			System.out.println("Please enter your choice");
			System.out.println("1. Add Flight Data");
			System.out.println("2. Search Flight");
			System.out.println("3. Show all Flights");
			System.out.println("4. Update Flight Data");
			System.out.println("5. Delete Flight Data");
			System.out.println("6. Exit the application");
			int choice = sc.nextInt();
			String flightNo, airlineName, source, destination, duration;
			LocalDateTime departure, arrival;
			int ticketPrice;
			boolean status;
			FlightDao dao = new FlightDaoImpl();
			switch(choice) {
			case 1: // Add Flight Data
				System.out.println("Enter the Flight number, Airline name, Source and destination");
				flightNo = sc.next();
				sc.nextLine();
				airlineName = sc.nextLine();
				source = sc.next();
				destination = sc.next();
				System.out.println("Please enter the departure and arrival in the format: yyyy-mm-ddThh:mm");
				sc.nextLine();
				departure = LocalDateTime.parse(sc.nextLine());
				arrival = LocalDateTime.parse(sc.nextLine());
				System.out.println("Please enter the duration");
				duration = sc.nextLine();
				System.out.println("Enter the ticket price");
				ticketPrice = sc.nextInt();
				Flight flight = new Flight(flightNo, airlineName, source, destination, duration, departure, arrival, ticketPrice);
				status = dao.addFlight(flight);				
				if (status) System.out.println("Flight added successfully!!");
				else System.err.println("Flight could not be added!!");
				break;
			case 2: // Search Flight
				System.out.println("Please enter flight Id");
				flightNo = sc.next();
				flight = dao.getFlightById(flightNo);
				if(flight != null)
					System.out.println(flight);
				else
					System.err.println("Sorry, no such flight available");
				break;
			case 3: // Show all Flights
				System.out.println("*** Flight Details ***");
				List<Flight> allFlights = dao.getAllFlights();
				if (allFlights.size() > 0)
					allFlights.forEach(flightObject -> System.out.println(flightObject));
				else
					System.err.println("Sorry, Flight data is not available");
				break;
			case 4: // Update Flight Data
				// display all flights first
				System.out.println("Please select the flight no, to update");
				flightNo = sc.next();				
				System.out.println("Enter the Airline name, Source and destination");
				sc.nextLine();
				airlineName = sc.nextLine();
				source = sc.next();
				destination = sc.next();
				System.out.println("Please enter the departure and arrival in the format: yyyy-mm-ddThh:mm");
				sc.nextLine();
				departure = LocalDateTime.parse(sc.nextLine());
				arrival = LocalDateTime.parse(sc.nextLine());
				System.out.println("Please enter the duration");
				duration = sc.next();
				System.out.println("Enter the ticket price");
				ticketPrice = sc.nextInt();
				Flight updatedFlight = new Flight(flightNo, airlineName, source, destination, duration, departure, arrival, ticketPrice);
				status =dao.updateFlight(updatedFlight);
				if(status)
					System.out.println("Flight data updated successfully!!");
				else
					System.err.println("Please enter the valid Flight No to update. ");
				break;	
			case 5: // Delete Flight Data
				System.out.println("Please select the flight no, to delete");
				flightNo = sc.next();
				status = dao.deleteFlightById(flightNo);
				if(status)
					System.out.println("Flight deleted successfully!!");
				else
					System.err.println("Sorry, please enter the valid Flight No");
				break;
			default: 
				System.err.println("Please enter the choice between 1 to 6");
			}
		}
	}
}
