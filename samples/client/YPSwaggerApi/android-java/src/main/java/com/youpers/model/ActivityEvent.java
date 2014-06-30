package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.ActivityPlan;
import com.youpers.model.User;
import com.youpers.model.Activity;
public class ActivityEvent extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("owner")
  private User owner = null;
  @JsonProperty("activity")
  private Activity activity = null;
  @JsonProperty("activityPlan")
  private ActivityPlan activityPlan = null;
  @JsonProperty("status")
  private String status = null;
  @JsonProperty("start")
  private Date start = null;
  @JsonProperty("end")
  private Date end = null;
  @JsonProperty("doneTs")
  private Date doneTs = null;
  @JsonProperty("feedback")
  private Long feedback = null;
  @JsonProperty("comment")
  private String comment = null;
  @JsonProperty("updated")
  private Date updated = null;
  @JsonProperty("created")
  private Date created = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public User getOwner() {
    return owner;
  }

  public void setOwner(Object owner)
  {
      if(owner instanceof String)
      {
          String strId;
          strId = (String)owner;

          User obj = new User();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.owner = obj;
      }
      else
      {
          User obj = JsonUtil.getJsonMapper().convertValue(owner, User.class);
          obj.setIsLoaded(true);
          this.owner = obj;
      }
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
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
      this.status = status;
  }
  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
      this.start = start;
  }
  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
      this.end = end;
  }
  public Date getDoneTs() {
    return doneTs;
  }

  public void setDoneTs(Date doneTs) {
      this.doneTs = doneTs;
  }
  public Long getFeedback() {
    return feedback;
  }

  public void setFeedback(Long feedback) {
      this.feedback = feedback;
  }
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
      this.comment = comment;
  }
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
      this.updated = updated;
  }
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
      this.created = created;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityEvent {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  activity: ").append(activity).append("\n");
    sb.append("  activityPlan: ").append(activityPlan).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  doneTs: ").append(doneTs).append("\n");
    sb.append("  feedback: ").append(feedback).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

