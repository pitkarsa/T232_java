package day1;

import java.util.Scanner;

public class Voter {
	String name;
	int age;

	public void register() throws InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the name and age");
		name = sc.next();
		age = sc.nextInt();
		if(age < 18) {
			//			throw new Exception("Your age should be minimum 18");
			throw new InvalidAgeException();
		}
	}
	public void vote() {
		System.out.println(name+" has voted successfully!!");
	}

	public static void main(String[] args) {
		Voter v1 = new Voter();
		try {
			v1.register();
			v1.vote();
		} 
		catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class InvalidAgeException extends Exception {
	// checked exception
}