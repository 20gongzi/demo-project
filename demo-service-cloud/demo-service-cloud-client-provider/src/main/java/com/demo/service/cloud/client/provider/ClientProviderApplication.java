package com.demo.service.cloud.client.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * com.demo.service.client.provider.ClientProviderApplication
 *
 * @author gongcheng
 * @date 2021/1/18 14:46
 */
@Slf4j
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.client.provider")
@EnableDiscoveryClient
@SpringBootApplication
public class ClientProviderApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ClientProviderApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // do something;
    log.info("application is running-------------------------------------------------------------");
  }
}
