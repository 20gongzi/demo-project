package com.demo.service.cloud.client.zuul;

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
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.cloud.client.zuul")
@EnableZuulProxy
@SpringCloudApplication
public class ClientZuulApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientZuulApplication.class, args);
  }
}
