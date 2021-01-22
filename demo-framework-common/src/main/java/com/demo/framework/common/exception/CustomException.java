package com.demo.framework.common.exception;

import com.demo.framework.common.model.response.ResultCode;

/**
 * com.demo.framework.common.exception.CustomException
 *
 * @author 20gongzi
 * @date 2020/10/13 15:37
 */
public class CustomException extends RuntimeException {

  private ResultCode resultCode;

  public CustomException(ResultCode resultCode) {
    //异常信息为错误代码+异常信息
    super("错误代码: " + resultCode.code() + " 错误信息: " + resultCode.message());
    this.resultCode = resultCode;
  }

  public ResultCode getResultCode() {
    return this.resultCode;
  }
}
