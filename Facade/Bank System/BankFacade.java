// Facade

public class BankFacade {
  private AccountService accountService;
  private LoanService loanService;
  private NotificationService notificationService;
  private PaymentService paymentService;
  
  BankFacade(AccountService accountService) {
    this.accountService = accountService;
    this.paymentService = new PaymentService();
    this.loanService = new LoanService();
    this.notificationService = new NotificationService();
  }

  public void withdrawMoney(String accNo, double amount) {
    if (accountService.verifyAccount(accNo)) {
      boolean success = paymentService.transfer(accountService, amount, true);
      if (success) {
        notificationService.sendNotification("₹" + amount + " withdrawn successfully.");
      } else {
        notificationService.sendNotification("❌ Insufficient balance for withdrawal.");
      }
    } else {
      notificationService.sendNotification("❌ Account verification failed.");
    }
  }

  public void depositMoney(String accNo, double amount) {
    if (accountService.verifyAccount(accNo)) {
      paymentService.transfer(accountService, amount, false);
      notificationService.sendNotification("₹" + amount + " deposited successfully.");
    } else {
      notificationService.sendNotification("❌ Account verification failed.");
    }
  }

  public void applyLoan(String accNo, double amount) {
    if (accountService.verifyAccount(accNo)) {
      loanService.applyLoan(accNo, amount);
      notificationService.sendNotification("Loan request processed.");
    } else {
      notificationService.sendNotification("❌ Account verification failed.");
    }
  }

  public void checkBalance(String accNo) {
    if (accountService.verifyAccount(accNo)) {
      notificationService.sendNotification("Available Balance: ₹" + accountService.getBalance());
    } else {
      notificationService.sendNotification("❌ Account verification failed.");
    }
  }
}

