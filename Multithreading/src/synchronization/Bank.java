package synchronization;

import java.util.Scanner;

public class Bank {
	int balance;
	int accNo;

	public  void deposit() {
		System.out.println("Before deposit balance is "+balance);
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter the amount to deposit");
		int amount = sc.nextInt();
		try {
			Thread.sleep(1000);
			synchronized(this) {
				balance = balance+amount;
				Thread.sleep(1000);
				System.out.println("The updated balance is "+balance);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public  void withdraw() {
		System.out.println("Before withdraw balance is "+balance);
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter the amount to withdraw");
		int amount = sc.nextInt();
		try {
			Thread.sleep(1000);			
			synchronized (this) {
				balance = balance-amount;
				Thread.sleep(1000);
				System.out.println("The updated balance is "+balance);
			} 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
