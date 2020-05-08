package oca.cert.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fish {

	public static void main(String[] args) {
		// Question 1
//		int numFish = 4;
//		String fishType = "Tuna";
//		String anotherFish = numFish + 1;
//		System.out.println(anotherFish + " " + fishType);
		
		// Question 2
		String s = "Hello";
		String t = new String(s);
		if( "Hello".equals(s) )System.out.println( "one" );
		if( t == s )System.out.println( "two" );
		if( t.equals(s) )System.out.println( "three" );
		if( "Hello" == s )System.out.println( "four" );
		if( "Hello" == t )System.out.println( "five" );

		// Question 6
		// Question 9
		String s9 = "purr";
		s9.toUpperCase();
		s9.trim();
		s9.substring(1, 3);
		s9 += " two";
		System.out.println(s9.length());
		
		// Question 12
		System.out.println( "Q12---------" );
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8);
		numbers.append("-").insert(2, "+");
		System.out.println( numbers );
		
		// Question 13
		System.out.println( "Q13---------" );
//		StringBuilder b = "rumble";
		
		// Question 14
		System.out.println( "Q14---------" );
		StringBuilder puzzle = new StringBuilder("Java");
		puzzle.reverse();
		System.out.println( puzzle );
		
		// Question 16
//		System.out.println( "Q16---------" );
//		char[] c = new char[2];
//		int length = c.length;
		
		// Question 17
//		ArrayList l = new ArrayList();
//		int length = l.size();
		
		// Question 20
//		System.out.println( "Q20---------" );
//		List<String> list = new ArrayList<String>();
//		list.add("one");
//		list.add("two");
//		list.add(7);
		
		// Question 21
		System.out.println( "Q21---------" );
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for(Integer v  :values) System.out.println(v);
		
		// Question 22
		System.out.println( "Q22---------" );
		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
		
		// Question 23
		System.out.println( "Q23---------" );
		List<Integer> list23 = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list23);
		Integer array[] = list23.toArray(new Integer[4]);
		System.out.println(array[0]);
		
		// Question 24
//		System.out.println( "Q24---------" );
//		String[] names = {"Tom", "Dick", "Harry"};
//		List<String> list24 = names.asList();
		
		// Question 25
		System.out.println( "Q25---------" );
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		int x25 = Collections.binarySearch(hex, "8");
		int y25 = Collections.binarySearch(hex, "3A");
		int z25 = Collections.binarySearch(hex, "4F");
		
		System.out.println(x25 + " " + y25 + " " + z25);
		System.out.println(hex);
		
		// Question 26
//		System.out.println( "Q26---------" );
//		List<Integer> ages = new ArrayList<Integer>();
//		ages.add(Integer.parseInt("5"));
//		ages.add(Integer.valueOf("6"));
//		ages.add(7);
//		ages.add(null);
//		for(int age : ages) System.out.println(age);
		
		// Question 29
//		System.out.println( "Q29---------" );
//		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
//		date.plusDays(2);
//		date.plusHours(3);
		
		// Question 30
		System.out.println( "Q30---------" );
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + 
				date.getDayOfMonth());
		
		// Question 31
		System.out.println( "Q31---------" );
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
		
		// Question 8
		System.out.println( "Q8---------" );
		String numbers8 = "012345678";
		System.out.println(numbers8.substring(1, 3));
		System.out.println(numbers8.substring(7, 7));
		System.out.println(numbers8.substring(7));
		
		// Question 10
		System.out.println( "Q10---------" );
		String a10 = "";
		a10 += 2;
		a10 += 'c';
		a10 += false;
		if (a10 == "2cfalse")System.out.println( "==" );
		if (a10.equals("2cfalse"))System.out.println( "equals" );
		
		
	}	// end main
	
	public class Lion {
		public void roar(String roar1, String roar2) {
			roar1.concat("!!!");
//			roar2.append("!!!");
		}
	}

}
