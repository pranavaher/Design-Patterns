// Strategy

public class PublicTransportStrategy implements IRouteStrategy {
  @Override
  public void processRoute(String source, String destination) {
    System.out.println("Public Transport Mode: " + source + " ---> " + destination);
  }
}

