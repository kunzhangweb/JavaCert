package oca.cert.com;

public class DisplayNumbers {

	public static void main(String[] args) {
		// different bases
		System.out.println(56);	// base 10 
		System.out.println(0b11);	// base 2 
		System.out.println(017);	// base 8 
		System.out.println(0x1F);	// base 16 
		
		// underscores in numbers
		int million1 = 1000000;
		int million2 = 1_000_000;
		
		System.out.println(million1);
		System.out.println(million2);	
		
//		double notAtStart = _1000.00; // does not compile
//		double notAtEnd = 1000.00_; // does not compile
//		double notByDecimal = 1000_.00; // does not compile
		double annoyingButLegal = 1_00_0.0_0; // this one compile
		
		System.out.println(annoyingButLegal);
		
		int i1, i2, i3 = 0;
		
//		System.out.println("i1: " + i1);
//		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		
//		int num, String value; // does not compile
//		double b1, double b2;	// not allowed
		
	}

}
