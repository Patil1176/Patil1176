package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add("Velocity");
		ll.add(123);
		ll.add('A');
		ll.add(null);
		ll.add("Pune");
		ll.add(123.23);
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.contains("Pune"));
		System.out.println(ll.remove(3));
		System.out.println(ll.get(4));
		//System.out.println(ll.add(23));
		System.out.println("=====================");
		
		Iterator it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=======================");
		for(Object k:ll)
		{
			System.out.println(k);
		}
		
	}

}
