package oca.cert.com;

public class Counter {
	private static int count;
	// constructor
	public Counter() {
		count++;
	}
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(count);
		
		// pass-by-value vs. pass-by-reference
		int original1 = 1;
		int original2 = 2;
		swap(original1, original2);
		System.out.println(original1);
		System.out.println(original2);
	}// end main
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}// end class
