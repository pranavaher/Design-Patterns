public class Main {
  public static void main(String[] args) {
    XmlDataProvider xmlDataProvider = new XmlDataProvider();
    
    // Adapter to convert XML to JSON
    XmlToJsonAdapter adapter = new XmlToJsonAdapter(xmlDataProvider);

    // Client works only with JSON
    adapter.processXmlData();   
  }
}

