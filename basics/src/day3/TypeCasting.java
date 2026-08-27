package day3;

import java.util.Scanner;

public class TypeCasting {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short s = 100;
		int i = s; // widening
		
		
		int x= 100;
		//short y  = x;// narrowing - possibility of data loss
		
		short y = (short)x;
		
		
		// 
		int num1 =10;
		double d = 50;
		
//		num1 + d ==> 10.0(d) + 50.0 ==> double
		int answer = (int)(num1 + d);
		float f1 = (float)(num1 + d);
		
		System.out.println(f1);
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
