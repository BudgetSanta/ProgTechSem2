//  Student ID: 18347500
//  Name: Jared Steiner
//  Campus: Parramatta
//  Tutor Name: Jordan Collier
//  Class Day: Tuesday
//  Class Time: 9am

import java.util.Scanner;

public class Conversion_18347500 {

  // New keyboard input instance
  public static Scanner kb = new Scanner(System.in);
  
  //SET VARS
  public static double KM_PER_M = 0.001;      // KM Conversion rate
  public static double INCH_PER_M = 39.37;    // INCH Conversion rate
  public static double FEET_PER_M = 3.281;    // FOOT Conversion rate

  public static void main(String[] args) {
    
    int menuSelection = 0;                          // Necessary for the while statements
    
    // ENTIRE MENU DO WHILE
    do {
      double iterationMetres = getDistance();       // gets Distance from user 
      
      // REPETITION OF ITERATION METRES MENU
      do {
        
        printMenu();                   // Prints menu options
        do {                           // validates 1 => INT => 5
          menuSelection = (int)userDoubleInput("Enter a menu choice between 1 and 5: ");
        } while (menuSelection < 1 || menuSelection > 5);

        // MENU SELECTION CONVERSION/RETRY/EXIT
        switch (menuSelection) {
          case 1: showKilometres(iterationMetres);  // IF KILOMETRES
                  break;
          case 2: showInches(iterationMetres);      // IF INCHES
                  break;
          case 3: showFeet(iterationMetres);        // IF FEET
                  break;
        }

      } while ( menuSelection < 4); // While conversion asked, repeat

    } while (menuSelection != 5);   // While new distance asked, repeat

  }

  static double userDoubleInput(String inputMessage) {
    System.out.print(inputMessage);
    return kb.nextDouble();
  }

  // Gets the metres distance from user
  static double getDistance() {
    double inputMetres;                 // Local metres variable for method
    do {
      inputMetres = userDoubleInput("Enter a distance in metres: ");
    } while (inputMetres < 0.0);

    return inputMetres;
  }

  public static void showKilometres(double metres) {
    double kilometres = metres*KM_PER_M;         // create KM conversion
    printLine(metres + " metres is " + kilometres + " kilometres.");
    printLine("");
  }

  public static void showInches(double metres) {
    double inches = metres*INCH_PER_M;           // create INCH conversion
    printLine(metres + " metres is " + inches + " inches.");
    printLine("");
  }

  public static void showFeet(double metres) {
    double feet = metres*FEET_PER_M;             // create FEET conversion
    printLine(metres + " metres is " + feet + " feet.");
    printLine("");
  }

  // Quicker println() statement
  static void printLine(String message) {
    System.out.println(message);
  }

  // Prints out menu options
  static void printMenu() {
    printLine("1. Convert to Kilometres");
    printLine("2. Convert to Inches");
    printLine("3. Convert to Feet");
    printLine("4. Enter new Distance");
    printLine("5. Quit the program");
    printLine("");
  }

}
