package collection_classes;



public class Employee implements Comparable<Employee>
// we need compareTo() for sorting
// interface Comparable declares this abstract method compareTo
// natural sorting - based on single field

{
	
	@Override
	public int compareTo(Employee emp) {
		// e1.compareTo(e2);
		// we have 2 objects- this, emp
		//return this.empId - emp.empId;
//		return this.salary - emp.salary;
		return this.name.compareTo(emp.name);
	}
	// POJO - plain old java object
	// model(data) class
	int empId, salary;
	String name;
	String password;
	
	public Employee(){
		
	}
	
	public Employee(int empId, int salary, String name,	String password) {
		this.name=name;
		this.salary=salary;
		this.password=password;
		this.empId= empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + ", password=" + password + "]";
	}

	
	
	
}
