package domain.event;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;

/**
 * Created by liyue on 2018/1/12
 */
public class EventStatusMgr {
  private Map<UUID,Stack<IEvent>> orderStateMap;
  private static EventStatusMgr instance;
  public EventStatusMgr() {
    this.orderStateMap = new HashMap<UUID, Stack<IEvent>>();
  }


  public void push(UUID orderId, IEvent event) {
    Stack<IEvent> orderEventsStack = this.orderStateMap.get(orderId);
    if (orderEventsStack == null) {
      orderEventsStack = new Stack<IEvent>();
      this.orderStateMap.put(orderId,orderEventsStack);
    }
    orderEventsStack.push(event);

  }

  public String judgeState(UUID orderId) {
    Stack<IEvent> events = this.orderStateMap.get(orderId);
    return events.peek().getStatus();
  }

  /**
   * 简单实现
   * @return
   */
  public static EventStatusMgr getInstance(){
    if (instance == null) {
      instance = new EventStatusMgr();
    }
    return instance;
  }

}
