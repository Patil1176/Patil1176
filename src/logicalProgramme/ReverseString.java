package logicalProgramme;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of string ");
		String s = sc.next();
		
		System.out.println("Given String Is " +s);
		
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String Is " +rev);

	}

}
