package com.demo.framework.model.response;

import com.demo.framework.common.model.response.ResponseResult;
import com.demo.framework.common.model.response.ResultCode;
import com.demo.framework.model.pojo.UserDO;
import lombok.Data;
import lombok.ToString;

/**
 * com.demo.framework.model.reponse.UserResponseResult
 *
 * @author gongcheng
 * @date 2020/10/16 14:51
 */
@Data
@ToString
public class UserResponseResult extends ResponseResult {

  private UserDO userDO;

  public UserResponseResult() {
  }

  public UserResponseResult(ResultCode resultCode, UserDO userDO) {
    super(resultCode);
    this.userDO = userDO;
  }
}
