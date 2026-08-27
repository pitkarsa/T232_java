package synchronization;

public class Father implements Runnable {
	Bank b;
	Thread t;
	
	public Father(Bank b) {
		this.b=b;
		t  = new Thread(this);
		t.start();
	}
	
	public void run() {
		b.deposit();
	}
}






