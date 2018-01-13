package domain.event.impl;

import domain.event.EventStatusEnum;

/**
 * Created by liyue on 2018/1/12
 */
public class SubmitedOrderEvent extends EventImpl {

  public SubmitedOrderEvent() {
    super(EventStatusEnum.SUBMITED.getTitle());
  }
}
