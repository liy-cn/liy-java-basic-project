package domain.event;

/**
 * Created by liyue on 2018/1/12
 */
public enum EventStatusEnum {

  SUBMIT("SUBMIT"),
  CREATED("CREATED"),
  PAID("PAID"),
  FINISHED("FINISHED"),
  ;

  private String title;
  EventStatusEnum(String title){
    this.title = title;
  }

  public String getTitle(){
    return this.title;
  }

}
