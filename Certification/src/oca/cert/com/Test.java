package oca.cert.com;

public class Test {

	public static void main(String[] args) {
		// Passing data among methods 
		int num = 4;
		newNumber(5);
		System.out.println(num);
		
		// a reference type
		String name = "Webby";
		speak(name);
		System.out.println(name);
		
		// a StringBuilder example
		StringBuilder sb = new StringBuilder();
		speakSb(sb);
		System.out.println("The reference content: " + sb);
		
		// pass by value versus pass by reference
		int original1 = 1;
		int original2 = 2;
		swap(original1, original2);
		System.out.println(original1);
		System.out.println(original2);
		
	}	// end main method
	
	public static void newNumber(int num) {
		num = 8;
	}
	
	public static void speak(String name) {
		name = "Sparky";
	}
	public static void speakSb(StringBuilder s) {
		s.append("Maria");
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}	// end class


