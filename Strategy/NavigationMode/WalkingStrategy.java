// Strategy

public class WalkingStrategy implements IRouteStrategy {
  @Override
  public void processRoute(String source, String destination) {
    System.out.println("Walking Mode: " + source + " ---> " + destination);
  }
}

