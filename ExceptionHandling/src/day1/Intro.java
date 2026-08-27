package day1;

import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("plz enter two numbers");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();		
//		int quotient = num1/ num2;
//		System.out.println("The quotient is: "+ quotient);
//		System.out.println("int division is successful");
		
		try {
			// error prone code
			System.out.println("plz enter two numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();		
			int quotient = num1/ num2;
			System.out.println("The quotient is: "+ quotient);			
		}
		catch(Exception e) {
			// exception handling code
			System.out.println("catch block");
		}		
		System.out.println("tried the int division");		
	}
}
