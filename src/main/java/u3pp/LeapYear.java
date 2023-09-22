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
		if (year < 1582){
			return false;
		}
		else if (year % 400 == 0){
			return true;
		}
		if (year % 4 == 0) {
			if (year % 100 == 0){
				return false;
			}
			return true;
		}
		return false;
	}
}