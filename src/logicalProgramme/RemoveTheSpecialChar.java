package logicalProgramme;

public class RemoveTheSpecialChar {

	public static void main(String[] args) {
		
		String str = "Velocity@";
		
		System.out.println(str.replace("@",""));
		
		String str1 = "Velo$city@#";
		System.out.println(str1.replaceAll("[^a-z A-Z]", ""));

	}

}
