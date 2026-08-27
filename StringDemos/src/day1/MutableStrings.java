package day1;

public class MutableStrings {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Welcome");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		// mutable strings
		sb1.append(" all"); // Welcome all
		System.out.println(sb1);
		
		// immutable string
		String s = new String("welcome");
		s.concat(" all");
		System.out.println(s); // Welcome
		
		// methods 
	    // indexOf, charAt, substring, lastIndexOf
		// compareTo, equals
	    System.out.println(sb1.substring(3));// come all
	    System.out.println(sb1.substring(2, 5)); // lco
		
	    
	    sb2.reverse(); // olleH
	    // sb1 = "welcome all"
	    sb1.delete(3, 7);
	    System.out.println(sb1);
	    sb1.insert(3, "come");
	    System.out.println(sb1);
		
	}
}
