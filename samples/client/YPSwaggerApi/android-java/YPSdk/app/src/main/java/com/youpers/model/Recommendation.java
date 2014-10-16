package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import com.youpers.model.Idea;
public class Recommendation extends ObjectYP {
  @JsonProperty("idea")
  private Idea idea = null;
  @JsonProperty("weight")
  private Double weight = null;
  public Idea getIdea() {
    return idea;
  }

  public void setIdea(Object idea)
  {
      if(idea instanceof String)
      {
          String strId;
          strId = (String)idea;

          Idea obj = new Idea();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.idea = obj;
      }
      else
      {
          Idea obj = JsonUtil.getJsonMapper().convertValue(idea, Idea.class);
          obj.setIsLoaded(true);
          this.idea = obj;
      }
  }
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
      this.weight = weight;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommendation {\n");
    sb.append("  idea: ").append(idea).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

