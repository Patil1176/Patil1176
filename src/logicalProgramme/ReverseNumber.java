package logicalProgramme;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a = 123;
		
		String Original = Integer.toString(a);
		String rev = "";
		
		for(int i=Original.length()-1; i>=0; i--)
		{
			rev = rev+Original.charAt(i);
		}
		int ReverseNum = Integer.parseInt(rev);
		
		System.out.println("Original Number "+a);
		System.out.println("Reverse Number "+ReverseNum);

	}

}
