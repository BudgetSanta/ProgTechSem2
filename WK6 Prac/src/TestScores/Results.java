import java.util.Scanner;

public class Results {

  public static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {

    TestScores Jared = new TestScores();

    Jared.scoreOne = getDoublePrompt("Score One: ");
    Jared.scoreTwo = getDoublePrompt("Score Two: ");
    Jared.scoreThree = getDoublePrompt("Score Three: ");

    printLine("" + Jared.getAvg());

  }

  // Shorter Double input
  public static Double getDoublePrompt(String prompt) {
    System.out.print(prompt);
    return kb.nextDouble();
  }

  // Shorter println
  public static void printLine(String message){
    System.out.println(message);
  }

}
