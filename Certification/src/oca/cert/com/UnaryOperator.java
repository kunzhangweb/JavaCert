package oca.cert.com;

import java.io.File;

public class UnaryOperator {

	public static void main(String[] args) {
		
//		int counter = 0;
		
//		System.out.println(counter);	// Outputs 0
//		System.out.println(++counter);	// Outputs 1
//		System.out.println(counter);	// Outputs 1
//		System.out.println(counter--);	// Outputs 1
//		System.out.println(counter);	// Outputs 0
		
		// less common
//		int x = 3;
//		int y = ++x * 5 / x-- + --x;
//		System.out.println("x is " + x);
//		System.out.println("y is " + y);
		
		// casting primitive values
//		int x = (int)1.0;
//		short y = (short)1921222;
//		int z = (int)9L;
//		long t = 192301398193810323L;
//		System.out.println(x);	
//		System.out.println(y);	
//		System.out.println(z);	
//		System.out.println(t);	
//		
//		// overflow
//		System.out.println(2147483647 + 1);
		
		// compound assignment operators
//		long x = 10;
//		int y = 5;
//		y = y * x;	// does not compile
//		y *= x;
//		System.out.println(y);
		
		// object comparison
//		File x = new File("myFile.txt");
//		File y = new File("myFile.txt");
//		File z = x;
//		System.out.println(x == y);
//		System.out.println(x == z);
		
//		int y = 10;
//		final int x;
//		if (y > 5) {
//			x = 2 * y;
//		} else {
//			x = 3 * y;
//		}
		
		// equivalent code snippet
		int y = 10;
		int x = (y > 5) ? (2 * y) : (3 * y);
		System.out.println(x);
	}	// end main

}	// end class
