package com.demo.service.cloud.client.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.demo.service.cloud.client.admin.ClientAdminApplication
 *
 * @author 20gongzi
 * @date 2021/1/30 22:52
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientAdminApplication.class, args);
  }

}
