package com.demo.service.cloud.client.consumer.ribbon;

import com.demo.framework.common.model.response.CommonCode;
import com.demo.framework.model.pojo.UserDO;
import com.demo.framework.model.response.UserResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * com.demo.service.cloud.client.consumer.ribbon.UserServiceRibbon
 *
 * @author gongcheng
 * @date 2021/1/18 15:24
 */
@Service
public class UserServiceRibbon {

  @Autowired
  private RestTemplate restTemplate;

  public UserResponseResult get(Long id) {
    String url = "http://CLIENT-PROVIDER/client-provider/user/" + id;
    ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
    String body = entity.getBody();
    return new UserResponseResult(CommonCode.SUCCESS, new UserDO());
  }
}
