package com.example.userservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
  private String email;
  private String name;
  private String password;
  private String encryptedPassword;
  private String userId;
  private Date createdAt;
}
