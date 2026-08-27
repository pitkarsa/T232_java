package synchronization;

public class Application {
	public static void main(String[] args) {
		Bank b= new Bank();// shared bank account
		b.accNo=1000015;
		b.balance=10000;
		Father f = new Father(b);
		Son s = new Son(b);
	}
}
