package com.demo.framework.common.model.response;

import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * com.demo.framework.common.model.response.QueryResult
 *
 * @author 20gongzi
 * @date 2020/10/13 15:37
 */
@Data
@ToString
public class QueryResult<T> {

  /**
   * 数据列表
   */
  private List<T> list;
  /**
   * 数据总数
   */
  private long total;
}
