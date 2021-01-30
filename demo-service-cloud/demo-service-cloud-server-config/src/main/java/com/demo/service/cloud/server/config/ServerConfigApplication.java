package com.demo.service.cloud.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * com.demo.service.cloud.server.config.ServerConfigApplication
 *
 * @author gongcheng
 * @date 2021/1/18 13:56
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServerConfigApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServerConfigApplication.class, args);
  }
}
