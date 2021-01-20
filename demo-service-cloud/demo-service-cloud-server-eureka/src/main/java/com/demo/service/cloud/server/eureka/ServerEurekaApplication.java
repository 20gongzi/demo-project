package com.demo.service.cloud.server.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * com.demo.service.eureka.ServerEurekaApplication
 *
 * @author gongcheng
 * @date 2021/1/18 13:56
 */
@Slf4j
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.server.eureka")
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