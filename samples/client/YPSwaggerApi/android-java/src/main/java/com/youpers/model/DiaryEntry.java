package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.User;
import com.youpers.model.ObjectId;
public class DiaryEntry extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("owner")
  private User owner = null;
  @JsonProperty("type")
  private String type = null;
  @JsonProperty("image")
  private String image = null;
  @JsonProperty("refId")
  private ObjectId refId = null;
  @JsonProperty("text")
  private String text = null;
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("feedback")
  private Long feedback = null;
  @JsonProperty("dateBegin")
  private Date dateBegin = null;
  @JsonProperty("dateEnd")
  private Date dateEnd = null;
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
  public User getOwner() {
    return owner;
  }

  public void setOwner(Object owner)
  {
      if(owner instanceof String)
      {
          String strId;
          strId = (String)owner;

          User obj = new User();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.owner = obj;
      }
      else
      {
          User obj = JsonUtil.getJsonMapper().convertValue(owner, User.class);
          obj.setIsLoaded(true);
          this.owner = obj;
      }
  }
  public String getType() {
    return type;
  }

  public void setType(String type) {
      this.type = type;
  }
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
      this.image = image;
  }
  public ObjectId getRefId() {
    return refId;
  }

  public void setRefId(Object refId)
  {
      if(refId instanceof String)
      {
          String strId;
          strId = (String)refId;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.refId = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(refId, ObjectId.class);
          obj.setIsLoaded(true);
          this.refId = obj;
      }
  }
  public String getText() {
    return text;
  }

  public void setText(String text) {
      this.text = text;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }
  public Long getFeedback() {
    return feedback;
  }

  public void setFeedback(Long feedback) {
      this.feedback = feedback;
  }
  public Date getDateBegin() {
    return dateBegin;
  }

  public void setDateBegin(Date dateBegin) {
      this.dateBegin = dateBegin;
  }
  public Date getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(Date dateEnd) {
      this.dateEnd = dateEnd;
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
    sb.append("class DiaryEntry {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  refId: ").append(refId).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  feedback: ").append(feedback).append("\n");
    sb.append("  dateBegin: ").append(dateBegin).append("\n");
    sb.append("  dateEnd: ").append(dateEnd).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

