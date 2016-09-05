import java.util.Scanner;
import java.util.Arrays;

public class UserArray {

  public static void main(String[] args) {

    // New keyboard input instance
    Scanner kb = new Scanner(System.in);

    // Number of INTs
    System.out.print("Enter the number of Integers: ");
    final int NUM_ITEMS = kb.nextInt();

    // Array of input INTs
    int[] numbers = new int[NUM_ITEMS];
    double totalSum = 0.00;

    // Looping through user input
    for (int i = 0; i < NUM_ITEMS; i++) {
      //retrieve num from user
      int iterNum = retrieveNum(kb);
      // Adding number to array
      numbers[i] = iterNum;
      // Adding number to totalSum
      totalSum += iterNum;
    }

    Arrays.sort(numbers);

    // Final position in sorted array
    System.out.println("    The largest number is " + numbers[NUM_ITEMS - 1]);
    // First position in sorted array
    System.out.println("   The smallest number is " + numbers[0]);
    // The average
    double arrayAvg = totalSum/NUM_ITEMS;
    System.out.println("The average of numbers is " + arrayAvg);

  }

  static int retrieveNum(Scanner kb) {
    // Setup user input
    System.out.print("Please enter an Integer: ");
    int iterNum = kb.nextInt();

    return iterNum;
  }

}
