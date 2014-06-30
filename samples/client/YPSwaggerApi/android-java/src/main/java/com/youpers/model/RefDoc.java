package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import com.youpers.model.ObjectId;
public class RefDoc extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("docId")
  private ObjectId docId = null;
  @JsonProperty("model")
  private String model = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public ObjectId getDocId() {
    return docId;
  }

  public void setDocId(Object docId)
  {
      if(docId instanceof String)
      {
          String strId;
          strId = (String)docId;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.docId = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(docId, ObjectId.class);
          obj.setIsLoaded(true);
          this.docId = obj;
      }
  }
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
      this.model = model;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefDoc {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  docId: ").append(docId).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

