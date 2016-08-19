//  Student ID: 18347500
//  Name: Jared Steiner
//  Campus: Parramatta
//  Tutor Name: Jordan Collier
//  Class Day: Tuesday
//  Class Time: 9am

import java.util.Scanner; 

public class Pennies_18347500 {

	public static void main(String[] args) {
		
		// Variables
		int daysWorked;		  		   // X days
		int penniesToday = 1;	     // Amount of pennies any day
		int runningPennies = 0; // Total money in pennies

		// Scanner instance for keyboard input
		Scanner kb = new Scanner(System.in);
		
		// Asks for days worked input till positive
		do {
			System.out.print("Please enter a positive number of days: ");	
			daysWorked = kb.nextInt();												
		} while (daysWorked < 1);	

		// Setting up the output
		System.out.println("Day      Today's Pay");
		System.out.println("--------------------");
		
		// Looping through the total calculations
		for (int i = 1; i < daysWorked+1 ; i++) {	                                   // daysWorked plus one for off by one error when looping
			System.out.println(i + "         $" + (penniesToDollars(penniesToday)) );	 // Print out of results
			runningPennies += penniesToday;											                       // Adding result to running total
			penniesToday *= 2;														                             // more pennies for tomorrow
		}
		
		// Output of final dollar amount
		System.out.println("Total Accumulated Dollars is $" + penniesToDollars(runningPennies));
		
		kb.close();
		
	}
	
	static double penniesToDollars(double pennies) {
	  return pennies/100.0;
	}
}
