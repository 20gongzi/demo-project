package com.demo.service.boot.controller;

import com.demo.framework.common.model.response.CommonCode;
import com.demo.framework.model.pojo.UserDO;
import com.demo.framework.model.response.UserResponseResult;
import com.demo.framework.api.controller.UserControllerApi;
import com.demo.service.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * com.demo.service.boot.controller.UserController
 *
 * @author gongcheng
 * @date 2020/10/16 15:00
 */
@Slf4j
@Controller
@RequestMapping("user")
public class UserController implements UserControllerApi {

  @Autowired
  private UserService userService;

  @Override
  @GetMapping("{id}")
  @ResponseBody
  public UserResponseResult get(@PathVariable Long id) {
    return new UserResponseResult(CommonCode.SUCCESS,new UserDO());
  }

  @GetMapping("exception")
  public UserResponseResult exception() {
    int i = 1 / 0;
    return new UserResponseResult(CommonCode.SUCCESS, null);
  }
}
