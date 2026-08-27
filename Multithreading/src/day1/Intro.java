package day1;

public class Intro {
	public static void main(String[] args) {		
		// sequential execution
		Intro i1 = new Intro();
		i1.run();
		Intro i2 = new Intro();
		i2.run();
	}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);// 1000 ms - 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
