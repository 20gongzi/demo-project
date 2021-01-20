package com.demo.service.cloud.client.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.demo.service.client.config.controller.DemoController
 *
 * @author 20gongzi
 * @date 2021/1/19 0:39
 */
@Slf4j
@RestController
@RequestMapping("demo")
@RefreshScope
public class DemoController {

  @Value("${xxx}")
  private String xxx;

  @GetMapping("hello")
  public String hello() {
    log.info(xxx);
    return xxx;
  }
}
