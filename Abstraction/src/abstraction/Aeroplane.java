package abstraction;

public class Aeroplane implements Movable, Flyable,Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printOnCloth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}


}

interface Flyable {
	void fly();
}
interface Movable {
	void move();
}
