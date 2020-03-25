package packageb;
import packagea.ClassA;

public class ClassB {

	public static void main(String[] args) {
		// initialize an instance of ClassA
		ClassA a = new ClassA();
		a.printHello();
		
		System.out.println("B got it!");
	}

}
