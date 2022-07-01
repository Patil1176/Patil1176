package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add(123);
		al.add('A');
		al.add("Pune");
		al.add(123.23);
		al.add(null);
		al.add(null);
		al.add("Pune");
		
		System.out.println(al);
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println(al.get(2));
		System.out.println(al.get(4));
		System.out.println(al.get(6));
	}

}
