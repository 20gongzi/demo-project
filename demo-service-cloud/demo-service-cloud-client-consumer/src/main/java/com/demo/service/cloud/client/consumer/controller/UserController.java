package com.demo.service.cloud.client.consumer.controller;

import com.demo.framework.api.controller.UserControllerApi;
import com.demo.framework.model.response.UserResponseResult;
import com.demo.service.cloud.client.consumer.feign.UserServiceFeign;
import com.demo.service.cloud.client.consumer.ribbon.UserServiceRibbon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.demo.service.client.com.demo.service.cloud.client.consumer.controller.UserController
 *
 * @author gongcheng
 * @date 2021/1/18 14:50
 */
@Slf4j
@Controller
@RequestMapping("user")
public class UserController implements UserControllerApi {

  @Autowired
  private UserServiceRibbon userServiceRibbon;

  @Autowired
  private UserServiceFeign userServiceFeign;

  @Override
  @GetMapping("{id}")
  @ResponseBody
  public UserResponseResult get(@PathVariable Long id) {

//    基础测试
//    UserDO userDO = new UserDO();
//    userDO.setId(1L);
//    userDO.setUsername("xxx");
//    userDO.setPhone("1234567890");
//    userDO.setEmail("xxx@163.com");
//    userDO.setCreateTime(new Date());
//    userDO.setUpdateTime(new Date());
//    return new UserResponseResult(CommonCode.SUCCESS, userDO);

//    ribbon测试
//    log.info("consumer is running");
//    return userServiceRibbon.get(id);

//    feign测试
    log.info("consumer is running");
    return userServiceFeign.get(id);
  }
}
