package oca.cert.com;

public class Animal {
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	// main gate to start the app
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}
