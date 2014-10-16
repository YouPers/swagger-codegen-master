package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectId extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectId {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

