package p1;

public class Account {
	int accNo;
	String holder;
	int balance;
	
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println("Updated balance:"+balance);
	}
	
	public static void main(String[] args) {
		// static binding - reference and the object are of same type
		/*
		 Account a = new Account();
		a.withdraw(1000);// parent
		SavingAccount sa = new SavingAccount();
		sa.withdraw(1000);// child
		*/
		
		// dynamic binding
		// upcasting - child object casted to parent
		 Account reference = new SavingAccount();
		// reference is of parent, object is of child
		Account acc = null ;
//		 acc = new Account(); // object is of parent
		//acc = new SavingAccount() ;// object is of child
		acc.withdraw(1000); // at run time, 
		//based on the type of object, which method is to be called is decided
		
		
	}
}

class SavingAccount extends Account {
	@Override
	public void withdraw(int amount) {
		System.out.println("SA withdraw()");
	}
}
