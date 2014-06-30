package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.ActivityPlan;
public class RejectedActivityPlan extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  @JsonProperty("activityPlan")
  private ActivityPlan activityPlan = null;
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
  public ActivityPlan getActivityPlan() {
    return activityPlan;
  }

  public void setActivityPlan(Object activityPlan)
  {
      if(activityPlan instanceof String)
      {
          String strId;
          strId = (String)activityPlan;

          ActivityPlan obj = new ActivityPlan();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.activityPlan = obj;
      }
      else
      {
          ActivityPlan obj = JsonUtil.getJsonMapper().convertValue(activityPlan, ActivityPlan.class);
          obj.setIsLoaded(true);
          this.activityPlan = obj;
      }
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedActivityPlan {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  activityPlan: ").append(activityPlan).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

