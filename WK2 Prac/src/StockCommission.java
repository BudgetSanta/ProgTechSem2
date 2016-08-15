// - PLANNING -
//
//    INPUT		|		PROCESS		    |		OUTPUT	
//-----------------------------------------------------
// $/share   	|	Calc money spent    | 	Amount paid for
// num shares	|	Calc comission     	|	fee
//				|	total (money + fee) |	total
//				|				        |	
//				|						|
//

import java.util.Scanner;

public class StockCommission {

	public static void main(String[] args) {
		
		final double FEE = 0.02;
		
		double shareCost;			// price per share
		double moneySpent;			// Money spent on shares
		double commission;			// Fee for stock broker
		double total;				// money spent + commission
		
		// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		
		// Get share cost and number of shares bought
		System.out.print("Enter price per share: $");
		shareCost = kb.nextDouble();
		System.out.print("Enter number of shares: ");
		moneySpent = shareCost * kb.nextDouble();
		
		// Calculate commission
		commission = moneySpent * FEE;
		
		// Calculate total
		total = moneySpent + commission;
		
		System.out.println("--------  RESULTS  -------");
		System.out.println("Amount paid for stock: $" + moneySpent);
		System.out.println("      Commission paid: $" + commission);
		System.out.println("    Total amount paid: $" + total);
		
		kb.close();
		
	}

}
