package interface_types;

public interface Parent {
	public void test();
}

// extended interface
interface Child extends Parent {
	public void demo();
	public void print();
}

class Demo implements Child {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
