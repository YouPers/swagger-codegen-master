package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.User;
import com.youpers.model.ObjectId;
import com.youpers.model.RefDoc;
public class Notification extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("author")
  private User author = null;
  @JsonProperty("type")
  private String type = null;
  @JsonProperty("sourceType")
  private String sourceType = null;
  @JsonProperty("refDocs")
  private List<RefDoc> refDocs = new ArrayList<RefDoc>();
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("refDocLink")
  private String refDocLink = null;
  @JsonProperty("targetQueue")
  private ObjectId targetQueue = null;
  @JsonProperty("text")
  private String text = null;
  @JsonProperty("publishFrom")
  private Date publishFrom = null;
  @JsonProperty("publishTo")
  private Date publishTo = null;
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
  public User getAuthor() {
    return author;
  }

  public void setAuthor(Object author)
  {
      if(author instanceof String)
      {
          String strId;
          strId = (String)author;

          User obj = new User();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.author = obj;
      }
      else
      {
          User obj = JsonUtil.getJsonMapper().convertValue(author, User.class);
          obj.setIsLoaded(true);
          this.author = obj;
      }
  }
  public String getType() {
    return type;
  }

  public void setType(String type) {
      this.type = type;
  }
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
      this.sourceType = sourceType;
  }
  public List<RefDoc> getRefDocs() {
    return refDocs;
  }

  public void setRefDocs(List<RefDoc> refDocs) {
    this.refDocs = refDocs;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }
  public String getRefDocLink() {
    return refDocLink;
  }

  public void setRefDocLink(String refDocLink) {
      this.refDocLink = refDocLink;
  }
  public ObjectId getTargetQueue() {
    return targetQueue;
  }

  public void setTargetQueue(Object targetQueue)
  {
      if(targetQueue instanceof String)
      {
          String strId;
          strId = (String)targetQueue;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.targetQueue = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(targetQueue, ObjectId.class);
          obj.setIsLoaded(true);
          this.targetQueue = obj;
      }
  }
  public String getText() {
    return text;
  }

  public void setText(String text) {
      this.text = text;
  }
  public Date getPublishFrom() {
    return publishFrom;
  }

  public void setPublishFrom(Date publishFrom) {
      this.publishFrom = publishFrom;
  }
  public Date getPublishTo() {
    return publishTo;
  }

  public void setPublishTo(Date publishTo) {
      this.publishTo = publishTo;
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
    sb.append("class Notification {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  sourceType: ").append(sourceType).append("\n");
    sb.append("  refDocs: ").append(refDocs).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  refDocLink: ").append(refDocLink).append("\n");
    sb.append("  targetQueue: ").append(targetQueue).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  publishFrom: ").append(publishFrom).append("\n");
    sb.append("  publishTo: ").append(publishTo).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

