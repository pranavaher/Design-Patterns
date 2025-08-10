// Strategy

public class DrivingStrategy implements IRouteStrategy {
  @Override
  public void processRoute(String source, String destination) {
    System.out.println("Driving Mode: " + source + " ---> " + destination);
  }
}

