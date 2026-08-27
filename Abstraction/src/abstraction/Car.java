package abstraction;

import secret.BMW;

// inheritance, overriding, upcasting

public abstract class Car {
	public void display() {
		System.out.println("dispalying car details ");
		// concrete method - method with body
	}
	// abstraction: showing the functionality, hiding the implementation
	// methods are declared (no implementation)
	// every child class must override the parent's abstract methods
	 public abstract void start();
	abstract public void stop();
	static final String brand = "BMW";
	public String model;
	
	public static void main(String[] args) {
		// abstract class can not be instantiated
		// we cant create the object of abstract class
		//Car c = new Car();
		Car c = new BMW();
		c.display();// parent
		c.start();// child
		c.stop();//child
		
		BMW b = new BMW();
		b.start();
	}
}