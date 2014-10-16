package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.ObjectId;
import com.youpers.model.Topic;
public class PaymentCode extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("code")
  private String code = null;
  @JsonProperty("campaign")
  private ObjectId campaign = null;
  @JsonProperty("topic")
  private Topic topic = null;
  @JsonProperty("productType")
  private String productType = null;
  @JsonProperty("users")
  private Long users = null;
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
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
      this.code = code;
  }
  public ObjectId getCampaign() {
    return campaign;
  }

  public void setCampaign(Object campaign)
  {
      if(campaign instanceof String)
      {
          String strId;
          strId = (String)campaign;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.campaign = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(campaign, ObjectId.class);
          obj.setIsLoaded(true);
          this.campaign = obj;
      }
  }
  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Object topic)
  {
      if(topic instanceof String)
      {
          String strId;
          strId = (String)topic;

          Topic obj = new Topic();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.topic = obj;
      }
      else
      {
          Topic obj = JsonUtil.getJsonMapper().convertValue(topic, Topic.class);
          obj.setIsLoaded(true);
          this.topic = obj;
      }
  }
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
      this.productType = productType;
  }
  public Long getUsers() {
    return users;
  }

  public void setUsers(Long users) {
      this.users = users;
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
    sb.append("class PaymentCode {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  topic: ").append(topic).append("\n");
    sb.append("  productType: ").append(productType).append("\n");
    sb.append("  users: ").append(users).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

