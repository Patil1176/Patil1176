package logicalProgramme;

public class ReverseNumberWithoutString {

	public static void main(String[] args) {
		
		int a = 123;
		int rev = 0;
		
		for(int i=a; i>0; i=i/10)
		{
			int rem = i%10;
			
			rev = (rev*10)+rem;
		}
		System.out.println("Original Number Is "+a);
		System.out.println("Reverse Number Is "+rev);

	}

}
