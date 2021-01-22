package com.demo.framework.api.controller;

import com.demo.framework.model.response.UserResponseResult;

/**
 * com.demo.service.api.api.UserControllerApi
 *
 * @author gongcheng
 * @date 2020/10/16 15:23
 */
public interface UserControllerApi {

  public UserResponseResult get(Long id);
}
