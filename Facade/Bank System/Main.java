public class Main {
  public static void main(String[] args) {
    // Create account with initial balance
    AccountService myAccount = new AccountService("ACC123", 5000);

    // Create Facade
    BankFacade bank = new BankFacade(myAccount);

    // Client interactions (simplified via Facade)
    bank.checkBalance("ACC123");
    bank.withdrawMoney("ACC123", 2000);
    bank.checkBalance("ACC123");
    bank.depositMoney("ACC123", 1500);
    bank.checkBalance("ACC123");
    bank.applyLoan("ACC123", 10000);
    bank.checkBalance("ACC123");
  }
}
