package demo;

public class TestClass {
	public static void main(String[] args) {
		Account a = new Account();
		a.accNo =1000001;
		a.holder = "Rajesh";
//		a.balance=10000;
		a.cardNo="1234 5678 1234";
		
		//a.balance = 0;
//		System.out.println(a.balance);
		System.out.println(a.getBalance());
//		a.pinNo="1234";
		// balance;location, IP, datetime
		
		a.setBalance(0);
		
		
	}
}
