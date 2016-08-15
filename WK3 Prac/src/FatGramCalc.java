import java.util.Scanner;

public class FatGramCalc {

	public static void main(String[] args) {

		// SET VARS
		final double CALORIES_IN_FAT = 9;		// Calories per fat gram
		final double LOW_FAT_CAL_PERCENT = 30;	// Percentage of calories that counts as low fat
		
		// Variables
		double userCalories;					// User input calories
		double userFat;							// User input fat
		double caloriesFromFat;					// Calories that came from the fat
		double percentCaloriesInFat;			// Percentage of Calories from fat from total Cals
		
		// Scanner input instance
		Scanner kb = new Scanner(System.in);	
		
		// Asks for calorie input till positive
		do {
			System.out.print("Please enter a positive number of calories: ");	
			userCalories = kb.nextDouble();												
		} while (userCalories < 0);	
		
		// Asks for fat input till positive
		do {
			System.out.print("Please enter a positive number of grams of fat: ");	
			userFat = kb.nextDouble();												
		} while (userFat < 0);	
		
		// Calculating calories from the user fat
		caloriesFromFat = userFat * CALORIES_IN_FAT;
		
		// Determining if Calorie input is invalid IF CFromFat > CInput
		if (caloriesFromFat > userCalories) {
			System.out.println("INVALID INPUT: Calories from fat is greater than calories input");
		}
		
		// Calculating the percentage of calories from fat
		percentCaloriesInFat = caloriesFromFat / userCalories;
		
		System.out.println("Calorie percentage from fat is " + percentCaloriesInFat + "%");
		
		if (percentCaloriesInFat < LOW_FAT_CAL_PERCENT) {
			System.out.println("This is low in fat!");
		}
		
		kb.close();
	}

}
