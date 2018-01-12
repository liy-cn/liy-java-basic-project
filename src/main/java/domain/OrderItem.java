package domain;

/**
 * Created by liyue on 2018/1/12
 */
public class OrderItem {
  private int amount;
  private ProductSnapshot productSnapshot;

  public OrderItem(int amount, ProductSnapshot productSnapshot) {
    this.amount = amount;
    this.productSnapshot = productSnapshot;
  }
}
