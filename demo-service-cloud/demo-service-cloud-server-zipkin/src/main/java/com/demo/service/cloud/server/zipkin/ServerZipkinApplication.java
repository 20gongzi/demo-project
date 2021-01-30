package com.demo.service.cloud.server.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * com.demo.service.cloud.server.zipkin.ServerZipkinApplication
 *
 * @author gongcheng
 * @date 2021/1/27 9:46
 */
@EnableZipkinServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServerZipkinApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServerZipkinApplication.class, args);
  }
}
