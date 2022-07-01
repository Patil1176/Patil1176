package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(1);
		ts.add(12);
		ts.add(23);
		ts.add(5);
		ts.add(45);
		ts.add(6);
		ts.add(65);
		//ts.add('A');
		
		System.out.println(ts);
		
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===============");
		
		for(Object t:ts)
		{
			System.out.println(t);
		}
	
		
	}

}
