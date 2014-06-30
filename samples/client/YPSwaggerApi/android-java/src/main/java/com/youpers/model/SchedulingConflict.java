package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import com.youpers.model.ActivityEvent;
public class SchedulingConflict extends ObjectYP {
  @JsonProperty("conflictingNewEvent")
  private ActivityEvent conflictingNewEvent = null;
  @JsonProperty("conflictingSavedEvent")
  private ActivityEvent conflictingSavedEvent = null;
  public ActivityEvent getConflictingNewEvent() {
    return conflictingNewEvent;
  }

  public void setConflictingNewEvent(Object conflictingNewEvent)
  {
      if(conflictingNewEvent instanceof String)
      {
          String strId;
          strId = (String)conflictingNewEvent;

          ActivityEvent obj = new ActivityEvent();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.conflictingNewEvent = obj;
      }
      else
      {
          ActivityEvent obj = JsonUtil.getJsonMapper().convertValue(conflictingNewEvent, ActivityEvent.class);
          obj.setIsLoaded(true);
          this.conflictingNewEvent = obj;
      }
  }
  public ActivityEvent getConflictingSavedEvent() {
    return conflictingSavedEvent;
  }

  public void setConflictingSavedEvent(Object conflictingSavedEvent)
  {
      if(conflictingSavedEvent instanceof String)
      {
          String strId;
          strId = (String)conflictingSavedEvent;

          ActivityEvent obj = new ActivityEvent();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.conflictingSavedEvent = obj;
      }
      else
      {
          ActivityEvent obj = JsonUtil.getJsonMapper().convertValue(conflictingSavedEvent, ActivityEvent.class);
          obj.setIsLoaded(true);
          this.conflictingSavedEvent = obj;
      }
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingConflict {\n");
    sb.append("  conflictingNewEvent: ").append(conflictingNewEvent).append("\n");
    sb.append("  conflictingSavedEvent: ").append(conflictingSavedEvent).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

