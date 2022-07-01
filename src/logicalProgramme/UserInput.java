package logicalProgramme;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the input a");
		int a = sc.nextInt();
		
		System.out.println("enter the input b");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Addition Is "+sum);
	}

}
