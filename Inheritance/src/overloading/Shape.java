package overloading;

public class Shape {

	// overloading: same name, but difference in parameter list
	// constructor overloading, method overloading
	// which method/ constructor is to be called is decided at the 
	// compilation time , compile time polymorphism
	Shape(){}
	Shape(String name){}
	
	public void calculateArea(int radius) {
		System.out.println("circle area");
		
	}
	
	
	private void calculateArea(int length, int breadth) {
		System.out.println("rectangle area");
		
	}
	
	 void calculateArea(String name, int side) {
		System.out.println("square area");
		
	}
	
	public static void main(String[] args) {
		Shape s =new Shape();
		Shape s1 = new Shape("triangle");
		s.calculateArea(10);
//		s.calculateArea(10,20);
		s.calculateArea("square",10);
		
	}
	
	
	
	
}
