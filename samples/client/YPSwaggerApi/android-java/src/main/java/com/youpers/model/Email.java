package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class Email extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("iCalInvites")
  private Boolean iCalInvites = null;
  @JsonProperty("actPlanInvites")
  private Boolean actPlanInvites = null;
  @JsonProperty("dailyUserMail")
  private Boolean dailyUserMail = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public Boolean getICalInvites() {
    return iCalInvites;
  }

  public void setICalInvites(Boolean iCalInvites) {
      this.iCalInvites = iCalInvites;
  }
  public Boolean getActPlanInvites() {
    return actPlanInvites;
  }

  public void setActPlanInvites(Boolean actPlanInvites) {
      this.actPlanInvites = actPlanInvites;
  }
  public Boolean getDailyUserMail() {
    return dailyUserMail;
  }

  public void setDailyUserMail(Boolean dailyUserMail) {
      this.dailyUserMail = dailyUserMail;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  iCalInvites: ").append(iCalInvites).append("\n");
    sb.append("  actPlanInvites: ").append(actPlanInvites).append("\n");
    sb.append("  dailyUserMail: ").append(dailyUserMail).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

