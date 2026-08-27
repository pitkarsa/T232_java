package day1;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		/*
		int num=10;
		//creating strings
		// using literals
		String s = "Hello";
		// using constructors
		String s1 = new String("Welcome");
		System.out.println(s);
		System.out.println(s1);
		
		
		// methods
		// accessing string characters
		System.out.println("s1 length is: "+s1.length());
		
		// charAt(index) --> returns a character at given index
		System.out.println(s1.charAt(0)); // W
		System.out.println(s1.charAt(1)); //e
		System.out.println(s1.charAt(6)); //e
		System.out.println(s1.charAt(7));
		
		
		// checking index
		// s1= "Welcome"
		// indexOf()
		System.out.println(s1.indexOf('W')); // 0
		System.out.println(s1.indexOf("e")); // 1
		System.out.println(s1.indexOf("come")); // 3
		
		System.out.println(s1.indexOf('w')); // -1
		System.out.println(s1.indexOf("comp")); // -1
		
		System.out.println(s1.lastIndexOf('e')); // 6
		System.out.println(s1.lastIndexOf('W')); // 0
		
		// accept the string from user and reverse it
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter any word");
		String word = sc.next(); // length=5, index 0 to 4 
		
		String reverse="";
		for(int i= word.length()-1 ; i>=0; i--) {
			reverse = reverse + word.charAt(i);
		}
		System.out.println(reverse);
		
		// palindrome
		// String comparison   -->  .equals, .compareTo, ==
		// .equals - checks contents and returns boolean
		if(word.equals(reverse)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a palindrome");
		}
		*/
		// compareTo - compares two strings and returns int difference
		String str1 = "anshu"; 
		String str2 = "Rohit";
		// A - 65
		// a - 97 
		System.out.println(str1.compareTo(str2)); // str1 - str2 (-32)
		System.out.println(str2.compareTo(str1)); // str2 - str1 (32)
		
		// lower
		// upper
		String s = "hello";
		System.out.println(s.toUpperCase());
		String s1 = "HELLO";
		System.out.println(s1.toLowerCase());
		
		
		// String - toCharArray
		String str = "Itvedant";
		char[] letters = str.toCharArray();
		
		String word = new String(letters);
		
		// accept 5 names from user
		String[] names = new String[5];
		// male - female name
		
		
		
		
	}
}
