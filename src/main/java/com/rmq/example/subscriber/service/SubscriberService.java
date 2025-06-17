package com.rmq.example.subscriber.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

@RabbitListener(containerFactory = "listenerContainerFactory",queues = "MY_TEST_QUEUE")
public void receiveMessage(Message message){
    System.out.println(new String(message.getBody()));
}

}
