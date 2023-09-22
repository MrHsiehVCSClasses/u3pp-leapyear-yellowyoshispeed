package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * 
 * @author YOUR NAME HERE
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();
		if (input.equals("STOP")){
			sc.close();
			return;
		}
		int cool = Integer.parseInt(input);
		if (LeapYear.isLeapYear(cool) == true) {
			System.out.println(cool + " is a leap year");
		}
		else{
			System.out.println(cool + " is not a leap year");
		}

		while (!input.toUpperCase().equals("STOP")) {
			System.out.println("Enter a year (or enter STOP to end): ");
			input = sc.nextLine();
			if (input.equals("STOP")){
				break;
			}
			cool = Integer.parseInt(input);
			if (LeapYear.isLeapYear(cool) == true) {
				System.out.println(cool + " is a leap year");
			}
			else{
				System.out.println(cool + " is not a leap year");
			}
			
			
			//YOUR CODE HERE
		}
		sc.close();
		//YOUR CODE HERE
	}
}