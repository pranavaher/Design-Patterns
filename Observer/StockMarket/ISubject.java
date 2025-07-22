public interface ISubject {
  void register(IObserver observer);
  void remove(IObserver observer);
  void notifyObservers();
}

