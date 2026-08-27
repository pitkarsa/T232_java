package day4;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// Conditional stmt
		int num;
		Scanner sc= new Scanner(System.in);

		System.out.println("plz enter any no");
		num = sc.nextInt();

		if(num%2==0) 
			System.out.println("even no");		
		//System.out.println("within if");		
		else 
			System.out.println("odd no");


	}
}
