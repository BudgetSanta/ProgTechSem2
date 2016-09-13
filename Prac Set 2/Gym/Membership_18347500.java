//  Student ID: 18347500
//  Name: Jared Steiner
//  Campus: Parramatta
//  Tutor Name: Jordan Collier
//  Class Day: Tuesday
//  Class Time: 9am

import java.io.*;
import java.util.Scanner;

public class Membership_18347500 {

  public static void main(String[] args) throws IOException{

    // VARIABLES
    // Better to keep seperate rather than two arrays which are just indexes
    int numGymPPL = 0;          // Number of people with Gym type
    int numCirPPL = 0;          // Number of people with Circuit type
    float ttlGymPay = 0;        // Total membership costs of gym types
    float ttlCirPay = 0;        // Total membership costs of circuit types

    File memberships = membershipFile();              // Membership file to read in from
    PrintWriter gymPW = gymFile();                    // Gym PrintWriter to output to
    PrintWriter circuitPW = circuitFile();            // Circuit PrintWriter to output to

    Scanner readFile = new Scanner(memberships);    // Scaner to read through memberships
    // While there is a new file, split it and look for type
    while (readFile.hasNext()) {
      String iterLineText = readFile.nextLine();
      String[] parts = iterLineText.split(" ");

      // Attributes parsed in object creation to keep line count down
      //    "$: error: incompatible types: String cannot be converted to int"
      //    Due to above error, parts[2/4/5] are parsed not cast. Error only appears when casting (int) or (float)
      Member iterationMember = new Member(
        parts[0],                       // First Name
        parts[1],                       // Last Name
        Integer.parseInt(parts[2]),     // Age
        parts[3],                       // Type (Gym/Circuit)
        Float.parseFloat(parts[4]),     // Weight
        Float.parseFloat(parts[5])      // Fee
      );

      // Member Object created, write to TYPE.txt file with switch case
      // The following adds to variables for report generation
      // Not its own method because returning 4 variables and assigning again (or just making them public) is unecessary
      switch (iterationMember.getType()) {

        // GYM CASE
        case "gym":
          numGymPPL ++;                                 // Adding to count of Gym people
          ttlGymPay += iterationMember.getFee();        // Adding fee to running ttl of gym fees
          // gym.txt << FIRSTNAME LASTNAME FEE
          //gymPW.println(iterationMember.getFirstName() + " " + iterationMember.getLastName() + " " + iterationMember.getFee());
          writeOut(gymPW, iterationMember);
          break;

        // CIRCUIT CASE
        case "circuit":
          numCirPPL ++;                                 // Adding to coun of circuit people
          ttlCirPay += iterationMember.getFee();        // Adding fee to running ttl of circuit fees
          // circuit.txt << FIRSTNAME LASTNAME FEE
          //circuitPW.println(iterationMember.getFirstName() + " " + iterationMember.getLastName() + " " + iterationMember.getFee());
          writeOut(circuitPW, iterationMember);
          break;
      }
    }

    // Close files
    gymPW.close();
    circuitPW.close();

    printReport(numGymPPL, ttlGymPay, numCirPPL, ttlCirPay);

  }

  static File membershipFile() {
    // Keyboard instance
    Scanner kb = new Scanner(System.in);      // Used for file location if necessary

    // memberships file located with default location or user input
    File memberships = new File("memberships.txt");
    while (!memberships.exists()) {
      System.out.println("ERROR: 'memberships.txt' File Not Found");
      System.out.print("File location: ./");
      memberships = new File(kb.next());
    }

    // No more input from user needed
    kb.close();

    return memberships;
  }

  // ## GYM AND CIRCUIT FILES ARE OVERWRITTEN ##

  // Creates the Gym Print Writer
  static PrintWriter gymFile() throws IOException{
    // FILE CREATION
    File gymFile = new File("gym.txt");                           // Gym File Created
    PrintWriter gymOutFile = new PrintWriter(gymFile);            // Gym output PrintWriter created
    return gymOutFile;
  }

  // Creates the Circuit Print Writer
  static PrintWriter circuitFile() throws IOException{
    File circuitFile = new File("circuit.txt");                   // Circuit File Created
    PrintWriter circuitOutFile = new PrintWriter(circuitFile);    // Circuit ouput PrintWriter created
    return circuitOutFile;
  }

  static void writeOut(PrintWriter outputPW, Member member) {
    outputPW.println(member.getFirstName() + " " + member.getLastName() + " " + member.getFee());
  }

  static void printReport(int numGymPPL, float ttlGymPay, int numCirPPL, float ttlCirPay) {
    // FINAL REPORT

    System.out.println("            ##### REPORT ##### ");
    System.out.println("");
    System.out.println("    People with Gym Membership:  " + numGymPPL);
    System.out.println("        Average Membership fee: $" + ttlGymPay/numGymPPL);
    System.out.println("");
    System.out.println("People with Circuit Membership:  " + numCirPPL);
    System.out.println("        Average Membership fee: $" + ttlCirPay/numCirPPL);
  }

}
