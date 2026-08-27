package day4;

import java.util.Scanner;

public class PercentClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double percentage ;
		
		System.out.println("please enter your percentage");
		percentage = sc.nextDouble();
		
		if(percentage >= 75.00)
			System.out.println("Congratulations!! You have got Distinction");
		else if(percentage >= 60.00)
			System.out.println("Great!! you have got First class");
		else if(percentage >= 50.00)
			System.out.println("Wow!! you have got Second class");
		else if(percentage >= 60.00)
			System.out.println("Good!! you have passed");
		else
			System.out.println("Sorry, you need to try again!!");
	}
}
