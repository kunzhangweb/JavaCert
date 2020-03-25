package oca.cert.com;

public class Chick {
//	{ System.out.println(name); } // does not compile
	private String name = "Fluffy";
	{
		System.out.println("setting field");
	}
	
	public Chick() {
		name = "Tiny";
		System.out.println( "setting constructor" );
	}
	
	public static void main(String[] args) {
		
		Chick chick = new Chick();
		
		System.out.println(chick.name);
	}
}
