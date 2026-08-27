package secret;

import abstraction.Car;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW is starting");
	}

	@Override
	public void stop() {
		System.out.println("BMW is stopping");
	}
	
}
