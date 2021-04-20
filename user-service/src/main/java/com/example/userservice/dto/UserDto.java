package com.example.userservice.dto;

import com.example.userservice.vo.ResponseOrder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {
  private String email;
  private String name;
  private String password;
  private String encryptedPassword;
  private String userId;
  private List<ResponseOrder> orders;
  private Date createdAt;
}
