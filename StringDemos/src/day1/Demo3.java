package day1;

public class Demo3 {
	public static void main(String[] args) {
		
		// methods
		// s.concat(s1); 
		
		String s1 = new String("hello");
		s1 = s1.concat("hi");// generate and return the new string
		System.out.println(s1); //hellohi
		
		// split
		String s = "I love java programming";
		String[] words = s.split(" ");
		// words = {"I", "love", "java","programming"}
				
		String dob = "01/01/2020";
		String[] values = dob.split("/");
		
		// substring
		String str = "Welcome";
		System.out.println(str.substring(4));// starting index 4, ome
		System.out.println(str.substring(3,5));// starting index 3, ending index 5 - co
		
		// replace
		String s2 = "I love banana. banana is sweet";
		s2 = s2.replace("banana", "mango");
		System.out.println(s2);
				
		String name = "Tushar";
		System.out.println(name.startsWith("TU")); //false
		
		System.out.println(name.endsWith("r")); //true		
		
		str = "Welcome";
		System.out.println(str.indexOf('e')); //1
		System.out.println(str.indexOf('e',2)); // 6
		
		String address = "     2nd flr , Ishan Arcade 1,      opp Gaodevi, Thane w, 4000601        ";
		System.out.println(address);
		System.out.println(address.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
