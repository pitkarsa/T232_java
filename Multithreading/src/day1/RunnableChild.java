package day1;

public class RunnableChild implements Runnable {	
	
	public static void main(String[] args) {
		RunnableChild rc = new RunnableChild();// object
		/*
		Thread t = new Thread();
		System.out.println("starting the thtread t");
		t.start(); // t.run(); Thread class run() {}
		*/
		// 1. thread creation
		Thread t1 = new Thread(rc);// we need to pass the Runnable object to thread
		// 2. starting the thread
		t1.start(); // rc.run()
//		Thread t2 = new Thread(rc);
//		t2.start();// rc.run()
		
		Child c = new Child();
		Thread t3 = new Thread(c);
		t3.start(); // c.run()
	}

	// 3. thread execution
	@Override
	public void run() {
		// defines the task to be executed by thread
		for(int i=11; i<=15; i++) {
//			System.out.println(Thread.currentThread().getName()+ " "+i);
			System.out.println(Thread.currentThread() + " "+i);
			try {
				Thread.sleep(1000);// 1000 ms - 1sec
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}

class Child implements Runnable {

	@Override
	public void run() {
		for(char ch ='A'; ch <= 'E';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
