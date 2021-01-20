package com.demo.service.cloud.client.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * com.demo.service.client.com.demo.service.cloud.client.consumer.ClientConsumerApplication
 *
 * @author gongcheng
 * @date 2021/1/18 14:46
 */
@Slf4j
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.client.consumer")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ClientConsumerApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ClientConsumerApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // do something;
    log.info("application is running-------------------------------------------------------------");
  }

  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
