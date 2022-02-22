package com.devd.spring.bookstoreaccountservice.web;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {

  private String access_token;
  private String token_type = "Bearer";
  private String refresh_token;
  private Long expires_in;
}
