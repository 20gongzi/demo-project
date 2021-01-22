package com.demo.service.boot.service;

import com.demo.framework.common.model.response.CommonCode;
import com.demo.framework.model.pojo.UserDO;
import com.demo.framework.model.response.UserResponseResult;
import com.demo.service.boot.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.demo.service.boot.service.UserService
 *
 * @author gongcheng
 * @date 2020/10/16 14:47
 */
@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public UserResponseResult get(Long id) {
    UserDO userDO = userMapper.selectByPrimaryKey(id);
    return new UserResponseResult(CommonCode.SUCCESS, userDO);
  }
}
