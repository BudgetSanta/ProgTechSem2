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
    int menuChoice;

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
      int iterCompRollTTL = iterCompRollOne + iterCompRollTwo;

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
      System.out.println("        -- ROUND -- ");
      System.out.println("       Roll 1: " + iterUserRollOne);
      System.out.println("       Roll 2: " + iterUserRollTwo);
      System.out.println("        Total: " + iterUserRollTTL);
      System.out.println("  Grand Total: " + userRunTTL);


      // Setup to exit if comp or user over 21
      menuChoice = 1;
      Scanner kb = new Scanner(System.in);

      // Roll Again Check
      // While neither over, get new choice

      if (!userOver21 && !compOver21) {
        do {
          System.out.print("Enter 1 for 'exit' or 2 for 'roll': ");
          menuChoice = kb.nextInt();
        } while (menuChoice != 2 && menuChoice != 1);
      }

    } while (menuChoice == 2);

    // userWinner = greater score and not over 21 or lesser score and comp over 21 and user under 21
    Boolean userWinner = (((userRunTTL > compRunTTL) && !userOver21) || ((userRunTTL < compRunTTL) && compOver21 && !userOver21));
    // compWinner = greater score and not over 21 or lesser score and user over 21 and comp under 21
    Boolean compWinner = (((compRunTTL > userRunTTL) && !compOver21) || ((compRunTTL < userRunTTL) && userOver21 && !compOver21));

    // if they tie, and whether they are under 21
    Boolean bothTie = false;
    if (userRunTTL == compRunTTL) {
        bothTie = true && !userOver21;
    }

    if (bothTie) {
      // BOTH WIN
      System.out.println("TIE with " + userRunTTL);
    }
    else {
      // ONE WINNER
      if (userWinner) {
        // USER WINNER
        System.out.println("User wins with " + userRunTTL + " over " + compRunTTL);
      }
      else if (compWinner) {
        // COMP WINNER
        System.out.println("Computer wins with " + compRunTTL + " over " + userRunTTL);
      }
      else {
        System.out.println("Both lose with scores over 21 :(");
      }
    }

  }

}
