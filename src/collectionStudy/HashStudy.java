package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashStudy {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>();
		
		hs.add("Velocity");
		hs.add(123);
		hs.add('A');
		hs.add(null);
		hs.add("Pune");
		hs.add(null);
		hs.add(123.23);
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println("=================");
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("================");
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
	}

}
