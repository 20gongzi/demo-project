package com.demo.service.cloud.client.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * com.demo.service.cloud.client.zuul.filter.DemoFilter
 *
 * @author gongcheng
 * @date 2021/1/20 19:41
 */
@Slf4j
@Component
public class AuthFilter extends ZuulFilter {

  @Override
  public String filterType() {
    log.info("filterType is running");
    return "pre";
  }

  @Override
  public int filterOrder() {
    log.info("filterOrder is running");
    return 100;
  }

  @Override
  public boolean shouldFilter() {
    log.info("shouldFilter is running");
    return true;
  }

  @Override
  public Object run() throws ZuulException {
    log.info("run is running");
    return "hello world";
  }
}
