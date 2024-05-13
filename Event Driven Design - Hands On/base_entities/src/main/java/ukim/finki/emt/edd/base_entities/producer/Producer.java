package ukim.finki.emt.edd.base_entities.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import ukim.finki.emt.edd.base_entities.domain.Event;

@Service
public class Producer<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    private final NewTopic topic;

    private final KafkaTemplate<String, Event<T>> kafkaTemplate;

    public Producer(NewTopic topic, KafkaTemplate<String, Event<T>> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Event<T> event){
        LOGGER.info(String.format("Event => %s", event.toString()));

        Message<Event<T>> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();
        kafkaTemplate.send(message);
    }
}
