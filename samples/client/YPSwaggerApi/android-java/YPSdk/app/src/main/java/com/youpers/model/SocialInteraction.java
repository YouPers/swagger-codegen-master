package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.User;
import com.youpers.model.RefDoc;
import com.youpers.model.TargetSpace;
public class SocialInteraction extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("targetSpaces")
  private List<TargetSpace> targetSpaces = new ArrayList<TargetSpace>();
  @JsonProperty("publishFrom")
  private Date publishFrom = null;
  @JsonProperty("publishTo")
  private Date publishTo = null;
  @JsonProperty("author")
  private User author = null;
  @JsonProperty("authorType")
  private String authorType = null;
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("text")
  private String text = null;
  @JsonProperty("refDocs")
  private List<RefDoc> refDocs = new ArrayList<RefDoc>();
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
  public List<TargetSpace> getTargetSpaces() {
    return targetSpaces;
  }

  public void setTargetSpaces(List<TargetSpace> targetSpaces) {
    this.targetSpaces = targetSpaces;
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
  public String getAuthorType() {
    return authorType;
  }

  public void setAuthorType(String authorType) {
      this.authorType = authorType;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }
  public String getText() {
    return text;
  }

  public void setText(String text) {
      this.text = text;
  }
  public List<RefDoc> getRefDocs() {
    return refDocs;
  }

  public void setRefDocs(List<RefDoc> refDocs) {
    this.refDocs = refDocs;
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
    sb.append("class SocialInteraction {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  targetSpaces: ").append(targetSpaces).append("\n");
    sb.append("  publishFrom: ").append(publishFrom).append("\n");
    sb.append("  publishTo: ").append(publishTo).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  authorType: ").append(authorType).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  refDocs: ").append(refDocs).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

