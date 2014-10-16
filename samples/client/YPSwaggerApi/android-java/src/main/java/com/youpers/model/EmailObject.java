package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class EmailObject extends ObjectYP {
  @JsonProperty("email")
  private String email = null;
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailObject {\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

