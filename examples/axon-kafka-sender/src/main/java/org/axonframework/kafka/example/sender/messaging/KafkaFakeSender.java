package org.axonframework.kafka.example.sender.messaging;

import org.axonframework.kafka.example.sender.SenderConfiguration;
import org.axonframework.messaging.kafka.Sender;
import org.axonframework.messaging.kafka.message.KafkaMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class KafkaFakeSender implements Sender {
    private static final Logger log = LoggerFactory.getLogger(SenderConfiguration.class);

    private String eventTopic;

    public KafkaFakeSender(final String eventTopic) {
	this.eventTopic = eventTopic;
    }

    @Override
    public void send(KafkaMessage message) {
	log.info("[FAKE SENDER] -> Sending message '{}' with size {} to '{}'", message.getKey(),
		message.getPayload().length, eventTopic);
    }

}
