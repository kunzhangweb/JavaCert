package oca.cert.com;

public class MethodsEncapsulation {
	static String glide(String s) {
		return "1";
	}
	static String glide(String... s) {
		return "2";
	}
	static String glide(Object o) {
		return "3";
	}
	static String glide(String s, String t) {
		return "4";
	}
	
	public static void main(String[] args) {
		ReferenceTypes r = new ReferenceTypes();
		r.fly("test");
		r.fly(56);
		
		Plane p = new Plane();
		p.fly(123);
		p.fly(123L);
		
		// choose the right overload mode
		System.out.println(glide("a"));
		System.out.println(glide("a", "b"));
		System.out.println(glide("a", "b", "c"));
		
		//constructor chaining
		Mouse mouse = new Mouse(15);
		mouse.print();
		
		// order of initialization
		InitializationOrderSimple init = 
				new InitializationOrderSimple();
		
	}	// end main
	
	
}	// end class

class ReferenceTypes {
	public void fly(String s) {
		System.out.println("String");
	}
	
	public void fly(Object o) {
		System.out.println("object ");
	}
}	// end class ReferenceTypes

class Plane {
	public void fly(int i) {
		System.out.println("int");
	}
	public void fly(long l) {
		System.out.println("long");
	}
}	// end class Plane

/* constructor chaining*/
class Mouse {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	
	public Mouse(int weight) {
		this(weight, 16);	
	}	// calls constructor with 2 parameters	
	public Mouse(int weight, int numTeeth) {
		this(weight, numTeeth, 6);	// 
	}	// calls constructor with 3 parameters	
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;	// 
		this.numTeeth = numTeeth;	// 
		this.numWhiskers = numWhiskers;	// 
	}	
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
} // end class Mouse

/*Order of Initialization*/
class InitializationOrderSimple {
	private String name = "Torchie";
	{System.out.println(name);}
	private static int COUNT = 0;
	static {System.out.println(COUNT);}
	static {
		COUNT +=10;
		System.out.println(COUNT);
		}
	public InitializationOrderSimple() {
		System.out.println("constructor");
	}
}	// end class InitializationOrderSimple

// tough example
class YetMoreInitializationOrder {
	static {add(2);}
	static void add(int num) {
		System.out.println(num + " ");
		}
	YetMoreInitializationOrder() {add(5);}
	static {add(4);}
	{add(6);}
	static {new YetMoreInitializationOrder();}
	{add(8);}
}
