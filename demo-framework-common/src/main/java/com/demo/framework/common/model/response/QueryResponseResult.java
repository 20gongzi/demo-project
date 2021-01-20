package com.demo.framework.common.model.response;

import lombok.Data;
import lombok.ToString;

/**
 * com.demo.framework.common.model.response.QueryResponseResult
 *
 * @author 20gongzi
 * @date 2020/10/13 15:37
 */
@Data
@ToString
public class QueryResponseResult<T> extends ResponseResult {

  /**
   * 查询结果
   */
  QueryResult queryResult;

  public QueryResponseResult(ResultCode resultCode, QueryResult queryResult) {
    super(resultCode);
    this.queryResult = queryResult;
  }

}
