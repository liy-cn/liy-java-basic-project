package domain.event.impl;

import domain.event.EventStatusEnum;

/**
 * Created by liyue on 2018/1/12
 */
public class PaidOrderEvent extends EventImpl {

  public PaidOrderEvent() {
    super(EventStatusEnum.PAID.getTitle());
  }
}
