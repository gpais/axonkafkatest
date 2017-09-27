package org.axonframework.kafka.example.sender.api;


public class NotificationMarkedEvent {
  public NotificationMarkedEvent(String id2, NotificationState state2) {
   this.id=id2;
   this.state=state2;
  }
  
  public NotificationMarkedEvent() {
	  
  }
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public NotificationState getState() {
	return state;
}
public void setState(NotificationState state) {
	this.state = state;
}
String id;
  NotificationState state;
}
