package com.demo.service.cloud.server.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.demo.service.cloud.server.eureka.ServerEurekaApplication
 *
 * @author gongcheng
 * @date 2021/1/18 13:56
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class ServerEurekaApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ServerEurekaApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // do something;
    log.info("application is running-------------------------------------------------------------");
  }
}
