package oca.cert.com;

public class Eating {
	public void eatIfHungry(boolean hungry) {
//		if (hungry) {
//			int bitesOfCheese = 1;
//			double d1 = Double.NaN;
//			double d2 = d1;
//			
//			System.out.println(d1);
//			System.out.println(d2);
//			// compare the reference
//			if(d1 == d2) {
//				System.out.println("Equal!");
//			} else {
//				System.out.println("Not!");
//			}
//		}	// bitesOfCheese goes out of scope here
//		System.out.println(bitesOfCheese);//does not compile
		
		// smaller scope example
		if (hungry) {
			int bitesOfCheese = 1;
			{
				boolean tinyBit = true;
				System.out.println(bitesOfCheese);
			}
			
//			System.out.println(tinyBit );	// does not compile
		}
	}
	public static void main(String[] args) {
		// 
		Eating eating = new Eating();
		eating.eatIfHungry(true);
	}

}
