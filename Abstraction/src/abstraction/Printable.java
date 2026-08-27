package abstraction;

public interface Printable {
/*	till jdk 1.7 - full abstraction
    allows ONLY abstrract methods (by default all mthods are
    public abstract)
instance var, constructor  are not allowed in interface
it allows public static final variables
*/		
	// by default all the variables are public static final
	// they must be assigned the value at the time of declaration
	String pageSize="A4";	// public static final
	// by default all methods are public abstract
	 void print();// public abstract
	 void printOnCloth();	 
}

class PrintableChild implements Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printOnCloth() {
		// TODO Auto-generated method stub
		
	}
	
}
