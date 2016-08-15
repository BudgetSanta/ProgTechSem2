import java.util.Scanner;

public class RightTriangle {

  public static void main(String[] args) {

    // Variables
    double base;                      // Side A of the triangle
    double perp;                      // Side B of the triangle
    double hypo;                      // Side C of the triangle
    boolean isRightAngle = false;     // Right Angle Triangle Check

    // New keyboard input instance
    Scanner kb = new Scanner(System.in);

    // Ask for positive triangle side A
    do {
      System.out.print("Enter positive number for triangle side A: ");
      base = kb.nextDouble();
    } while (base < 0.0);

    // Ask for positive triangle side B
    do {
      System.out.print("Enter positive number for triangle side B: ");
      perp = kb.nextDouble();
    } while (base < 0.0);

    // Ask for positive triangle side C
    do {
      System.out.print("Enter positive number for triangle side C: ");
      hypo = kb.nextDouble();
    } while (base < 0.0);

    // Is triangle right angle?
    if ( ((base*base) + (perp*perp)) == (hypo*hypo))  {
      isRightAngle = true;
    }

    // Output for user
    System.out.println("With Side A: " + base + ", Side B: " + perp + " and Side C: " + hypo);
    if (isRightAngle) {
      System.out.println("This is a Right Angled Triangle!");
    }
    else {
      System.out.println("This is NOT a Right Angled Triangle");
    }

    kb.close();
  }

}
