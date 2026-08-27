package day1;

public class RunnableDemo  implements Runnable {
	Thread t;// null

	public RunnableDemo() {
		t = new Thread(this);
		// this - refers to current obj (RunnableDemo object, which is newly created)
		t.start();// this.run();
	}

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

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		/*
		 * Thread creation and starting must be done by constructor
		Thread t = new Thread(rd);
		t.start();
		 */
	}
}
