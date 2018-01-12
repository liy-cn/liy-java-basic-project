package domain;

import domain.event.EventStatusMgr;
import domain.event.impl.SubmitOrderEvent;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by liyue on 2018/1/12
 */
public class Order {
  private CustomerContact customerContact;
  private UUID id;
  private Date createdDate;

  private List<OrderItem> orderItems;

  public Order(CustomerContact customerContact, Date createdDate, List<OrderItem> orderItems) {
    this.id = UUID.randomUUID();
    this.customerContact = customerContact;
    this.createdDate = createdDate;
    this.orderItems = orderItems;

    EventStatusMgr.getInstance().push(id,new SubmitOrderEvent());

  }

  public CustomerContact getCustomerContact() {
    return customerContact;
  }

  public UUID getId() {
    return id;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }
}
