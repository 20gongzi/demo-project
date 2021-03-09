package com.demo.service.cloud.client.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.demo.service.cloud.client.gateway.ClientGatewayApplication
 *
 * @author gongcheng
 * @date 2021/2/7 15:46
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientGatewayApplication.class, args);
  }

}