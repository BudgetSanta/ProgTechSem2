import java.io.*;
import java.util.Scanner;

public class ReportGen {

  public static void main(String[] args) throws IOException{

    // FILE CREATION
    File gymFile = new File("gym.txt");
    PrintWriter gymOutFile = new PrintWriter(gymFile);
    File circuitFile = new File("circuit.txt");
    PrintWriter circuitOutFile = new PrintWriter(circuitFile);

    // VARIABLES
    int numGymPPL = 0;
    int numCirPPL = 0;
    float ttlGymPay = 0;
    float ttlCirPay = 0;

    // Keyboard instance
    Scanner kb = new Scanner(System.in);

    File memberships = new File("memberships.txt");
    while (!memberships.exists()) {
      System.out.println("ERROR: 'memberships.txt' File Not Found");
      System.out.print("File location: ./");
      memberships = new File(kb.next());
    }
    // No more input from user needed
    kb.close();

    Scanner readFile = new Scanner(memberships);
    // DONE:10 While hasNext(), loop through members from input list
    while (readFile.hasNext()) {
      String iterLineText = readFile.nextLine();
      String[] parts = iterLineText.split(" ");

      // PARTS 0:Fname, 1:Lname, 2:Age, 3:Type, 4:Weight, 5:Fee
      // Attributes cast in object creation cause im lazy
      Member iterationMember = new Member(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Float.parseFloat(parts[4]), Float.parseFloat(parts[5]));

      // DONE:20 switch case with .getType()
      switch (iterationMember.getType()) {

        // GYM CASE
        case "gym":
          // DONE:21 Case gym: numPPL++, ttlPay++
          numGymPPL ++;
          ttlGymPay += iterationMember.getFee();
          // DONE:23 write fName, lName, fee to GYM
          gymOutFile.println(iterationMember.getFirstName() + " " + iterationMember.getLastName() + " " + iterationMember.getFee());
          break;

        // CIRCUIT CASE
        case "circuit":
          // DONE:22 Case ciruit: numPPL++, ttlPay++
          numCirPPL ++;
          ttlCirPay += iterationMember.getFee();
          // DONE:23 write fName, lName, fee to CIRCUIT
          circuitOutFile.println(iterationMember.getFirstName() + " " + iterationMember.getLastName() + " " + iterationMember.getFee());
          break;
      }
    }

    // Close files
    gymOutFile.close();
    circuitOutFile.close();

    // FINAL REPORT

    System.out.println("            ##### REPORT ##### ");
    System.out.println("");
    System.out.println("    People with Gym Membership: " + numGymPPL);
    System.out.println("        Average Membership fee: $" + ttlGymPay/numGymPPL);
    System.out.println("");
    System.out.println("People with Circuit Membership: " + numCirPPL);
    System.out.println("        Average Membership fee: $" + ttlCirPay/numCirPPL);



  }

}
