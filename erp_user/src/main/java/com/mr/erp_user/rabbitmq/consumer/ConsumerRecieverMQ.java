package com.mr.erp_user.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ConsumerRecieverMQ {

    @RabbitHandler
    @RabbitListener(queues = "queue1906.mr")
    public void testUse(String msg) throws IOException {
        System.out.println(msg);

    }

}
