package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");// FNFE
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter two numbers");
		int num1 = sc.nextInt();//IME
		int num2 = sc.nextInt();		//IME
		int quotient = num1/ num2;//AE
		System.out.println("The quotient is: "+ quotient);
		int[] data = {10,20,30,40,50};
		System.out.println(data[8]);//AIOBE
	}
}









