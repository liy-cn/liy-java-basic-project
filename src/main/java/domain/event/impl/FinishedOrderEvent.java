package domain.event.impl;

import domain.event.EventStatusEnum;

/**
 * Created by liyue on 2018/1/12
 */
public class FinishedOrderEvent extends EventImpl {

  public FinishedOrderEvent() {
    super(EventStatusEnum.FINISHED.getTitle());
  }
}
