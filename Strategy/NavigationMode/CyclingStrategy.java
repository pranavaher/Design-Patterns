// Strategy

public class CyclingStrategy implements IRouteStrategy {
  @Override
  public void processRoute(String source, String destination) {
    System.out.println("Cycling Mode: " + source + " ---> " + destination);
  }
}

