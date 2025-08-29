public class ProxyImage implements Image {
  private String filename;
  private RealImage realImage;

  public ProxyImage(String filename) {
    this.filename = filename;
  }

  @Override
  public void display() {
    System.out.println("Using Proxy...");
    if (realImage == null) {
      realImage = new RealImage(filename); // Load only when needed
    }
    realImage.display();
  }
}
