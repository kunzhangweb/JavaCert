package oca.cert.com;

public class SwitchExamples {

	public static void main(String[] args) {
		// break is missing in the case 6
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
//			break;
		default:
			System.out.println("Weekday");
		}

	}

}
