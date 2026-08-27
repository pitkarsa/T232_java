package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Neha");
		names.add("Pooja");
		names.add("Nikhil");
		names.add("Amit");
		names.add("Ganesh");		
		names.add("Amit");
		names.add("Nikhil");
		System.out.println(names);
		// Collections - class, that has static methods
		Collections.sort(names); // "Neha".compareTo("Pooja")
		System.out.println(names);
		
		
		
		
		
		
		
		
	}
}
