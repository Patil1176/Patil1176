package logicalProgramme;

import java.util.Scanner;

public class AmstrongNum {

	public static void main(String[] args) {
		
//		int a=371;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of a");
		int a = sc.nextInt();
				
		int num = 0;
//		System.out.println(3/10);
//		System.out.println(3%10);
		
		for(int i=a; i>0; i= i/10)
		{	
			int num1=i%10;
			num=num+(num1*num1*num1);
		}
		System.out.println("Original Num a "+a);
		System.out.println("Addition Of digit cube is "+num);
		
		if(a==num)
		{
			System.out.println("The Value Is Amstrong");
		}
		else
		{
			System.out.println("The Value Is Not Amstrong");
		}
	}
	

}
