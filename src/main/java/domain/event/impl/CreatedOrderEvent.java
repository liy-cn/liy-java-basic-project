package domain.event.impl;

import domain.event.EventStatusEnum;

/**
 * Created by liyue on 2018/1/12
 */
public class CreatedOrderEvent extends EventImpl{

  public CreatedOrderEvent() {
    super(EventStatusEnum.CREATED.getTitle());
  }
}
