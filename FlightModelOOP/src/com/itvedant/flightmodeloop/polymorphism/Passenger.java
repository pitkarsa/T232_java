package com.itvedant.flightmodeloop.polymorphism;

public class Passenger {

	private String name;
	private int age;
	private String passportNumber;

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPassportNumber(String passportNumber) throws InvalidPassportNumber {
		if (passportNumber.length()==7)
			this.passportNumber=passportNumber;
		else
			throw new InvalidPassportNumber("Passport Number is not set, as it is invalid.");
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", passportNumber=" + passportNumber + "]";
	}
}
