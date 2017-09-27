package org.axonframework.kafka.example.receiver.query;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.kafka.example.receiver.AxonConfiguration;
import org.axonframework.kafka.example.sender.api.NotificationCreatedEvent;
import org.axonframework.kafka.example.sender.api.NotificationMarkedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
public class NotificationLoggingListener {
    private static final Logger log = LoggerFactory.getLogger(NotificationLoggingListener.class);
  @EventHandler
  public void on(final NotificationCreatedEvent e) {
    log.info("Notification created {}", e);
  }
  
  @EventHandler
  public void on(final NotificationMarkedEvent e) {
    log.info("Notification marked {}", e);
  }

}
