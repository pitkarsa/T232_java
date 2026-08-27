package collection_classes;

import java.util.PriorityQueue;

public class QDemo {
	/*
	  FIFO
	  allows duplicates
	  unordered
	  null is not allowed
	  it has its own methods... peek, poll, offer	  
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(10);
		q.add(56);
		q.add(4);
		q.add(55);
//		q.add(null);
		q.add(10);
		q.add(43);
		q.add(14);
		System.out.println(q);
		q.add(6);
		System.out.println(q);
		q.remove(); // removes the head element
		System.out.println(q);
		
		q.offer(81); // adds new object
		System.out.println(q);
		
		// peek() -> returns retrives the head object
		// element() -> returns the head object, throws NSEE if q is empty
		// poll() -> removes and retrieves(returns) the head object
		int ele = q.element();// NoSuchElementException, when q is empty
		System.out.println(q.peek());
		Integer removed = q.poll();
		System.out.println("removed"+removed);
		System.out.println(q);
		
		
		
		
		
	}
	
}
