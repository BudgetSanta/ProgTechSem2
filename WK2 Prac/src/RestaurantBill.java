// - PLANNING -
//
//    INPUT		|		PROCESS		    |		OUTPUT	
//-----------------------------------------------------
// Meal Charge	|	Get Meal Charge     | 	Meal Charge
// 				|	Calc Tax Amount 	|	Tax Amount
//				|	Calc Tip Amount 	|	Tip Amount
//				|	Calc Total Bill     |	Total Bill
//				|	Display Charge,		|
//				|   Tax, amount, tip,	|
//				|   total				|
//

import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args) {
		
		// Set variables so FINAL
		final double TAX_RATE = 0.0675;		// tax rate
		final double TIP_PERCENT = 0.15;	// tip percent
		
		double mealCharge;	// meal charge
		double tax;			// tax amount
		double tip;			// tip amount
		double total;		// total bill
		
		// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		
		// Get the charge for the meal
		System.out.print("Enter meal charge: ");
		mealCharge = kb.nextDouble();
		
		// Calculate the tax, tip and total
		tax = TAX_RATE*mealCharge;
		tip = TIP_PERCENT*(mealCharge + tax);
		total = mealCharge + tax + tip;
		
		// Display the meal charge, tax, tip and total
		System.out.println(" MEAL CHARGE: $" + mealCharge);
		System.out.println("  TAX AMOUNT: $" + tax);
		System.out.println("  TIP AMOUNT: $" + tip);
		System.out.println("TOTAL AMOUNT: $" + total);
		
		kb.close();
	}

}
