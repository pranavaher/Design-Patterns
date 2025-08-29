public class Main {
  public static void main(String[] args) {
    Image img1 = new ProxyImage("Pranav.jpg");
    Image img2 = new ProxyImage("Pranav.hevc");

    img1.display();
    img2.display();
  }
}
