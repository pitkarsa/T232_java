package oops;

public class AccessModifiers_Emp {
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
