package com.example.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserManagementService {

  private String username;


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    System.out.println(this);
    this.username = username;
  }
}
