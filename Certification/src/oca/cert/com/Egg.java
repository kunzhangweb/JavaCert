package oca.cert.com;

public class Egg {
	public Egg() {
		number = 5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Egg egg = new Egg();
		System.out.println(egg.number);
	}
	
	private int number = 3;
	{ number = 4;}
}
