package logicalProgramme;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//int a = 8;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter The Value Of a ");
		int a = sc.nextInt();
		
		int count = 0;
		
		for(int i=2; i<a; i++ )
		{
			if(a%i == 0)
			{
				count++;
				
			}
			
			
		}
		if(count == 0)
		{
			System.out.println("Number "+a+" This Is a Prime Number");
		}
		else
		{
			System.out.println("Number " +a+" This Is Not A Prime Number");
		}

	}

}
