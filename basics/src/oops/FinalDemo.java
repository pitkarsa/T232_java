package oops;

public class FinalDemo {

	// we need to set the value to the final Constants
	// 1. declaration time (if the value is same for all objects)
	// OR
	// 2. within the parameterized constr ( 
	final int ACC_NO;// constants
	String holderName, email;
	int balance;
	final String IFSC = "ICIC0000035";

	public FinalDemo(int ACC_NO, String holderName, String email, int balance) {
		this.ACC_NO = ACC_NO;
		this.holderName = holderName;
		this.balance =balance;
		this.email = email;
	}
	public static void main(String[] args) {
		FinalDemo f1 = new FinalDemo(10001, "Ramesh","ramesh@gmail.com",10000);
		FinalDemo f2 = new FinalDemo(10002, "Tejas","tejas@gmail.com",20000);
		
		System.out.println(f1.ACC_NO);
		System.out.println(f2.ACC_NO);
		
		f1.ACC_NO=101;// cant reassign/change the ACC_NO value
		
		
		
	}	



}
