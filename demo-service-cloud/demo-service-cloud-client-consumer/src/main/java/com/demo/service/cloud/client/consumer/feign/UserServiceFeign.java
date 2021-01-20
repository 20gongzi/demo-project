package com.demo.service.cloud.client.consumer.feign;

import com.demo.framework.model.response.UserResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.demo.service.cloud.client.consumer.feign.UserServiceFeign
 *
 * @author gongcheng
 * @date 2021/1/18 15:24
 */
@FeignClient("CLIENT-PROVIDER")
public interface UserServiceFeign {

  @ResponseBody
  @GetMapping("client-provider/user/{id}")
  UserResponseResult get(@PathVariable Long id);
}
