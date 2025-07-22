import java.util.ArrayList;
import java.util.List;

public class StockData implements ISubject {

  private List<IObserver> observers;
  private double price;

  public StockData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void register(IObserver observer) {
    if(!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  @Override
  public void remove(IObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for(IObserver observer : observers) {
      observer.update(price);
    }
  }

  public void setPrice(double price) {
    this.price = price;
    notifyObservers();
  }

  public void printObservers() {
    System.out.println(observers.toString());
  }
}

