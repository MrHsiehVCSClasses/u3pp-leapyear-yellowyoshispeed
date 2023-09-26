package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author //YOUR NAME HERE
 *
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
	 */
	public static boolean isLeapYear(int year) {
		if (year < 1582){ // checks if it's less than 1582
			return false;
		}
		else if (year % 400 == 0){ // checks if it's divisiable by 400 FIRST
			return true;
		}
		if (year % 4 == 0) { // checks if it's divisable by 4 NEXT
			if (year % 100 == 0){ // check sif that divisable by 4 is divisable by 100, gaming.
				return false;
			}
			return true;
		}
		return false; // needs to return something, java panik
	}
}