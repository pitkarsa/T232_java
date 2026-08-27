package inheritance;

/*
 inheritance:
 mechanism by which one class(child class) can acquire the properties
  of another class (parent class)
 */
public class Person {
	String name, gender, birthDate;

	void eat() {
		System.out.println("eating");
	}
	void sleep() {
		System.out.println("sleeping");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		s.sleep();
	}
}

class Student extends Person {
	// instance var and instance methods are inherited by child class
}












