package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.ActivityPlan;
import com.youpers.model.User;
import com.youpers.model.ObjectId;
import com.youpers.model.Activity;
public class ActivityOffer extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("activity")
  private Activity activity = null;
  @JsonProperty("activityPlan")
  private List<ActivityPlan> activityPlan = new ArrayList<ActivityPlan>();
  @JsonProperty("offerType")
  private List<String> offerType = new ArrayList<String>();
  @JsonProperty("targetQueue")
  private ObjectId targetQueue = null;
  @JsonProperty("recommendedBy")
  private List<User> recommendedBy = new ArrayList<User>();
  @JsonProperty("prio")
  private List<Long> prio = new ArrayList<Long>();
  @JsonProperty("validFrom")
  private Date validFrom = null;
  @JsonProperty("validTo")
  private Date validTo = null;
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
  public List<ActivityPlan> getActivityPlan() {
    return activityPlan;
  }

  public void setActivityPlan(List<ActivityPlan> activityPlan) {
    this.activityPlan = activityPlan;
  }
  public List<String> getOfferType() {
    return offerType;
  }

  public void setOfferType(List<String> offerType) {
      this.offerType = offerType;
  }
  public ObjectId getTargetQueue() {
    return targetQueue;
  }

  public void setTargetQueue(Object targetQueue)
  {
      if(targetQueue instanceof String)
      {
          String strId;
          strId = (String)targetQueue;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.targetQueue = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(targetQueue, ObjectId.class);
          obj.setIsLoaded(true);
          this.targetQueue = obj;
      }
  }
  public List<User> getRecommendedBy() {
    return recommendedBy;
  }

  public void setRecommendedBy(List<User> recommendedBy) {
    this.recommendedBy = recommendedBy;
  }
  public List<Long> getPrio() {
    return prio;
  }

  public void setPrio(List<Long> prio) {
      this.prio = prio;
  }
  public Date getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(Date validFrom) {
      this.validFrom = validFrom;
  }
  public Date getValidTo() {
    return validTo;
  }

  public void setValidTo(Date validTo) {
      this.validTo = validTo;
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
    sb.append("class ActivityOffer {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  activity: ").append(activity).append("\n");
    sb.append("  activityPlan: ").append(activityPlan).append("\n");
    sb.append("  offerType: ").append(offerType).append("\n");
    sb.append("  targetQueue: ").append(targetQueue).append("\n");
    sb.append("  recommendedBy: ").append(recommendedBy).append("\n");
    sb.append("  prio: ").append(prio).append("\n");
    sb.append("  validFrom: ").append(validFrom).append("\n");
    sb.append("  validTo: ").append(validTo).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

