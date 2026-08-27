package demo;

public class Account {
	
	
	int accNo;
	String holder, cardNo;
	private int balance;
	private String pinNo;
	
	public String getPinNo() {
		return pinNo;
	}
	
	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}
	// deposit, withdraw
	// getter-setter method - provision to read/write the private data members
	
	// to update the balance
	public void setBalance(int balance) {
		// server side logs-- location/ IP/ datetime
		this.balance = balance;
	}
	// read the value of balance
	public int getBalance() {
		// server side logs-- location/ IP/ datetime
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
}
