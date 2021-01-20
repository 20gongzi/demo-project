package com.demo.service.cloud.client.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
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
@Slf4j
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.client.config")
@EnableDiscoveryClient
@SpringBootApplication
public class ClientConfigApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ClientConfigApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // do something;
    log.info("application is running-------------------------------------------------------------");
  }
}
