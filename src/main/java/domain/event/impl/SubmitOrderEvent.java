package domain.event.impl;

import domain.event.EventStatusEnum;

/**
 * Created by liyue on 2018/1/12
 */
public class SubmitOrderEvent extends EventImpl {

  public SubmitOrderEvent() {
    super(EventStatusEnum.SUBMIT.getTitle());
  }
}
