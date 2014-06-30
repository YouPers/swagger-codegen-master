package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.User;
import com.youpers.model.ObjectId;
import com.youpers.model.Campaign;
public class Comment extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("author")
  private User author = null;
  @JsonProperty("refDoc")
  private ObjectId refDoc = null;
  @JsonProperty("refDocModel")
  private String refDocModel = null;
  @JsonProperty("refDocPath")
  private String refDocPath = null;
  @JsonProperty("refDocTitle")
  private String refDocTitle = null;
  @JsonProperty("refDocLink")
  private String refDocLink = null;
  @JsonProperty("campaign")
  private Campaign campaign = null;
  @JsonProperty("text")
  private String text = null;
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
  public ObjectId getRefDoc() {
    return refDoc;
  }

  public void setRefDoc(Object refDoc)
  {
      if(refDoc instanceof String)
      {
          String strId;
          strId = (String)refDoc;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.refDoc = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(refDoc, ObjectId.class);
          obj.setIsLoaded(true);
          this.refDoc = obj;
      }
  }
  public String getRefDocModel() {
    return refDocModel;
  }

  public void setRefDocModel(String refDocModel) {
      this.refDocModel = refDocModel;
  }
  public String getRefDocPath() {
    return refDocPath;
  }

  public void setRefDocPath(String refDocPath) {
      this.refDocPath = refDocPath;
  }
  public String getRefDocTitle() {
    return refDocTitle;
  }

  public void setRefDocTitle(String refDocTitle) {
      this.refDocTitle = refDocTitle;
  }
  public String getRefDocLink() {
    return refDocLink;
  }

  public void setRefDocLink(String refDocLink) {
      this.refDocLink = refDocLink;
  }
  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Object campaign)
  {
      if(campaign instanceof String)
      {
          String strId;
          strId = (String)campaign;

          Campaign obj = new Campaign();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.campaign = obj;
      }
      else
      {
          Campaign obj = JsonUtil.getJsonMapper().convertValue(campaign, Campaign.class);
          obj.setIsLoaded(true);
          this.campaign = obj;
      }
  }
  public String getText() {
    return text;
  }

  public void setText(String text) {
      this.text = text;
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
    sb.append("class Comment {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  refDoc: ").append(refDoc).append("\n");
    sb.append("  refDocModel: ").append(refDocModel).append("\n");
    sb.append("  refDocPath: ").append(refDocPath).append("\n");
    sb.append("  refDocTitle: ").append(refDocTitle).append("\n");
    sb.append("  refDocLink: ").append(refDocLink).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

