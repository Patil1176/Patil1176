package logicalProgramme;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int a = 3;
		int fac = 1;
		for(int i=a; i>=1; i--)
		{
			fac = fac*i;
			
		}
		System.out.println("Original Num Is "+a+" Factorial Value Is "+fac);

	}

}
