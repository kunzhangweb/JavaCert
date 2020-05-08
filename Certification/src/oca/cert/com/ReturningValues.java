package oca.cert.com;

public class ReturningValues {

	public static void main(String[] args) {
		int number = 1;
		String letters = "abc";
		number(number);
		letters = letters(letters);
		System.out.println(number + letters);
		
		String s1 = "java"; 
        s1.concat(" rules"); 
//		s1 += " rules";
        // Yes, s1 still refers to "java" 
        System.out.println("s1 refers to " + s1);
        
        String s2 = "java"; 
        s2 = s2.concat(" rules"); 
        // Now, s2 refers to "java rules" 
        System.out.println("s2 refers to " + s2);
	}	// end main
	
	public static int number(int number) {
		number++;
		return number;
	}
	public static String letters(String letters) {
		letters += "d";
//		System.out.println(letters);
		return letters;
	}
}
