import java.io.*;
import java.util.Scanner;

public class UserArrayFromFile {

  public static void main(String[] args) throws IOException{
    // Picks the file name
    File numbers = identifyFile();

    Scanner fileIn = new Scanner(numbers);    // Input file with numbers
    // Using variables to track attributes as file length could be unknown
    int countOfNums = 0;                    // How many numbers have been passed in from file
    Double totalSum = 0.00;                 // The total sum of numbers passed in, for the average
    int largest = 0;                        // Holds the largest number passed in from file
    int smallest = 0;                       // Holds the smallest number passed in from the file
    Boolean firstIter = true;               // Boolean that ensures largest and smallest are assigned not 0 values, compilation error if not assigned 0 here tho

    // Looping through file input
    while (fileIn.hasNext()) {

      // takes next number
      int iterNum = fileIn.nextInt();

      // UPDATE VARIABLES
      totalSum += iterNum;                  // Adding this iteration's number to total
      countOfNums ++;                       // adding one to the count of numbers

      if (!firstIter) {
        // running largest number
        if (iterNum > largest) {
          largest = iterNum;
        }
        // running smallest number
        if (iterNum < smallest) {
          smallest = iterNum;
        }
      }
      else {
        smallest = iterNum;
        largest = iterNum;
        firstIter = false;
      }
    }

    fileIn.close();

    // Largest
    System.out.println("    The largest number is " + largest);
    // Smallest
    System.out.println("   The smallest number is " + smallest);
    // The average
    double arrayAvg = totalSum/countOfNums;
    System.out.println("The average of numbers is " + arrayAvg);

  }

  // Assigns file name to default unless not found, then asks user
  static File identifyFile() {
    // keyboard input instance only used for file identification
    Scanner kb = new Scanner(System.in);

    File numbers = new File("numbers.txt");
    // Asks user for new file is no file found to avoid FileNotFound Error
    while (!numbers.exists()) {
      System.out.println("ERROR: 'numbers.txt' File Not Found");
      System.out.print("File location: ./");
      numbers = new File(kb.next());
    }

    kb.close();
    return numbers;
  }

  // static int[] boundaryCheck() {
  //   // IFS
  //   // return both smallest and largest? seperate methods?
  //   return int[] output = new int[var1, var2];
  // }

}
