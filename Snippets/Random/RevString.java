import java.util.Scanner;

public class RevString {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    Boolean exit = false;
    do {
      System.out.print("Enter a string. 'exit' to exit: ");
      String text = kb.next();
      String compareStr = "exit";
      // DOESNT WORK
      if (text == compareStr) {
        exit = true;
        System.out.println(exit);
      }
      else {
        reverse(text);
        System.out.println(exit);
      }
    } while (!exit);

  }

  static String reverse(String input) {

    // get string length
    // input char[stringLength]
    // output char[stringLength]
    // loop through String input, each char to char[] input
    // reverse loop through input char[]
    // output char[i] = reverse loop char

    String output = "REVERSE ("+input+")";
    return output;

  }

}
