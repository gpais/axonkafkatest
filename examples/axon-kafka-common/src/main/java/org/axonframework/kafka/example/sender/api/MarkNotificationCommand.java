package org.axonframework.kafka.example.sender.api;

import org.axonframework.commandhandling.TargetAggregateIdentifier;


public class MarkNotificationCommand {
  public MarkNotificationCommand() {
	  
  }
  public MarkNotificationCommand(String id2, NotificationState object) {
     this.id=id2;
     this.state=object;
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
@TargetAggregateIdentifier
  String id;
  NotificationState state;
}
