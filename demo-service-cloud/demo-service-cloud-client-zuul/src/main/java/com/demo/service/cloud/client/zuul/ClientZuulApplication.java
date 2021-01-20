package com.demo.service.cloud.client.zuul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * com.demo.service.cloud.client.zuul.ClientZuulApplication
 *
 * @author gongcheng
 * @date 2021/1/20 9:31
 */
@Slf4j
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.client.zuul")
@EnableZuulProxy
@SpringCloudApplication
public class ClientZuulApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ClientZuulApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // do something;
    log.info("application is running-------------------------------------------------------------");
  }
}
