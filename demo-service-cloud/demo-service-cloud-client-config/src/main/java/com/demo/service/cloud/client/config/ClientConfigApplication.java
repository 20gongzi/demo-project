package com.demo.service.cloud.client.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * com.service.cloud.client.config.ClientConfigApplication
 *
 * @author 20gongzi
 * @date 2021/1/19 0:30
 */
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.client.config")
@EnableDiscoveryClient
@SpringBootApplication
public class ClientConfigApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientConfigApplication.class, args);
  }
}
