package collection_classes;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	/*
	 Set
	 Unordered
	 does not allow duplicates, allows unique objects only
	 it overrides all the collection methods
	 1 or 0 null is allowed
	 
	 // HashSet - unordered, 1 null 
	 // LinkedHashSet - ordered (insertion order) , 1 null
	 /// TreeSet - ascending order, null is NOT allowed
	 */


	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
//		TreeSet<Integer> set = new TreeSet<>();
//		set.add(null);
		set.add(10);
		set.add(33);
		set.add(32);
		set.add(17);
		set.add(16);
		set.add(32);
		set.add(5);
		set.add(0);
//		set.add(null);
		System.out.println(set); // 
		
		
	}
}
