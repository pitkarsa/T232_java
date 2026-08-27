package oops;

public class Student {
	// instance var
	// zero constr
	// param constr
	
	int rollNo;
	String name, branch;
	
	Student(){
		// System.out.println("Student zero constructor");
	}
	Student(int rollNo,	String name, String branch){
		System.out.println("Student param constr");
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	
	public String toString() {
		// it returns the string representation of the object
		return "Student details: rollNo "+ rollNo + " Name: "+ name ;
	}
	
	public static void main(String[] args) {
		Student stu = new Student(101, "Rahul","Comp");
		System.out.println(stu);// dispalys the hashcode (if toString() is not defined)
		// when we print the object, it calls toString()
		// stu.toString()
		
		
	}
}
