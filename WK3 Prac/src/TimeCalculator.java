// - PLANNING -
//
//    INPUT		|		PROCESS		    |		OUTPUT	
//-----------------------------------------------------
//   Seconds   	|	Days Calc?          | 	Days OR
// 				|	Hours Calc?     	|	Hours OR
//				|	Minutes Calc?		|	Mins OR
//				|				        |	Secs
//				|						|
//

import java.util.Scanner;

public class TimeCalculator {
	
	public static void main(String[] args) {
		
		// SET VARS
		final int SEC_IN_MIN = 60;		// Seconds in a minute
		final int SEC_IN_HOUR = 3600;	// Seconds in an hour
		final int SEC_IN_DAY = 86400;	// Seconds in a day
		
		// VARIABLES
		int secondsInp;		// User input seconds
		
		// Scanner input instance
		Scanner kb = new Scanner(System.in);	
		
		// Asks for seconds input till whole and positive
		do {
			System.out.print("Please enter a positive whole number of seconds: ");	
			secondsInp = kb.nextInt();												
		} while (secondsInp < 0);		
		
		// Removes excess seconds if not divisible by 60 (never more than 59 seconds)
		secondsInp -= secondsInp % 60;
		
		// If greater than a day, prints days
		if (secondsInp >= SEC_IN_DAY) {
			System.out.print("The input contains " + (secondsInp / SEC_IN_DAY) + " days.");
		}
		
		else if (secondsInp >= SEC_IN_HOUR) {
			System.out.print("The input contains " + (secondsInp / SEC_IN_HOUR) + " hours.");
		}
		
		else if (secondsInp >= SEC_IN_MIN) {
			System.out.print("The input contains " + (secondsInp / SEC_IN_MIN) + " minutes.");
		}
		
		else {
			System.out.print("The input contains " + secondsInp + " seconds, which is less than a minute.");
		}
		
		kb.close();
	}

}
