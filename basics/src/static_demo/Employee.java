package static_demo;

public class Employee {
	final int ID;
	public String name, email;	
	int salary; // package/default
	private String password;
	static String companyName="Itvedant";// class variables ( single shared variables )
//	
//	Employee(){
//		
//	}
	Employee(int id, String name, String email, int salary, String password){
		this.ID=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
		this.password = password;
//		this.companyName = companyName;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(101, "Nikhil","nikhil@gmail.com",20000,"nik@123");
		System.out.println(e.name);
		System.out.println(e.salary);
		
		System.out.println(companyName);// we dont need object to access static	
		showRules();// no need of object 
	}
	
	static void showRules() {
		System.out.println("Rule1");
	}
	
}
