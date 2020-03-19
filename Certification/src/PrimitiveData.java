import java.math.BigDecimal;

public class PrimitiveData {

	public static void main(String[] args) {
//		long a = 123451234512345L;		
//		System.out.print(a);
		
//		int b = 0x2a;
//		System.out.println(b);
//		System.out.println(Integer.toBinaryString(b));
//		System.out.println(Integer.toBinaryString(42));
		
//		int c = 052;
//		// Octal or eight based 
//		System.out.pr

//		float d =  (float) 1.2345123512345;
//		float d =  1.2345123512345f;
//		System.out.println(d);	
//		
//		double e =  1.23451234512345;
//		System.out.println(e);	
		
//		double e = 0.02;
//		System.out.println(e);
//		System.out.println(new BigDecimal(e));
		
//		char a = 'a';
//		char b = 97;
//		char e = '\u03C0';
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(e);
//		System.out.println(a + b + e);
		
//		int max = Integer.MAX_VALUE;
//		System.out.println(max);
//		System.out.println('0' + Integer.toBinaryString(max));
//		// overflow
//		max = Integer.MAX_VALUE + 1;
//		System.out.println(max);
//		System.out.println( Integer.toBinaryString(max) );
		
//		int min = Integer.MIN_VALUE;
//		System.out.println(min);
//		System.out.println( Integer.toBinaryString(min) );
//		int too_small = min - 1;
//		System.out.println(too_small);
//		System.out.println('0' + Integer.toBinaryString(too_small));
		
		// add an imprecise # many times
		double sum = 0;
		for(int i=0; i<50; i++) {
			sum += 0.02;
		}
		
		System.out.println( sum );
	}

}
