package logicalProgramme;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string ");
		String Orignal= sc.next();
		
		String Reverse = "";
		
		for(int i = Orignal.length()-1; i>=0; i--)
		{
			Reverse = Reverse + Orignal.charAt(i);
		}
		System.out.println("Given String Is = "+Orignal);
		System.out.println("Reverse String Is = "+Reverse);
		
		if(Orignal.equals(Reverse))
		{
			System.out.println("String Is Palindrome");
		}
		else
		{
			System.out.println("String Is Not Palindrome");
		}

	}

}
