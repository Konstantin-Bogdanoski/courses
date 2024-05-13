package ukim.finki.emt.edd.inventory_service.consumer;

import org.springframework.stereotype.Service;
import ukim.finki.emt.edd.base_entities.consumer.Consumer;
import ukim.finki.emt.edd.base_entities.domain.Event;
import ukim.finki.emt.edd.base_entities.domain.Order;

@Service
public class OrderConsumer extends Consumer<Order> {
    @Override
    public void consume(Event<Order> event) {
        super.consume(event);

        // process as needed
    }
}