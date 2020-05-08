package oca.cert.com;

public class ForStatement {

	public static void main(String[] args) {
		// Adding multiple terms
//		int x = 0;
//		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
//			System.out.println(y + "");
//		}
//		System.out.println("When the for loop is end, x = " + x);
		
		// redeclaring a variable in the initialization block
//				int x = 0;
//				// does not compile
//				for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//					System.out.println(x + "");
//				}
//				System.out.println( x + "" );
//		int x = 0;
//		long y = 10;
//		for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//			System.out.println(x + "");
//		}
		
		// using incompatible data types in the initialization block
		// does not compile
//		for (long y = 0, int x = 4; x < 5 && y < 10; x++, y++) {
//			System.out.println(x + "");
//		}
		
		// using loop variables outside the loop
//		for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//			System.out.println(y + "");
//		}
//		System.out.println(x);	// does not compile
	}	// end main

}
