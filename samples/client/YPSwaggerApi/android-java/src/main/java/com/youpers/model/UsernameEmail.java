package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class UsernameEmail extends ObjectYP {
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("username")
  private String username = null;
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
      this.username = username;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsernameEmail {\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

