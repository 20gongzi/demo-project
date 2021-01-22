package com.demo.service.cloud.server.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * com.demo.service.eureka.ServerEurekaApplication
 *
 * @author gongcheng
 * @date 2021/1/18 13:56
 */
@Slf4j
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServerConfigApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ServerConfigApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // do something;
    log.info("application is running-------------------------------------------------------------");
  }
}
