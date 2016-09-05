import java.io.*;
import java.util.Scanner;

public class UserArrayFromFile {

  public static void main(String[] args) throws IOException{

    Scanner kb = new Scanner(System.in);

    File numbers = new File("numbers.txt");
    while (!numbers.exists()) {
      System.out.println("ERROR: 'numbers.txt' File Not Found");
      System.out.print("File location: ./");
      numbers = new File(kb.next());
    }

    kb.close();

    Scanner fileIn = new Scanner(numbers);

    int numNums = 0;
    Double totalSum = 0.00;
    int largest = 0;
    int smallest = 0;
    Boolean firstIter = true;

    // Looping through user input
    while (fileIn.hasNext()) {

      // takes next number
      int iterNum = fileIn.nextInt();
      // running totalSum
      totalSum += iterNum;
      // running count
      numNums ++;

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
    double arrayAvg = totalSum/numNums;
    System.out.println("The average of numbers is " + arrayAvg);

  }

}
