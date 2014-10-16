package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import com.youpers.model.User;
public class ActivityInvitationStatusResult extends ObjectYP {
  @JsonProperty("user")
  private User user = null;
  @JsonProperty("status")
  private String status = null;
  public User getUser() {
    return user;
  }

  public void setUser(Object user)
  {
      if(user instanceof String)
      {
          String strId;
          strId = (String)user;

          User obj = new User();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.user = obj;
      }
      else
      {
          User obj = JsonUtil.getJsonMapper().convertValue(user, User.class);
          obj.setIsLoaded(true);
          this.user = obj;
      }
  }
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
      this.status = status;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityInvitationStatusResult {\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

