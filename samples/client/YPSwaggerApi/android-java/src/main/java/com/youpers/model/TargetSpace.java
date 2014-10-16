package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.ObjectId;
public class TargetSpace extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("type")
  private String type = null;
  @JsonProperty("targetId")
  private ObjectId targetId = null;
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
  public String getType() {
    return type;
  }

  public void setType(String type) {
      this.type = type;
  }
  public ObjectId getTargetId() {
    return targetId;
  }

  public void setTargetId(Object targetId)
  {
      if(targetId instanceof String)
      {
          String strId;
          strId = (String)targetId;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.targetId = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(targetId, ObjectId.class);
          obj.setIsLoaded(true);
          this.targetId = obj;
      }
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
    sb.append("class TargetSpace {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  targetId: ").append(targetId).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

