package domain.repository.impl;

import domain.Order;
import domain.event.EventStatusMgr;
import domain.event.impl.CreatedOrderEvent;
import domain.repository.OrderRepository;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by liyue on 2018/1/12
 */
public class OrderRepositoryImpl implements OrderRepository {

  private final HashMap<UUID, Order> orderMap;

  public OrderRepositoryImpl() {
    this.orderMap = new HashMap<UUID, Order>();
  }

  public UUID add(Order order) {
    this.orderMap.put(order.getId(),order);
    EventStatusMgr.getInstance().push(order.getId(),new CreatedOrderEvent());
    return order.getId();
  }

  public void update(Order order) {

  }

  public void delete(Order order) {

  }

  public Order findOneById(UUID orderId) {
    return this.orderMap.get(orderId);
  }
}
