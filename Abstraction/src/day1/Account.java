package day1;

public abstract class Account {
	
	// abstarct method: method that has only declaration, no implementation
	// we can declare the abstract methods within abstract class
	 abstract public void deposit(int amount) ;
	 abstract public void withdraw(int amount) ;
	 abstract public void login(String username, String password);
	 
	 public static void main(String[] args) {
		 Account a =new Account(); // we cant create the object of abstract class
		  a.deposit(1000);
		  
		  SavingAccount sa = new SavingAccount();
		  sa.deposit(10000);
	}
}
