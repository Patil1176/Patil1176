package logicalProgramme;

import java.util.Scanner;

public class EvenAndOddNumProgramme {

	public static void main(String[] args) {
		
//		int a=10;
//		int b=2;
//		
//		System.out.println("Division"+a/b);
//		System.out.println("Remainder"+a%b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of a");
		int a = sc.nextInt();
		int b = 2;
		int Res;
		
		Res = a%b;
		
		if(Res==0)
		{
			System.out.println("If The Value Is Even");
		}
		else
		{
			System.out.println("If The Value Is Odd");
		}
	}

}
