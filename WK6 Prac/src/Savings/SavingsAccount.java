public class SavingsAccount {

  Double annualInterestRate;
  Double balance;
  double monthlyInterestRate;

  // Existing New Constructor
  public SavingsAccount (Double annualRate, Double accountBalance) {

    annualInterestRate = annualRate;
    balance = accountBalance;

  }

  // New Account Constructor
  public SavingsAccount () {

    annualInterestRate = annualInterestRate;
    balance = balance;

  }

  // MUTATORS

  // Blance setters
  // -- Withdrawal
  public void withdraw(Double amount) {
    balance -= amount;
  }

  // -- Deposit
  public void deposit(Double amount) {
    balance += amount;
  }

  // -- Monthly Interest deposit
  public void monthlyInterestDeposit() {
    balance += (annualInterestRate/12)*balance;
  }

  // ACCESSORS

  // Balance getter
  public Double getBalance() {
    return balance;
  }

  // Interest rate getter
  public Double getInterestRate() {
    return annualInterestRate;
  }

  // Monthly Interest
  public Double getMonthlyInterest() {
    return balance*(annualInterestRate/12);
  }
}
