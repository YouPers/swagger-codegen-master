package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.Idea;
public class StarredIdea extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  @JsonProperty("idea")
  private Idea idea = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
      this.timestamp = timestamp;
  }
  public Idea getIdea() {
    return idea;
  }

  public void setIdea(Object idea)
  {
      if(idea instanceof String)
      {
          String strId;
          strId = (String)idea;

          Idea obj = new Idea();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.idea = obj;
      }
      else
      {
          Idea obj = JsonUtil.getJsonMapper().convertValue(idea, Idea.class);
          obj.setIsLoaded(true);
          this.idea = obj;
      }
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarredIdea {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  idea: ").append(idea).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

