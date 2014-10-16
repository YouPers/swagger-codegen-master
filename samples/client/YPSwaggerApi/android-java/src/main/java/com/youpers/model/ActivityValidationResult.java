package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import com.youpers.model.ActivityEvent;
public class ActivityValidationResult extends ObjectYP {
  @JsonProperty("event")
  private ActivityEvent event = null;
  @JsonProperty("conflictingEvent")
  private ActivityEvent conflictingEvent = null;
  public ActivityEvent getEvent() {
    return event;
  }

  public void setEvent(Object event)
  {
      if(event instanceof String)
      {
          String strId;
          strId = (String)event;

          ActivityEvent obj = new ActivityEvent();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.event = obj;
      }
      else
      {
          ActivityEvent obj = JsonUtil.getJsonMapper().convertValue(event, ActivityEvent.class);
          obj.setIsLoaded(true);
          this.event = obj;
      }
  }
  public ActivityEvent getConflictingEvent() {
    return conflictingEvent;
  }

  public void setConflictingEvent(Object conflictingEvent)
  {
      if(conflictingEvent instanceof String)
      {
          String strId;
          strId = (String)conflictingEvent;

          ActivityEvent obj = new ActivityEvent();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.conflictingEvent = obj;
      }
      else
      {
          ActivityEvent obj = JsonUtil.getJsonMapper().convertValue(conflictingEvent, ActivityEvent.class);
          obj.setIsLoaded(true);
          this.conflictingEvent = obj;
      }
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityValidationResult {\n");
    sb.append("  event: ").append(event).append("\n");
    sb.append("  conflictingEvent: ").append(conflictingEvent).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

