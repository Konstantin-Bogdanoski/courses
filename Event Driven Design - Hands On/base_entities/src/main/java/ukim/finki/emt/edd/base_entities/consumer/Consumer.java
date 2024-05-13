package ukim.finki.emt.edd.base_entities.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ukim.finki.emt.edd.base_entities.domain.Event;
import ukim.finki.emt.edd.base_entities.domain.Order;

@Service
public class Consumer<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(Event<T> event){
        LOGGER.info(String.format("Event received => %s", event.toString()));

        // process as needed
    }
}