package oca.cert.com;
import java.util.*;

public class JavaAPIs {

	public static void main(String[] args) {
		// equals() and equalsIgnoreCase()
		System.out.println( "equals()--------------" );
		System.out.println( "abc".equals("ABC") );
		System.out.println( "ABC".equals("ABC") );
		System.out.println( "abc".equals("ABC") );
		
		// startsWith() and endsWith()
		System.out.println( "startsWith()--------------" );
		System.out.println( "abc".startsWith("a") );
		System.out.println( "abc".startsWith("A") );
		System.out.println( "abc".endsWith("c") );
		System.out.println( "abc".endsWith("a") );
		
		// contains()
		System.out.println( "contains()--------------" );
		System.out.println( "abc".contains("b") );
		System.out.println( "abc".contains("B") );
		
		// replace()
		System.out.println( "replace()--------------" );
		System.out.println( "abcabc".replace('a', 'A') );
		System.out.println( "abc".replace("a", "A") );
		
		// method chaining
//		System.out.println( "chaining--------------" );
//		String a = "abc";
//		String b = a.toUpperCase();
//		b = b.replace('B', '2').replace('C', '3');
//		System.out.println( "a = "+ a );
//		System.out.println( "b = "+ b );
		
		/* using StringBuilder Class 
		 * */		
		System.out.println( "StringBuilder Class--------------" );
//		StringBuilder alpha = new StringBuilder();
//		for (char current = 'a'; current <= 'z'; current++) {
//			alpha.append(current);
//		}
//		System.out.println(alpha);
//		
//		StringBuilder a = new StringBuilder("abc");
//		StringBuilder b = a.append("de");
//		b = b.append("f").append("g");
//		System.out.println( "a = "+ a );
//		System.out.println( "b = "+ b );
		
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println( sub + " "+ len + " " + ch );
		
		// insert()
		System.out.println( "replace()--------------" );
		sb.insert(7, '-');
		sb.insert(0, '-');
		sb.insert(4, '-');
		System.out.println(sb);
		
		// reverse()
		sb.reverse();
		System.out.println(sb);
		
		/* understanding equality
		 * 
		 * */
		System.out.println( "equality--------------" );
		String x = "Hello World!";
		String y = "Hello World!";
		String z = " Hello World!".trim();
		System.out.println(x == y);
		System.out.println(x == z);
		System.out.println(x.equals(z));
		
		/* sort()
		 * */
		System.out.println( "sort()--------------" );
		int[] numbers = {6, 9, 1};
		Arrays.sort(numbers);
		
		System.out.println( numbers );
		for (int i = 0; i < numbers.length; i++) {
			System.out.print( numbers[i] + " ");
		}
		
		// binary search
		System.out.println( "\n" );
		System.out.println( Arrays.binarySearch(numbers, 6) );
		System.out.println( Arrays.binarySearch(numbers, 1) );
		System.out.println( Arrays.binarySearch(numbers, 3) );
		System.out.println( Arrays.binarySearch(numbers, 7) );
		
		//
		System.out.println( "\n" );
		int[] numbers2 = new int[] {3, 2, 1};
		System.out.println( Arrays.binarySearch(numbers2, 2) );
		System.out.println( Arrays.binarySearch(numbers2, 3) );
	}	// end main

}
