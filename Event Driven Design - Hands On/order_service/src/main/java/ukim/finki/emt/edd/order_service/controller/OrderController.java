package ukim.finki.emt.edd.order_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ukim.finki.emt.edd.base_entities.domain.Event;
import ukim.finki.emt.edd.base_entities.domain.Order;
import ukim.finki.emt.edd.order_service.producer.OrderProducer;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order){

        order.setId(UUID.randomUUID().toString());

        Event<Order> orderEvent = new Event<>();
        orderEvent.setStatus("PENDING");
        orderEvent.setMessage("order status is in pending state");
        orderEvent.setObject(order);

        orderProducer.sendMessage(orderEvent);

        return "Order placed successfully";
    }
}
