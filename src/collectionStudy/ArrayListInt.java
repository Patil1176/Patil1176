package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Integer k:al)
		{
			System.out.println(k);
		}
		
 	}

}
