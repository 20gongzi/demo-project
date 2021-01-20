package com.demo.framework.common.exception;

import com.demo.framework.common.model.response.CommonCode;
import com.demo.framework.common.model.response.ResponseResult;
import com.demo.framework.common.model.response.ResultCode;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.demo.framework.common.exception.ExceptionCatch
 *
 * @author 20gongzi
 * @date 2020/10/13 15:37
 */
@ControllerAdvice
public class ExceptionCatch {

  private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionCatch.class);

  /**
   * EXCEPTIONS存放异常的错误代码和映射，ImmutableMap的特点是一旦创建则不可改变，并且线程安全
   */
  private static ImmutableMap<Class<? extends Throwable>, ResultCode> EXCEPTIONS;
  /**
   * Builder来构建一个异常类型和错误代码的异常
   */
  protected static ImmutableMap.Builder<Class<? extends Throwable>, ResultCode> builder = ImmutableMap
      .builder();

  /**
   * 捕获Exception异常
   *
   * @param e
   * @return
   */
  @ResponseBody
  @ExceptionHandler(Exception.class)
  public ResponseResult exception(Exception e) {
    LOGGER.error("catch Exception:{}\r\nException:", e.getMessage(), e);
    if (EXCEPTIONS == null) {
      EXCEPTIONS = builder.build();
    }
    // 从EXCEPTIONS中取出对于的预定义错误码，如果不存在则为null
    final ResultCode resultCode = EXCEPTIONS.get(e.getClass());
    final ResponseResult responseResult;
    if (resultCode != null) {
      responseResult = new ResponseResult(resultCode);
    } else {
      //如果非预定义的错误，则返回服务器错误
      responseResult = new ResponseResult(CommonCode.SERVER_ERROR);
    }
    return responseResult;
  }

  /**
   * 捕获CustomException异常
   *
   * @param e
   * @return
   */
  @ResponseBody
  @ExceptionHandler(CustomException.class)
  public ResponseResult customException(CustomException e) {
    LOGGER.error("catch Exception:{}\r\nException:", e.getMessage(), e);
    ResultCode resultCode = e.getResultCode();
    ResponseResult responseResult = new ResponseResult(resultCode);
    return responseResult;
  }

  static {
    // 加入通用基础异常类型的判断
    builder.put(HttpMessageNotReadableException.class, CommonCode.INVALID_PARAM);
  }
}