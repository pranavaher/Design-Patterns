// Subsystem Classes

public class AccountService {
  private String accountNumber;
  private double balance;

  public AccountService(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public boolean verifyAccount(String accountNumber) {
    return this.accountNumber.equals(accountNumber);
  }
  public double getBalance() {
    return balance;
  }

  public void debit(double amount) {
    balance -= amount;
  }

  public void credit(double amount) {
    balance += amount;
  }
}

