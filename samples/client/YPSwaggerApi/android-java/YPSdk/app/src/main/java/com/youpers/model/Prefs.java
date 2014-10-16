package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.*;
import com.youpers.model.RejectedIdea;
import com.youpers.model.StarredIdea;
import com.youpers.model.RejectedActivitie;
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
  @JsonProperty("starredIdeas")
  private List<StarredIdea> starredIdeas = new ArrayList<StarredIdea>();
  @JsonProperty("rejectedIdeas")
  private List<RejectedIdea> rejectedIdeas = new ArrayList<RejectedIdea>();
  @JsonProperty("rejectedActivities")
  private List<RejectedActivitie> rejectedActivities = new ArrayList<RejectedActivitie>();
  @JsonProperty("firstDayOfWeek")
  private String firstDayOfWeek = null;
  @JsonProperty("timezone")
  private String timezone = null;
  @JsonProperty("calendarNotification")
  private String calendarNotification = null;
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
  public List<StarredIdea> getStarredIdeas() {
    return starredIdeas;
  }

  public void setStarredIdeas(List<StarredIdea> starredIdeas) {
    this.starredIdeas = starredIdeas;
  }
  public List<RejectedIdea> getRejectedIdeas() {
    return rejectedIdeas;
  }

  public void setRejectedIdeas(List<RejectedIdea> rejectedIdeas) {
    this.rejectedIdeas = rejectedIdeas;
  }
  public List<RejectedActivitie> getRejectedActivities() {
    return rejectedActivities;
  }

  public void setRejectedActivities(List<RejectedActivitie> rejectedActivities) {
    this.rejectedActivities = rejectedActivities;
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
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prefs {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  defaultWorkWeek: ").append(defaultWorkWeek).append("\n");
    sb.append("  personalGoal: ").append(personalGoal).append("\n");
    sb.append("  focus: ").append(focus).append("\n");
    sb.append("  starredIdeas: ").append(starredIdeas).append("\n");
    sb.append("  rejectedIdeas: ").append(rejectedIdeas).append("\n");
    sb.append("  rejectedActivities: ").append(rejectedActivities).append("\n");
    sb.append("  firstDayOfWeek: ").append(firstDayOfWeek).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  calendarNotification: ").append(calendarNotification).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

