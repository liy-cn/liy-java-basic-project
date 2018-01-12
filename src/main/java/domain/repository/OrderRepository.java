package domain.repository;

import domain.Order;

import java.util.UUID;

/**
 * Created by liyue on 2018/1/12
 */
public interface OrderRepository {
  public UUID add(Order order);
  public void update(Order order);
  public void delete(Order order);
  public Order findOneById(UUID orderId);
}
