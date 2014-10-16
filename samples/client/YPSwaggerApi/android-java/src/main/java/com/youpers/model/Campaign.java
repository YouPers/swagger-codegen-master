package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.User;
import com.youpers.model.Organization;
import com.youpers.model.Topic;
public class Campaign extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("start")
  private Date start = null;
  @JsonProperty("end")
  private Date end = null;
  @JsonProperty("topic")
  private Topic topic = null;
  @JsonProperty("organization")
  private Organization organization = null;
  @JsonProperty("participants")
  private String participants = null;
  @JsonProperty("location")
  private String location = null;
  @JsonProperty("city")
  private String city = null;
  @JsonProperty("slogan")
  private String slogan = null;
  @JsonProperty("paymentStatus")
  private String paymentStatus = null;
  @JsonProperty("productType")
  private String productType = null;
  @JsonProperty("campaignLeads")
  private List<User> campaignLeads = new ArrayList<User>();
  @JsonProperty("avatar")
  private String avatar = null;
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
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }
  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
      this.start = start;
  }
  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
      this.end = end;
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
  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Object organization)
  {
      if(organization instanceof String)
      {
          String strId;
          strId = (String)organization;

          Organization obj = new Organization();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.organization = obj;
      }
      else
      {
          Organization obj = JsonUtil.getJsonMapper().convertValue(organization, Organization.class);
          obj.setIsLoaded(true);
          this.organization = obj;
      }
  }
  public String getParticipants() {
    return participants;
  }

  public void setParticipants(String participants) {
      this.participants = participants;
  }
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
      this.location = location;
  }
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
      this.city = city;
  }
  public String getSlogan() {
    return slogan;
  }

  public void setSlogan(String slogan) {
      this.slogan = slogan;
  }
  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
      this.paymentStatus = paymentStatus;
  }
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
      this.productType = productType;
  }
  public List<User> getCampaignLeads() {
    return campaignLeads;
  }

  public void setCampaignLeads(List<User> campaignLeads) {
    this.campaignLeads = campaignLeads;
  }
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
      this.avatar = avatar;
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
    sb.append("class Campaign {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  topic: ").append(topic).append("\n");
    sb.append("  organization: ").append(organization).append("\n");
    sb.append("  participants: ").append(participants).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  slogan: ").append(slogan).append("\n");
    sb.append("  paymentStatus: ").append(paymentStatus).append("\n");
    sb.append("  productType: ").append(productType).append("\n");
    sb.append("  campaignLeads: ").append(campaignLeads).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

