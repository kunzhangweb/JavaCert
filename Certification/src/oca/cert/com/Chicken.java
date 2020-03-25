package oca.cert.com;

public class Chicken {
	int numEggs = 0; // initialize on line
	String name;
	
	public Chicken() {
		name = "Duke";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken chicken = new Chicken();
		
		System.out.println(chicken.name + " lays " + 
				chicken.numEggs + " eggs today.");
	}

}
