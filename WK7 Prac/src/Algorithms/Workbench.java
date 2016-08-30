import java.io.*;
import java.util.Scanner;

public class Workbench {

  public static void main(String[] args) throws IOException{


    menu();

  }

  // Create file with 1 to 100 on seperate lines, exception for last println
  static void oneToHundredFile(File fileNameAndDir) throws IOException {
    if (!fileNameAndDir.exists()) {
      // new PrintWriter instance
      PrintWriter outFile = new PrintWriter(fileNameAndDir);

      // Exception for last one and NOT println,just print
      for (int i = 1; i <= 100; i++) {
        if (i != 100) {
          outFile.println(i);
        }
        else {
          outFile.print(i);
        }
      }
      outFile.close();
    }
    else {
      System.out.println("");
      System.out.println(" /// ");
      System.out.println("ERROR: File already exists, please delete file or assign a different filename with menu selection '4'!");
      System.out.println(" /// ");
      System.out.println("");
    }
  }

  // reads lines of passed in file
  static void printFileLines(File fileNameAndDir) {
    if (fileNameAndDir.exists()) {
      // new Scanner instance
      // FILE NOT FOUND EXCEPTION CATCH
      try (Scanner inFile = new Scanner(fileNameAndDir);) {
        while (inFile.hasNext()) {
          String iterLine = inFile.nextLine();
          System.out.println(iterLine);
        }
        inFile.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }

    }
    else {
      System.out.println(" /// ");
      System.out.println("ERROR: File doesn't exist yet, please create file and contents with menu selection '1'!");
      System.out.println(" /// ");
    }
  }
  // IF EXISTS, ADD LINES TO SUM, ELSE, FILE NOT FOUND EXCEPTION CATCH
  static void sumFileLines(File fileNameAndDir) {
    int runningTotal = 0;

    if (fileNameAndDir.exists()) {
      // new Scanner Instance
      try ( Scanner inFile = new Scanner(fileNameAndDir); ) {
        while (inFile.hasNext()) {
          int iterInt = inFile.nextInt();
          runningTotal += iterInt;
        }
        System.out.println("Total sum of numbers in " + fileNameAndDir + " is >> " + runningTotal);
        inFile.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }
    else {
      System.out.println(" /// ");
      System.out.println("ERROR: File doesn't exist yet, please create file and contents with menu selection '1'!");
      System.out.println(" /// ");
    }
  }

  static void menu() {

    // new keyboard instance
    Scanner kb = new Scanner(System.in);

    // Default file
    Boolean noFileSelected = true;
    File userFile = new File("default.txt");  // needs initialisation, default.txt not created
    int menuSelection = 0;

    do {
      // START OF MENU
      System.out.println("-- FILE MANIPULATION MENU --");

      // First time, allocate filename
      if (noFileSelected) {
        userFile = newFileName(kb);
        noFileSelected = false;
      }

      // OUTPUT MENU and USER SELECTION
      printMenu(userFile);
      menuSelection = kb.nextInt();

      switch (menuSelection) {
        case 1:
          try {
            oneToHundredFile(userFile);     // CREATES 1 to 100
          } catch (IOException e) {
            e.printStackTrace();
          }
          break;
        case 2:
          printFileLines(userFile);       // PRINTS FILE CONTENTS
          break;
        case 3:
          sumFileLines(userFile);         // SUUMS FILE CONTENTS
          break;
        case 4:
          userFile = newFileName(kb);       // ASSIGNS NEW FILE NAME
          break;
        case 5:
          // Program Exit
          System.out.println("Thank you and goodbye!");
          break;
        default:
          // Invalid Input
          System.out.println("ERROR: Invalid selection. Please enter a choice from the menu");
      }
    } while ( menuSelection != 5 );// choice outside of menu options)

    kb.close();
  }

  static File newFileName(Scanner kb) {
    System.out.println("Please enter a file name.");
    System.out.println("# WARNING: If file exists, it will NOT be overwritten! #");
    System.out.println("# WARNING: If file doesn't exist, it will be created!  #");
    System.out.print(">>>> ./");
    String iterFileName = kb.next();
    File fileObject = new File(iterFileName);
    return fileObject;
  }

  // // Boolean isFile check
  // static Boolean isFile(File fileNameAndDir) throws IOException{
  //
  //   return (fileNameAndDir.exists() && !fileNameAndDir.isDirectory());
  //
  // }

  static void printMenu(File userFile) {
    System.out.println("");
    System.out.println(" // MENU //");
    System.out.println("CURRENT FILE >>>> ./" + userFile);
    System.out.println("1. Write 1-100");
    System.out.println("2. Print numbers");
    System.out.println("3. Sum numbers");
    System.out.println("4. Change active file");
    System.out.println("5. Exit program");
    System.out.print("Menu input :: ");
  }

}
