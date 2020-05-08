package oca.cert.com;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		List<LambdaAnimal> animals = new ArrayList<LambdaAnimal>();	// list of animals
		animals.add( new LambdaAnimal( "fish", false, true) );
		animals.add( new LambdaAnimal( "kangroo", true, false) );
		animals.add( new LambdaAnimal( "rabbit", true, false) );
		animals.add( new LambdaAnimal( "turtle", false, true) );
		
		print(animals, new CheckIfHopper());
	}	// end main
	
	private static void print(List<LambdaAnimal> animals, CheckIfHopper checker) {
		for(LambdaAnimal animal: animals) {
			if (checker.test(animal)) {
				System.out.print(animal + " ");
			}
		}// end for loop
		System.out.println();
	}
}	// end class

class LambdaAnimal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public LambdaAnimal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop  = hopper;
		canSwim = swimmer;
	}	// end constructor
	
	public String toString() { return species; }
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
} // end class LambdaAnimal

class CheckIfHopper implements CheckTrait {
	public boolean test(LambdaAnimal la) {
		return la.canHop();
	}
}
