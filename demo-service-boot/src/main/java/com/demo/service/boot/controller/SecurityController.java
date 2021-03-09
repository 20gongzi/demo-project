package com.demo.service.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.demo.service.boot.controller.SecurityController
 *
 * @author gongcheng
 * @date 2021/3/4 15:02
 */
@RestController
public class SecurityController {

  @GetMapping("root/test")
  public String rootTest() {
    return "hello root";
  }

  @GetMapping("admin/test")
  public String adminTest() {
    return "hello admin";
  }

  @GetMapping("all/test")
  public String allTest() {
    return "hello world";
  }
}
