//						PLANNING

// 115**2 feet = 1 gallon paint (= 8 hours labour @ $18/h)

//		INPUT		    |		  PROCESS	        |		 OUTPUT
//	  Num Rooms`	| ttlSquareFeet/115	  |  gallons needed
// $ paint/gallon | gallonsNeeded * 8	  |	hours of labour
//	 SQ Feet/room	| gallonsNeeded*price |	cost of paint
//						        hoursLabour*18    |   cost of labour
//				        		paint + labour	  |	total cost

import java.util.Scanner;

public class PaintJobEstimator {

	public static void main(String[] args) {

		// SET VARS
		final double HOURS_PER_GALLON = 8;	    // Hours of labour per gallon
		final double WAGE_PER_HOUR = 18;	      // Wage of labour per hour
		final double SQ_FEET_PER_GALLON = 115;  // How many square feet can be painted by each gallon
		
		// VARIABLES
		int numRooms;						      // Number of rooms to paint
		double paintCostGallon;				// Cost of paint per gallon
		double ttlSquareFeet = 0;			// The total number of square feet to paint
		double gallonsNeeded = 0;			// How much paint will be needed to complete the job
		double hoursOfLabour = 0;     // How many hours of work needed
		double costOfPaint;           // How much paint will cost
		double costOfLabour;          // How much labour will cost
		double totalCost;             // How much the paint job will cost in total
		
		// New keyboard input instance
		Scanner kb = new Scanner(System.in);

		// Asks for number of rooms till positive
		do {
			pt("Please enter a positive number of rooms: ");
			numRooms = kb.nextInt();
		} while (numRooms < 1);
		
		// Asks for price of paint per gallon till positive
		do {
			pt("Please enter a positive dollar amount of paint per gallon. $");
			paintCostGallon = kb.nextDouble();
		} while (paintCostGallon < 0.0);
		
		// Adding total square footage of rooms
		for (int i = 1; i < numRooms +1; i++) {
			// Asks for square footage of room i
			do {
			  pt("Please enter the postive square footage of room " + i + ": ");
			  ttlSquareFeet += kb.nextDouble();
			} while (ttlSquareFeet < 0.0);
		}
		
	  // Closing Keyboard input instance
		kb.close();
		
		// NOTE: Using methods to get these calculations are excessive for this simple program
		// Calculating outputs
		gallonsNeeded = ttlSquareFeet/SQ_FEET_PER_GALLON;     // Gallons of paint needed
		hoursOfLabour = gallonsNeeded*HOURS_PER_GALLON;       // Hours of work needed
		costOfPaint = gallonsNeeded*paintCostGallon;          // Cost of paint total
		costOfLabour = hoursOfLabour*WAGE_PER_HOUR;           // Cost of labour total
		totalCost = costOfPaint + costOfLabour;               // Total cost
		
		// Final output
		ptLn("");                                             // Break before output
		ptLn("-- Total Project Costs --");                    // Title
		ptLn("Gallons of paint needed: " + gallonsNeeded);    // Paint
		ptLn(" Hours of labour needed: " + hoursOfLabour);    // Labour
		ptLn("   Total cost of paint:  $" + costOfPaint);     // Paint Cost
		ptLn("   Total cost of labor:  $" + costOfLabour);    // Labour Cost
		ptLn("");                                             // Break before grand total
		ptLn("      Grand Total Cost:  $" + totalCost);       // Total Cost
	}
	
	// Shortened method to println()
	static void ptLn(String message) {
	  System.out.println(message);
	}
	// Shortened method to print()
	static void pt(String message) {
	  System.out.print(message);
	}
}