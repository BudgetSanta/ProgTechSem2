import java.util.Scanner;

public class TwentyOne {

  public static void main(String[] args) {

    //TODO:0 Method, return random roll 1-6 inclusive
    //TODO:1 Main method, while (!= exit key) Do everything except show results
    //TODO:2 userIterationTtl, compIterationTtl
    //TODO:3

    // VARS
    int userRunTTL = 0;
    int compRunTTL = 0;
    Boolean userOver21 = false;
    Boolean compOver21 = false;

    // INDIVIDUAL DIE
    Die userDie = new Die(6);
    Die compDie = new Die(6);

    do {

      // Rolls, includes forced initial roll
      userDie.roll();
      int iterUserRollOne = userDie.getValue();
      userDie.roll();
      int iterUserRollTwo = userDie.getValue();
      int iterUserRollTTL = iterUserRollOne + iterUserRollTwo;

      compDie.roll();
      int iterCompRollOne = compDie.getValue();
      compDie.roll();
      int iterCompRollTwo = compDie.getValue();
      int iterCompRollTTL = iterCompRollOne + iterUserRollTwo;

      // VAR UPDATES
      userRunTTL += iterUserRollTTL;
      compRunTTL += iterCompRollTTL;

      // Game Over Check
      if (userRunTTL > 21) {
        userOver21 = true;
      }
      if (compRunTTL > 21) {
        compOver21 = true;
      }

      // ITERATION OUTPUT
      System.out.println("");
      System.out.println("    -- ROUND -- ");
      System.out.println("   Roll 1: " + iterUserRollOne);
      System.out.println("   Roll 2: " + iterUserRollTwo);
      System.out.println("    Total: " + iterCompRollTTL);
      System.out.println("GRAND TTL: " + userRunTTL);

      String menuChoice = "exit";
      Scanner kb = new Scanner(System.in);

      // Roll Again Check
      // While neither over, get new choice
      if (!userOver21 && !compOver21) {
        System.out.print("Enter 'exit' or 'roll': ");
        do {
          menuChoice = kb.next();
        } while (menuChoice != "exit" || menuChoice != "roll");
      }

    } while (menuChoice == "roll");

    Boolean userWinner = iterUserRollTTL > iterCompRollTTL;
    Boolean bothTie = iterUserRollTTL == iterUserRollTTL;

    if (bothTie) {
      // BOTH WIN
      System.out.println("TIE with " + iterUserRollTTL);
    }
    else {
      // ONE WINNER
      if (userWinner) {
        // USER WINNER
        System.out.println("User wins with " + iterUserRollTTL + " over " + iterCompRollTTL);
      }
      else {
        // COMP WINNER
        System.out.println("User wins with " + iterCompRollTTL + " over " + iterUserRollTTL);
      }
    }

  }

}
