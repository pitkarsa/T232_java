package abstraction;

public class Aeroplane implements Movable, Flyable,Printable {


}

interface Flyable {
	void fly();
}
interface Movable {
	void move();
}
