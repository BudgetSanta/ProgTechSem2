import java.io.*;
import java.util.Scanner;

public class LineNum {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    File userFile = new File("default"); // not created, needed for initialisation

    // Retrieve filename from user until exists
    do {
      System.out.print("Please enter an existing file's name: ");
      String fileNameAndDir = kb.next();
      userFile = new File(fileNameAndDir);
    } while (!userFile.exists());
    // No more user input needed
    kb.close();

    try (Scanner readUserFile = new Scanner(userFile);) {
      int numberLineCounter = 1;

      if (!readUserFile.hasNext()) {
        System.out.println("No lines to read!");
      }

      while (readUserFile.hasNext()) {
        System.out.println(numberLineCounter + ": " + readUserFile.nextLine());
        numberLineCounter += 1;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
