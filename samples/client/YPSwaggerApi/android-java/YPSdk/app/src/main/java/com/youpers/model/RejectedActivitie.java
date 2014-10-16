package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.Activity;
public class RejectedActivitie extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  @JsonProperty("activity")
  private Activity activity = null;
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
  public Activity getActivity() {
    return activity;
  }

  public void setActivity(Object activity)
  {
      if(activity instanceof String)
      {
          String strId;
          strId = (String)activity;

          Activity obj = new Activity();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.activity = obj;
      }
      else
      {
          Activity obj = JsonUtil.getJsonMapper().convertValue(activity, Activity.class);
          obj.setIsLoaded(true);
          this.activity = obj;
      }
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedActivitie {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  activity: ").append(activity).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

