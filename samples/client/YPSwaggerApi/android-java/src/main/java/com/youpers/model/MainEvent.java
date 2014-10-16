package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.Recurrence;
public class MainEvent extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("recurrence")
  private Recurrence recurrence = null;
  @JsonProperty("start")
  private Date start = null;
  @JsonProperty("end")
  private Date end = null;
  @JsonProperty("allDay")
  private Boolean allDay = null;
  @JsonProperty("frequency")
  private String frequency = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public Recurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(Object recurrence)
  {
      if(recurrence instanceof String)
      {
          String strId;
          strId = (String)recurrence;

          Recurrence obj = new Recurrence();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.recurrence = obj;
      }
      else
      {
          Recurrence obj = JsonUtil.getJsonMapper().convertValue(recurrence, Recurrence.class);
          obj.setIsLoaded(true);
          this.recurrence = obj;
      }
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
  public Boolean getAllDay() {
    return allDay;
  }

  public void setAllDay(Boolean allDay) {
      this.allDay = allDay;
  }
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
      this.frequency = frequency;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainEvent {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  recurrence: ").append(recurrence).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  allDay: ").append(allDay).append("\n");
    sb.append("  frequency: ").append(frequency).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

