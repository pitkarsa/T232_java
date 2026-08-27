package abstraction;

public interface Testable {

	// jdk 8 onwards, concrete methods are allowed 
	// using static/default 
	default public void test() {
		// concrete method
		// default indicates that this method is 
		//an instance method of interface
		// child class can override this method
		System.out.println("default method of interface");
	}
	
	static public void demo() {
		// concrete method
		// static indicates that this method is 
		//a class/interface method 
		// static method can not be overriden by child
		System.out.println("static method of interface");
	}
}