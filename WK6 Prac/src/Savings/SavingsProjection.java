import java.util.Scanner;

public class SavingsProjection {

  public static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {

    SavingsAccount projection = new SavingsAccount();
    int numDeposits = 0;
    int numWithdrawals = 0;
    Double ttlInterestEarned = 0.0;

    // Annual Interest Rate Input
    System.out.print("Enter an Annual Interest Rate: (%)");
    projection.annualInterestRate = kb.nextDouble();

    // Startin balance input
    System.out.print("Enter a starting balance: $");
    projection.balance = kb.nextDouble();

    // Total months in the projection
    System.out.print("Enter months in projection: ");
    int months = kb.nextInt();

    // Loop: money deposited, money withdrawn, monthlyInterest
    for (int i = 0; i < months; i++) {

      // DEPOSIT
      System.out.print("Enter this months deposits: $");
      Double monthsDeposit = kb.nextDouble();
      if (monthsDeposit != 0) {
        projection.deposit(monthsDeposit);
        numDeposits += 1;
      }

      // WITHDRAWAL
      System.out.print("Enter this months withdrawals: $");
      Double monthsWithdrawals = kb.nextDouble();
      if (monthsWithdrawals != 0) {
        projection.withdraw(monthsWithdrawals);
        numWithdrawals += 1;
      }

      // This months interest going into the Account
      Double monthsInterest = projection.getMonthlyInterest();
      System.out.println("This months interest is $" + monthsInterest);
      if (monthsInterest != 0) {
        projection.deposit(monthsInterest);
        ttlInterestEarned += monthsInterest;
      }

      System.out.println("Running Total: $" + projection.getBalance());

      // END MONTH LOOP
    }

    System.out.println("          -- Projection Complete --");
    System.out.println("        Ending Balance: $" + projection.getBalance());
    System.out.println("   Total Deposits made: " + numDeposits);
    System.out.println("Total withdrawals made: " + numWithdrawals);
    System.out.println(" Total interest earned: $" + ttlInterestEarned);

  }

}
