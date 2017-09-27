package org.axonframework.kafka.example.sender.api;

import org.axonframework.commandhandling.TargetAggregateIdentifier;


public class CreateNotificationCommand {
	
	public CreateNotificationCommand() {
		
	}
    public CreateNotificationCommand(String string, String title2, String message2) {
      this.id=string;
      this.title=title2;
      this.message=message2;
    }
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@TargetAggregateIdentifier
    String id;
    String title;
    String message;
}
