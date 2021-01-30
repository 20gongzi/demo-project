package com.demo.service.cloud.client.provider;

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
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.client.provider")
@EnableDiscoveryClient
@SpringBootApplication
public class ClientProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientProviderApplication.class, args);
  }
}
