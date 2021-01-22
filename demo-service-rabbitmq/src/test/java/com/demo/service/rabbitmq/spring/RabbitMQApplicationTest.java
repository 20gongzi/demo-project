package com.demo.service.rabbitmq.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * com.demo.service.rabbitmq.spring.RabbitMQApplicationTest
 *
 * @author gongcheng
 * @date 2021/1/21 20:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMQApplication.class)
public class RabbitMQApplicationTest {

  @Autowired
  private AmqpTemplate amqpTemplate;

  @Test
  public void convertAndSend() {
    this.amqpTemplate.convertAndSend("test_spring_exchange", "test_spring_queue", "hello world");
    System.out.println("convertAndSend is running");
  }
}
