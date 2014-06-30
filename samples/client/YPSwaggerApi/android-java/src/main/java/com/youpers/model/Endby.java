package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
public class Endby extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("type")
  private String type = null;
  @JsonProperty("on")
  private Date on = null;
  @JsonProperty("after")
  private Long after = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public String getType() {
    return type;
  }

  public void setType(String type) {
      this.type = type;
  }
  public Date getOn() {
    return on;
  }

  public void setOn(Date on) {
      this.on = on;
  }
  public Long getAfter() {
    return after;
  }

  public void setAfter(Long after) {
      this.after = after;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endby {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  on: ").append(on).append("\n");
    sb.append("  after: ").append(after).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

