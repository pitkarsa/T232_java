package com.itvedant.wingz.dao_impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.itvedant.wingz.dao.FlightDao;
import com.itvedant.wingz.models.Flight;

public class FlightDaoImpl implements FlightDao {	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int rowCount =0;
	String query= null;
	String url = "jdbc:mysql://localhost:3306/skyreserve";
	String user = "root";
	String password= "root";
	boolean status = false;
	String flightNo, airlineName, source, destination, duration;
	LocalDateTime departure, arrival;
	int ticketPrice;
	
	@Override
	public boolean addFlight(Flight flight) {
		try {
			status = false;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			query = "insert into flight values (?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			ps.setString(1, flight.flightNo);
			ps.setString(2, flight.airlineName);
			ps.setString(3, flight.source);
			ps.setString(4, flight.destination);
			ps.setString(5, flight.duration);
			ps.setObject(6, flight.departure);
			ps.setObject(7, flight.arrival);
			ps.setInt(8, flight.ticketPrice);
			ps.executeUpdate();
			status = true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	@Override
	public boolean updateFlight(Flight flight) {
		try {
			status = false;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			query = "update flight set airline_name=?, source=?, destination=?,duration=?, departure=?, arrival=?,ticket_price=? where flight_no=?";
			ps=con.prepareStatement(query);
			ps.setString(1, flight.airlineName);
			ps.setString(2, flight.source);
			ps.setString(3, flight.destination);
			ps.setString(4, flight.duration);
			ps.setObject(5, flight.departure);
			ps.setObject(6, flight.arrival);
			ps.setInt(7, flight.ticketPrice);
			ps.setString(8, flight.flightNo);
			ps.executeUpdate();
			status = true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public boolean deleteFlightById(String flightNo) {
		try {
			status = false;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			query = "delete from flight where flight_no=?";
			ps=con.prepareStatement(query);
			ps.setString(1, flightNo);
			ps.executeUpdate();
			status = true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public Flight getFlightById(String flightNo) {
		Flight flight = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			query = "select * from flight where flight_no=?";
			ps=con.prepareStatement(query);
			ps.setString(1, flightNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				flightNo = rs.getString(1);
				airlineName = rs.getString(2);
				source = rs.getString(3);
				destination = rs.getString(4);
				duration = rs.getString(5);
				departure = (LocalDateTime)rs.getObject(6);
				arrival = (LocalDateTime)rs.getObject(7);
				ticketPrice = rs.getInt(8);
				flight = new Flight(flightNo, airlineName, source, destination, duration, departure, arrival,ticketPrice);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return flight;
	}
	@Override
	public List<Flight> getAllFlights() {
		List<Flight> allFlights = new ArrayList<Flight>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			query = "select * from flight";
			ps=con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				flightNo = rs.getString(1);
				airlineName = rs.getString(2);
				source = rs.getString(3);
				destination = rs.getString(4);
				duration = rs.getString(5);
				departure = (LocalDateTime)rs.getObject(6);
				arrival = (LocalDateTime)rs.getObject(7);
				ticketPrice = rs.getInt(8);
				Flight flight = new Flight(flightNo, airlineName, source, destination, duration, departure, arrival,ticketPrice);
				allFlights.add(flight);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return allFlights;
	}
}
