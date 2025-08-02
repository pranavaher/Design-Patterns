// Order

import java.util.List;

public class OrderRequest {
  public String restaurant;
  public List<String> items;
  public boolean isPaymentValid;
  public String deliveryAddress;
  public String userId;

  public OrderRequest(String restaurant, List<String> items, boolean isPaymentValid, String deliveryAddress, String userId) {
    this.restaurant = restaurant;
    this.items = items;
    this.isPaymentValid = isPaymentValid;
    this.deliveryAddress = deliveryAddress;
    this.userId = userId;
  }
}

