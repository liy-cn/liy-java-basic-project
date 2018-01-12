package domain.event.impl;

import domain.event.IEvent;

/**
 * Created by liyue on 2018/1/12
 */
public class EventImpl implements IEvent{
  private String status;
  public EventImpl(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
}
