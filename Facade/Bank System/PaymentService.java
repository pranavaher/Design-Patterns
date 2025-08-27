// Subsystem Classes

public class PaymentService {
  public boolean transfer(AccountService account, double amount, boolean isDebit) {
    if (isDebit) {
      if (account.getBalance() >= amount) {
        account.debit(amount);
        return true;
      }
      return false;
    } else {
      account.credit(amount);
      return true;
    }
  }
}

