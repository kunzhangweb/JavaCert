package oca.cert.com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayFunctions {

	public static void main(String[] args) {
		// function add()
		ArrayList list = new ArrayList();
		list.add("Picachu");
		list.add(Boolean.TRUE);
		System.out.println(list);
		
		// only add strings
		List<String> fighters = new ArrayList<>();
		fighters.add("F22");
		fighters.add(1, "F35");
		fighters.add(0, "Su37");
		fighters.add(1, "Typhon");
		System.out.println(fighters.size());
		
		// function set()
		fighters.set(1, "Lion");
		System.out.println(fighters);
		
		// function isEmpty()
		System.out.println(fighters.isEmpty());
		
		// function isEmpty()
		System.out.println("isEmpty------------");
		fighters.clear();
		System.out.println(fighters.isEmpty());
		System.out.println(fighters.size());
		
		// contains()
		System.out.println("contains------------");
		fighters.add("Bf109");
		System.out.println(fighters.contains("Bf109"));
		System.out.println(fighters.contains("Mustang"));
		
		// equals
		System.out.println("equals------------");
		List<String> one = new ArrayList<String>();
		List<String> two = new ArrayList<String>();
		System.out.println(one.equals(two));
		one.add("a");
		System.out.println(one.equals(two));
		two.add("a");
		System.out.println(one.equals(two));
		one.add("b");
		System.out.println(one.equals(two));
		one.add(0, "b");
		System.out.println(one.equals(two));
		
		// throws NumberFormatException
		System.out.println("exception------------");
		try {
			int bad1 = Integer.parseInt("a");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The return type doesn't match.");
		}	// end try
		
		// Autoboxing
		System.out.println("Autoboxing------------");
		
		List<Double> weights = new ArrayList<Double>();
		weights.add(50.5);
		weights.add(new Double(60));
		System.out.println(weights);
		weights.remove(50.5);
		double first = weights.get(0);
		System.out.println(first);
		
		List<Integer> heights = new ArrayList<Integer>();
		heights.add(null);
		try {
			int h = heights.get(0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Null pointer exception.");
		}
		
		// Converting between array and list
		System.out.println("Converting------------");
//		List<String> list2 = new ArrayList<String>();
//		list2.add("Hawk");
//		list2.add("robin");
//		Object[] objectArray = list2.toArray();
//		System.out.println(objectArray.length);
		
		String[] array = {"John", "Mary"};
		List<String> list3  = Arrays.asList(array);
		System.out.println(list3.size());
		list3.set(1, "test");
		array[0] = "New";
		for (String b: array) {
			System.out.println(b + " ");			
		}
		try {
			list3.remove(1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not allowed to change the size of the list.");
		}
		
		
	}	// end main

}
