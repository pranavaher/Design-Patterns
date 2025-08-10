public class Main {
  public static void main(String[] args) throws InterruptedException {
    // Define Strategies
    IRouteStrategy cycling = new CyclingStrategy();
    IRouteStrategy driving = new DrivingStrategy();
    IRouteStrategy walking = new WalkingStrategy();
    IRouteStrategy publicTransport = new PublicTransportStrategy();

    // Define Context
    ModeSelector mode = new ModeSelector(cycling);
    mode.processRoute("Mumbai", "Pune");

    mode.setStrategy(driving);
    mode.processRoute("dehradun", "Mussoorie");
    
    mode.setStrategy(walking);
    mode.processRoute("Rishikesh", "Tapovan");
    
    mode.setStrategy(publicTransport);
    mode.processRoute("Delhi Airport", "Rajiv Chowk");
  }
}

