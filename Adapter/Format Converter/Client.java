//  Client

public class Client {
  private DataProcessor processor;

  public Client(DataProcessor processor) {
    this.processor = processor;
  }

  public void sendData(String jsonData) {
    processor.processData(jsonData);
  }
}

