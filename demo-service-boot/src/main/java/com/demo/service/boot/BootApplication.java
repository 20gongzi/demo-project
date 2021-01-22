package com.demo.service.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * com.demo.service.boot.BootApplication
 *
 * @author gongcheng
 * @date 2020/10/15 20:16
 */
@ComponentScan("com.demo.framework.common")
@ComponentScan("com.demo.service.boot")
@MapperScan("com.demo.service.boot.dao")
@SpringBootApplication
public class BootApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootApplication.class, args);
  }
}
