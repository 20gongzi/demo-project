package com.demo.service.cloud.server.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.demo.service.cloud.server.admin.ServerAdminApplication
 *
 * @author 20gongzi
 * @date 2021/1/30 2:06
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServerAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServerAdminApplication.class, args);
  }
}
