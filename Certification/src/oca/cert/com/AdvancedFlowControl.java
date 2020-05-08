package oca.cert.com;

public class AdvancedFlowControl {

	public static void main(String[] args) {
		
		// Nested loops
		int[][] myComplexArray = { {5,2,1,3}, {3,9,8,9}, {5,7,12,7} };
		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
		
		// nested while loop
//		System.out.println("---------------------");
//		
//		int x = 20;
//		while (x>0) {
//			do {
//				x-=2;
//			} while(x>5);
//			x--;
//			System.out.print(x + "\t");
//		} // end while
		
		// adding optional labels
		System.out.println("---------------------");
		
		int[][] list = { {1,13,5}, {1,2,5}, {2,7,2} };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				} // end if
			}// end inner for
		}
		
		if (positionX==-1 || positionY==-1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + 
				"(" + positionX + "," + positionY + ")");
		}// end if
		
		/* continue statement
		 * */
		System.out.println("---------------------");
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b') {
					continue FIRST_CHAR_LOOP;
				}
				System.out.print(" " + a + x);
			}	// end inner loop
		}	// end outer for loop
		
		// remove the FIRST_CHAR_LOOP label
		System.out.println("\n");
		System.out.println("---------------------");
		for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b') {
					continue;
				}
				System.out.print(" " + a + x);
			}	// end inner loop
		}	// end outer for loop
		
		/* question 5
		 * */
		System.out.println("\n");
		System.out.println("---------------------");
		java.util.List<Integer> list5 = new java.util.ArrayList<Integer>();
		list5.add(10);
		list5.add(14);
		for (int x5 : list5) {
			System.out.print(x5);
			break;
		}
		/* question 6
		 * */
		System.out.println("\n");
		System.out.println("Question 6---------------");
		int z = 4;
		long u = z * 4 - z++;
		if(u<10) System.out.println("Too Low");
		else System.out.println("Just right");
//		else System.out.println("Too High"); does not compile
		
		/* question 13
		 * */
		System.out.println("\n");
		System.out.println("Question 13----------------");
		int x1 = 50, x2 = 75;
		boolean b = x1 >= x2;
		if(b = true) System.out.println("Success");
		else System.out.println("Failure");
		
	} // end main

}
