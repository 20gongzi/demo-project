package com.demo.framework.model.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDO implements Serializable {

  private Long id;

  private String username;

  private String email;

  private String phone;

  private Date createTime;

  private Date updateTime;
}