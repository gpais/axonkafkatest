package org.axonframework.kafka.example.sender.event;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.kafka.example.sender.SenderConfiguration;
import org.axonframework.kafka.example.sender.api.NotificationCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class NotificationEventHandler {
    private static final Logger log = LoggerFactory.getLogger(SenderConfiguration.class);

    @EventHandler
    public void on(NotificationCreatedEvent e) {
        log.info("Local tracking handler {}", e);
    }
}
