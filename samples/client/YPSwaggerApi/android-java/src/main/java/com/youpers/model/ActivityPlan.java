package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.User;
import com.youpers.model.Campaign;
import com.youpers.model.Activity;
import com.youpers.model.MainEvent;
public class ActivityPlan extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("mainEvent")
  private MainEvent mainEvent = null;
  @JsonProperty("owner")
  private User owner = null;
  @JsonProperty("activity")
  private Activity activity = null;
  @JsonProperty("joiningUsers")
  private List<User> joiningUsers = new ArrayList<User>();
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("text")
  private String text = null;
  @JsonProperty("number")
  private String number = null;
  @JsonProperty("location")
  private String location = null;
  @JsonProperty("executionType")
  private String executionType = null;
  @JsonProperty("status")
  private String status = null;
  @JsonProperty("campaign")
  private Campaign campaign = null;
  @JsonProperty("fields")
  private List<String> fields = new ArrayList<String>();
  @JsonProperty("deletionReason")
  private String deletionReason = null;
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
  public MainEvent getMainEvent() {
    return mainEvent;
  }

  public void setMainEvent(Object mainEvent)
  {
      if(mainEvent instanceof String)
      {
          String strId;
          strId = (String)mainEvent;

          MainEvent obj = new MainEvent();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.mainEvent = obj;
      }
      else
      {
          MainEvent obj = JsonUtil.getJsonMapper().convertValue(mainEvent, MainEvent.class);
          obj.setIsLoaded(true);
          this.mainEvent = obj;
      }
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
  public List<User> getJoiningUsers() {
    return joiningUsers;
  }

  public void setJoiningUsers(List<User> joiningUsers) {
    this.joiningUsers = joiningUsers;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }
  public String getText() {
    return text;
  }

  public void setText(String text) {
      this.text = text;
  }
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
      this.number = number;
  }
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
      this.location = location;
  }
  public String getExecutionType() {
    return executionType;
  }

  public void setExecutionType(String executionType) {
      this.executionType = executionType;
  }
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
      this.status = status;
  }
  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Object campaign)
  {
      if(campaign instanceof String)
      {
          String strId;
          strId = (String)campaign;

          Campaign obj = new Campaign();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.campaign = obj;
      }
      else
      {
          Campaign obj = JsonUtil.getJsonMapper().convertValue(campaign, Campaign.class);
          obj.setIsLoaded(true);
          this.campaign = obj;
      }
  }
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
      this.fields = fields;
  }
  public String getDeletionReason() {
    return deletionReason;
  }

  public void setDeletionReason(String deletionReason) {
      this.deletionReason = deletionReason;
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
    sb.append("class ActivityPlan {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  mainEvent: ").append(mainEvent).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  activity: ").append(activity).append("\n");
    sb.append("  joiningUsers: ").append(joiningUsers).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  executionType: ").append(executionType).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  fields: ").append(fields).append("\n");
    sb.append("  deletionReason: ").append(deletionReason).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

