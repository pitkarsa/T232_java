package day1;

public class Demo2 {
	public static void main(String[] args) {
		// immutable strings
		/*
		String s2 = "hello";
		String s3 = "hello";
		System.out.println(s2==s3); // true
		s2 = "hi";
		System.out.println(s2==s3); //false		
		*/		
		String s1 = new String("hello");
		System.out.println(s1);// hello
		s1.concat("hi"); // "hellohi"
		System.out.println(s1); // hello
		
		s1 = s1.concat("hi");
		System.out.println(s1); //hellohi
		
		
		
		
		
		
		
	}
}
