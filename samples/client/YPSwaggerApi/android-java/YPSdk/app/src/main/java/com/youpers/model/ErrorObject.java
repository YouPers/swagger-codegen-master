package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class ErrorObject extends ObjectYP {
  @JsonProperty("message")
  private String message = null;
  @JsonProperty("code")
  private String code = null;
  @JsonProperty("stacktrace")
  private String stacktrace = null;
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
      this.message = message;
  }
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
      this.code = code;
  }
  public String getStacktrace() {
    return stacktrace;
  }

  public void setStacktrace(String stacktrace) {
      this.stacktrace = stacktrace;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorObject {\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  stacktrace: ").append(stacktrace).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

