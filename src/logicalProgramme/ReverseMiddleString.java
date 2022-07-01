package logicalProgramme;

public class ReverseMiddleString {

	public static void main(String[] args) {
		
		String sample = "abc pqr xyz";
		String[] ar = sample.split(" ");
		System.out.println(sample);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			if(i%1==0) 
			{	
				String s = ar[i];
				ar[i]=revString(s);
				System.out.print(ar[i] +" ");
			}
			else
			{
				System.out.print(ar[i] +" ");
			}
		}
		
	}

	private static String revString(String inp) {
		String rev = "";
		
		for(int i=inp.length()-1; i>=0; i--)
		{
			rev = rev+inp.charAt(i);
		}
		return rev;
	}
}