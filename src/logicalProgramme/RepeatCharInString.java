package logicalProgramme;

import java.util.HashMap;
import java.util.Set;

public class RepeatCharInString {

	public static void main(String[] args) {
		
		String str = "abcabcabc";
		
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char charValue = str.charAt(i);
			
			if(mp.containsKey(charValue))
			{
				mp.put(charValue, mp.get(charValue)+1);
			}
			else
			{
				mp.put(charValue, 1);
			}
			
		}
		//System.out.println(mp);
		
		Set<Character> Keys = mp.keySet();
		
		for(Character key:Keys)
		{
			System.out.println(key+ " " +mp.get(key));
		}

	}

}
