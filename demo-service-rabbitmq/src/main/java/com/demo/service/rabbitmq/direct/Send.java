package com.demo.service.rabbitmq.direct;

import com.demo.service.rabbitmq.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * 生产者
 */
public class Send {

  private final static String EXCHANGE_NAME = "test_direct_exchange";

  public static void main(String[] argv) throws Exception {
    // 获取到连接
    Connection connection = ConnectionUtil.getConnection();
    // 获取通道
    Channel channel = connection.createChannel();
    // 声明exchange，指定类型为direct
    channel.exchangeDeclare(EXCHANGE_NAME, "direct");
    // 消息内容
    String message = "商品删除了， id = 1001";
    // 发送消息，并且指定routing key 为：insert ,代表新增商品
    channel.basicPublish(EXCHANGE_NAME, "delete", null, message.getBytes());
    System.out.println(" [商品服务：] Sent '" + message + "'");

    channel.close();
    connection.close();
  }
}