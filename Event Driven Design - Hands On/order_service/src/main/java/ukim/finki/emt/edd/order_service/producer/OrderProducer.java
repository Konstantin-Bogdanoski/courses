package ukim.finki.emt.edd.order_service.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ukim.finki.emt.edd.base_entities.domain.Event;
import ukim.finki.emt.edd.base_entities.domain.Order;
import ukim.finki.emt.edd.base_entities.producer.Producer;

@Service
public class OrderProducer extends Producer<Order> {
    public OrderProducer(NewTopic topic, KafkaTemplate<String, Event<Order>> kafkaTemplate) {
        super(topic, kafkaTemplate);
    }
}
