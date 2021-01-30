package com.demo.service.cloud.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * com.demo.service.cloud.server.eureka.ServerEurekaApplication
 *
 * @author gongcheng
 * @date 2021/1/18 13:56
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServerEurekaApplication.class, args);
  }
}
