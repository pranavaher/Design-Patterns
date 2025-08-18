// Adapter (Class that implements target interface and internally uses the adaptee)

// import org.json.JSONObject;
// import org.json.XML;

public class XmlToJsonAdapter implements DataProcessor {
  private XmlDataProvider xmlDataProvider;

  public XmlToJsonAdapter(XmlDataProvider xmlDataProvider) {
    this.xmlDataProvider = xmlDataProvider; 
  }

  @Override
  public void processData(String jsonData) {
    System.out.println("Processing JSON data: " + jsonData);
  }

  public void processXmlData() {  
    String xml = xmlDataProvider.getXmlData();
    
    // User XML to JSON converter
    // JSONObject jsonObject = XML.toJSONObject(xml);
    // processData(jsonObject.toString());

    String jsonString = "{ 'user': { 'id': '101', 'name': 'XML USER' } }";

    processData(jsonString);
  }
}

