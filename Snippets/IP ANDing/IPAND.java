import java.util.Scanner;

public class IPAND {

  public static void main(String[] args) {

    int[] andIP = new int[32];
    int[] ipAdd = new int[32];
    int[] sbMask = new int[32];
    Scanner kb = new Scanner(System.in);

    ipAdd = createAddArray(kb);
    sbMask = createAddArray(kb);

    for (int i = 0; i < 32; i++) {
      if (ipAdd[i] == 1 && sbMask[i] == 1) {
        andIP[i] = 1;
      }
      else {
        andIP[i] = 0;
      }
    }

    System.out.println("AND IP Address is: ");
    System.out.println(ipAdd);
    System.out.println(sbMask);
    System.out.println(andIP);

    kb.close();
  }

  static int[] createAddArray(Scanner kb) {
    int[] tempArray = new int[32];
    for (int i = 0; i < 32; i++) {
      System.out.print("Digit " + i + ": ");
      tempArray[i] = kb.nextInt();
    }
    return tempArray;
  }

}
