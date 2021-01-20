package com.demo.framework.common.exception;

import com.demo.framework.common.model.response.ResultCode;

/**
 * com.demo.framework.common.exception.ExceptionCast
 *
 * @author 20gongzi
 * @date 2020/10/13 15:37
 */
public class ExceptionCast {

  /**
   * 使用此静态方法抛出自定义异常
   *
   * @param resultCode
   */
  public static void cast(ResultCode resultCode) {
    throw new CustomException(resultCode);
  }
}