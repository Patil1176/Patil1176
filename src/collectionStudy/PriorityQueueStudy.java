package collectionStudy;

import java.util.PriorityQueue;

public class PriorityQueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue<>();
		
		pq.add("Velocity");
		pq.add("Corporate");
		pq.add("Training");
		pq.add("Institude");
		pq.add("Pune");
		
		System.out.println(pq);
		
		System.out.println(pq.size());
		
		System.out.println(pq.element());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
