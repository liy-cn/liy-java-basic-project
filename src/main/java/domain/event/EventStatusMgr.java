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
    if (this.orderStateMap.get(orderId) == null) {
      Stack<IEvent> events = new Stack<IEvent>();
      this.orderStateMap.put(orderId,events);
    }

    Stack<IEvent> events = this.orderStateMap.get(orderId);
    events.push(event);
    this.orderStateMap.put(orderId,events);
  }

  public String judgeState(UUID orderId) {
    Stack<IEvent> events = this.orderStateMap.get(orderId);
    IEvent event = events.peek();
    return event.getStatus();
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
