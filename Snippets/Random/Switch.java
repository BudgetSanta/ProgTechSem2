import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    System.out.print("Num:");
    switch (kb.nextInt()) {
      case 1:
        System.out.println("You selected 1.");
        break;
      case 2:
      case 3:
        System.out.println("You selected 2 or 3");
        break;
      case 4:
        System.out.println("You selected 4");
        break;
      default:
        System.out.println("select again please.");

    }
  }
}
