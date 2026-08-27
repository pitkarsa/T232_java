package oops;

public class Employee {
	
	int id;
	public String name, email;	
	int salary; // package/default
	private String password;
	
	// access modifiers:(instance variable, constructors, methods, classes)
	// public
	// protected
	// default/ package
	// private
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="Samruddhi";
		System.out.println(e.name);
		e.salary = 30000;
		System.out.println(e.salary);
		e.password = "sam1234";
		System.out.println(e.password);
	}
	
}
