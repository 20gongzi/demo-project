package com.demo.service.rabbitmq.spring;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

  @RabbitListener(bindings = @QueueBinding(
      value = @Queue(value = "test_spring_queue", durable = "true"),
      exchange = @Exchange(
          value = "test_spring_exchange",
          ignoreDeclarationExceptions = "true",
          type = ExchangeTypes.TOPIC
      ),
      key = {"#.#"}))
  public void listen(String msg) {
    System.out.println("接收到消息：" + msg);
  }
}
