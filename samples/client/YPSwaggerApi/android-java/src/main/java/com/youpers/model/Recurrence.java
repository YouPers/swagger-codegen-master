package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.Endby;
public class Recurrence extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("endby")
  private Endby endby = null;
  @JsonProperty("byday")
  private List<String> byday = new ArrayList<String>();
  @JsonProperty("every")
  private Long every = null;
  @JsonProperty("exceptions")
  private List<Date> exceptions = new ArrayList<Date>();
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public Endby getEndby() {
    return endby;
  }

  public void setEndby(Object endby)
  {
      if(endby instanceof String)
      {
          String strId;
          strId = (String)endby;

          Endby obj = new Endby();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.endby = obj;
      }
      else
      {
          Endby obj = JsonUtil.getJsonMapper().convertValue(endby, Endby.class);
          obj.setIsLoaded(true);
          this.endby = obj;
      }
  }
  public List<String> getByday() {
    return byday;
  }

  public void setByday(List<String> byday) {
      this.byday = byday;
  }
  public Long getEvery() {
    return every;
  }

  public void setEvery(Long every) {
      this.every = every;
  }
  public List<Date> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<Date> exceptions) {
      this.exceptions = exceptions;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  endby: ").append(endby).append("\n");
    sb.append("  byday: ").append(byday).append("\n");
    sb.append("  every: ").append(every).append("\n");
    sb.append("  exceptions: ").append(exceptions).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

