package day4;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		// Conditional stmt
		int num;
		Scanner sc= new Scanner(System.in);

		System.out.println("plz enter any no");
		num = sc.nextInt();
		
		if(num >= 0)	{
			// if block/ true block
			System.out.println("no is positive");
			System.out.println("within if");
		}
		else	{
			// else block/ false block
			System.out.println("no is negative");
			System.out.println("within else");
		}

	}
}
