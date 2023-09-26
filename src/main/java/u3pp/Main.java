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
		String input = sc.nextLine(); // gets input of user 
		if (input.equals("STOP")){ // Stops program if they say stop
			sc.close();
			return;
		}
		int cool = Integer.parseInt(input); // makes input into a string
		if (LeapYear.isLeapYear(cool) == true) { // Checks through the method if it is a leap year, else says it isn't
			System.out.println(cool + " is a leap year");
		} // created cuz Mr. Sheih wanted the thing at the start and I don't like it :(
		else{
			System.out.println(cool + " is not a leap year");
		}

		while (!input.toUpperCase().equals("STOP")) { // Loops until "STOP"
			System.out.println("Enter a year (or enter STOP to end): ");
			input = sc.nextLine();
			if (input.equals("STOP")){
				break;
			}
			cool = Integer.parseInt(input);
			if (LeapYear.isLeapYear(cool) == true) { // same thing as above. gaming.
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