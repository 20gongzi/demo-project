package com.demo.service.boot.dao;

import com.demo.framework.model.pojo.UserDO;

public interface UserMapper {

  int deleteByPrimaryKey(Long id);

  int insert(UserDO record);

  int insertSelective(UserDO record);

  UserDO selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(UserDO record);

  int updateByPrimaryKey(UserDO record);
}