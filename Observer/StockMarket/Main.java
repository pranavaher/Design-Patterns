public class Main {
  public static void main(String[] args) {
    StockData bse = new StockData();

    IObserver zerodha = new MobileDisplay();
    IObserver email = new EmailAlert();
    
    bse.register(zerodha);
    bse.register(email);

    bse.setPrice(234.00);

    bse.printObservers();
  }
}
