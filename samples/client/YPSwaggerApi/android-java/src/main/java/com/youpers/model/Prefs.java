package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.RejectedActivityPlan;
import com.youpers.model.StarredActivity;
import com.youpers.model.RejectedActivity;
import com.youpers.model.Email;
import com.youpers.model.Focus;
public class Prefs extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("email")
  private Email email = null;
  @JsonProperty("defaultWorkWeek")
  private List<String> defaultWorkWeek = new ArrayList<String>();
  @JsonProperty("personalGoal")
  private String personalGoal = null;
  @JsonProperty("focus")
  private List<Focus> focus = new ArrayList<Focus>();
  @JsonProperty("starredActivities")
  private List<StarredActivity> starredActivities = new ArrayList<StarredActivity>();
  @JsonProperty("rejectedActivities")
  private List<RejectedActivity> rejectedActivities = new ArrayList<RejectedActivity>();
  @JsonProperty("rejectedActivityPlans")
  private List<RejectedActivityPlan> rejectedActivityPlans = new ArrayList<RejectedActivityPlan>();
  @JsonProperty("firstDayOfWeek")
  private String firstDayOfWeek = null;
  @JsonProperty("timezone")
  private String timezone = null;
  @JsonProperty("calendarNotification")
  private String calendarNotification = null;
  @JsonProperty("lastDiaryEntry")
  private Date lastDiaryEntry = null;
  @JsonProperty("doNotAskAgainForDiaryEntry")
  private Boolean doNotAskAgainForDiaryEntry = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public Email getEmail() {
    return email;
  }

  public void setEmail(Object email)
  {
      if(email instanceof String)
      {
          String strId;
          strId = (String)email;

          Email obj = new Email();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.email = obj;
      }
      else
      {
          Email obj = JsonUtil.getJsonMapper().convertValue(email, Email.class);
          obj.setIsLoaded(true);
          this.email = obj;
      }
  }
  public List<String> getDefaultWorkWeek() {
    return defaultWorkWeek;
  }

  public void setDefaultWorkWeek(List<String> defaultWorkWeek) {
      this.defaultWorkWeek = defaultWorkWeek;
  }
  public String getPersonalGoal() {
    return personalGoal;
  }

  public void setPersonalGoal(String personalGoal) {
      this.personalGoal = personalGoal;
  }
  public List<Focus> getFocus() {
    return focus;
  }

  public void setFocus(List<Focus> focus) {
    this.focus = focus;
  }
  public List<StarredActivity> getStarredActivities() {
    return starredActivities;
  }

  public void setStarredActivities(List<StarredActivity> starredActivities) {
    this.starredActivities = starredActivities;
  }
  public List<RejectedActivity> getRejectedActivities() {
    return rejectedActivities;
  }

  public void setRejectedActivities(List<RejectedActivity> rejectedActivities) {
    this.rejectedActivities = rejectedActivities;
  }
  public List<RejectedActivityPlan> getRejectedActivityPlans() {
    return rejectedActivityPlans;
  }

  public void setRejectedActivityPlans(List<RejectedActivityPlan> rejectedActivityPlans) {
    this.rejectedActivityPlans = rejectedActivityPlans;
  }
  public String getFirstDayOfWeek() {
    return firstDayOfWeek;
  }

  public void setFirstDayOfWeek(String firstDayOfWeek) {
      this.firstDayOfWeek = firstDayOfWeek;
  }
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
      this.timezone = timezone;
  }
  public String getCalendarNotification() {
    return calendarNotification;
  }

  public void setCalendarNotification(String calendarNotification) {
      this.calendarNotification = calendarNotification;
  }
  public Date getLastDiaryEntry() {
    return lastDiaryEntry;
  }

  public void setLastDiaryEntry(Date lastDiaryEntry) {
      this.lastDiaryEntry = lastDiaryEntry;
  }
  public Boolean getDoNotAskAgainForDiaryEntry() {
    return doNotAskAgainForDiaryEntry;
  }

  public void setDoNotAskAgainForDiaryEntry(Boolean doNotAskAgainForDiaryEntry) {
      this.doNotAskAgainForDiaryEntry = doNotAskAgainForDiaryEntry;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prefs {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  defaultWorkWeek: ").append(defaultWorkWeek).append("\n");
    sb.append("  personalGoal: ").append(personalGoal).append("\n");
    sb.append("  focus: ").append(focus).append("\n");
    sb.append("  starredActivities: ").append(starredActivities).append("\n");
    sb.append("  rejectedActivities: ").append(rejectedActivities).append("\n");
    sb.append("  rejectedActivityPlans: ").append(rejectedActivityPlans).append("\n");
    sb.append("  firstDayOfWeek: ").append(firstDayOfWeek).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  calendarNotification: ").append(calendarNotification).append("\n");
    sb.append("  lastDiaryEntry: ").append(lastDiaryEntry).append("\n");
    sb.append("  doNotAskAgainForDiaryEntry: ").append(doNotAskAgainForDiaryEntry).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

