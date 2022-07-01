package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add("Velocity");
		al.add(123);
		al.add('A');
		al.add(123.23);
		al.add(null);
		al.add(0);
		al.add("Velocity");
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		System.out.println(al.get(4));
		
		al.add(1, "Pune");//adds element particuler index
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains('A'));
		
		System.out.println(al);
		
		System.out.println("===================");
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("==================");
		System.out.println("==================");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===================");
		
		for(Object k:al)
		{
			System.out.println(k);
		}
	}

}
