package com.demo.service.cloud.server.zipkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
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
@Slf4j
@EnableZipkinServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServerZipkinApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ServerZipkinApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // do something;
    log.info("application is running-------------------------------------------------------------");
  }
}
