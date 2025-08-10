// Context

public class ModeSelector {
  private IRouteStrategy strategy;

  public ModeSelector(IRouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(IRouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void processRoute(String source, String destination) {
    strategy.processRoute(source, destination);
  }
}

