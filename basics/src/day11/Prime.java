package day11;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter any number");
		int num = sc.nextInt();
		int i;
		if(num >= 2) {
			// check if the no is prime or not
			for(i=2; i<= num/2 ; i++) {
				if(num % i ==0) {
					System.out.println(num+" is not prime");
					break;
				}
			}
			if(i > num/2) {
				System.out.println(num+" is prime");
			}
		}
		else {
			System.out.println("first prime no is 2. 1 is neither prime nor composite");
		}
		
		
		
	}

}
