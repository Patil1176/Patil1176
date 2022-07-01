package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) {
		
		Vector v = new Vector<>();
		
		v.add("Velocity");
		v.add(123);
		v.add(123.23);
		v.add(null);
		v.add('A');
		v.add(null);
		v.add("Velocity");
		
		System.out.println(v);
		
		v.add(1,"Pune");//adds element particuler index
		System.out.println(v);
		
		v.remove(2);
		System.out.println(v);
		
		System.out.println(v.contains("India"));
		System.out.println(v.size());
		
		System.out.println("==============");
		for(Object b:v)
		{
			System.out.println(b);
		}
		System.out.println("===============");
		System.out.println("===============");
		
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=============");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
