package logicalProgramme;

import java.util.HashMap;
import java.util.Set;

public class RepetativeStringInString {

	public static void main(String[] args) {
		
		String str = "abc xyz pqr abc pqr lmn";
		
		String[] ar = str.split("");
		
		HashMap<String, Integer> sp = new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String s1 = ar[i];
			
			if(sp.containsKey(s1))
			{
				sp.put(s1, sp.get(s1)+1);
			}
			else
			{
				sp.put(s1, 1);
			}
		}
		
		//System.out.println(sp);
		
		Set<String> Keys = sp.keySet();
		
		for(String k:Keys)
		{
			System.out.println(k+" "+sp.get(k));
		}

	}

}
