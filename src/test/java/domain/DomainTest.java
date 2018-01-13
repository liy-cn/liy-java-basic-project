package domain;

import domain.event.EventStatusEnum;
import domain.event.EventStatusMgr;
import domain.repository.OrderRepository;
import domain.repository.impl.OrderRepositoryImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

/**
 * Created by liyue on 2018/1/12
 */
public class DomainTest {

  @Test
  public void created_order_test() {
    Order order = new Order(new CustomerContact("liyue", "address"), new Date(), Arrays.asList(new OrderItem(1, new ProductSnapshot("sku123", 100.00))));
    OrderRepository orderRepository = new OrderRepositoryImpl();
    UUID orderId = orderRepository.add(order);
    Order findOneOrder = orderRepository.findOneById(orderId);
    Assert.assertEquals(order, findOneOrder);
  }


  @Test
  public void order_status_change_to_submit_test() {
    Order order = new Order(new CustomerContact("liyue", "address"), new Date(), Arrays.asList(new OrderItem(1, new ProductSnapshot("sku123", 100.00))));
    String orderStatus = EventStatusMgr.getInstance().judgeState(order.getId());
    Assert.assertEquals(EventStatusEnum.SUBMITED.getTitle(), orderStatus);
  }

  @Test
  public void order_status_change_to_created_test() {
    Order order = new Order(new CustomerContact("liyue", "address"), new Date(), Arrays.asList(new OrderItem(1, new ProductSnapshot("sku123", 100.00))));
    OrderRepository orderRepository = new OrderRepositoryImpl();
    orderRepository.add(order);
    String orderStatus = EventStatusMgr.getInstance().judgeState(order.getId());
    Assert.assertEquals(EventStatusEnum.CREATED.getTitle(), orderStatus);
  }

}
