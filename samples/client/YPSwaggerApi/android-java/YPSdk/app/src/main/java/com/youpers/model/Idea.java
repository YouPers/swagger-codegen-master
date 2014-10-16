package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.User;
import com.youpers.model.I18nString;
import com.youpers.model.Campaign;
import com.youpers.model.Topic;
public class Idea extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("titleI18n")
  private I18nString titleI18n = null;
  @JsonProperty("descriptionI18n")
  private I18nString descriptionI18n = null;
  @JsonProperty("textI18n")
  private I18nString textI18n = null;
  @JsonProperty("number")
  private String number = null;
  @JsonProperty("source")
  private String source = null;
  @JsonProperty("author")
  private User author = null;
  @JsonProperty("campaign")
  private Campaign campaign = null;
  @JsonProperty("defaultfrequency")
  private String defaultfrequency = null;
  @JsonProperty("defaultexecutiontype")
  private String defaultexecutiontype = null;
  @JsonProperty("defaultduration")
  private Long defaultduration = null;
  @JsonProperty("topics")
  private List<Topic> topics = new ArrayList<Topic>();
  @JsonProperty("qualityFactor")
  private Long qualityFactor = null;
  @JsonProperty("recWeights")
  private String recWeights = null;
  @JsonProperty("action")
  private String action = null;
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
  public I18nString getTitleI18n() {
    return titleI18n;
  }

  public void setTitleI18n(Object titleI18n)
  {
      if(titleI18n instanceof String)
      {
          String strId;
          strId = (String)titleI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.titleI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(titleI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.titleI18n = obj;
      }
  }
  public I18nString getDescriptionI18n() {
    return descriptionI18n;
  }

  public void setDescriptionI18n(Object descriptionI18n)
  {
      if(descriptionI18n instanceof String)
      {
          String strId;
          strId = (String)descriptionI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.descriptionI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(descriptionI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.descriptionI18n = obj;
      }
  }
  public I18nString getTextI18n() {
    return textI18n;
  }

  public void setTextI18n(Object textI18n)
  {
      if(textI18n instanceof String)
      {
          String strId;
          strId = (String)textI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.textI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(textI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.textI18n = obj;
      }
  }
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
      this.number = number;
  }
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
      this.source = source;
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
  public String getDefaultfrequency() {
    return defaultfrequency;
  }

  public void setDefaultfrequency(String defaultfrequency) {
      this.defaultfrequency = defaultfrequency;
  }
  public String getDefaultexecutiontype() {
    return defaultexecutiontype;
  }

  public void setDefaultexecutiontype(String defaultexecutiontype) {
      this.defaultexecutiontype = defaultexecutiontype;
  }
  public Long getDefaultduration() {
    return defaultduration;
  }

  public void setDefaultduration(Long defaultduration) {
      this.defaultduration = defaultduration;
  }
  public List<Topic> getTopics() {
    return topics;
  }

  public void setTopics(List<Topic> topics) {
    this.topics = topics;
  }
  public Long getQualityFactor() {
    return qualityFactor;
  }

  public void setQualityFactor(Long qualityFactor) {
      this.qualityFactor = qualityFactor;
  }
  public String getRecWeights() {
    return recWeights;
  }

  public void setRecWeights(String recWeights) {
      this.recWeights = recWeights;
  }
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
      this.action = action;
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
    sb.append("class Idea {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  titleI18n: ").append(titleI18n).append("\n");
    sb.append("  descriptionI18n: ").append(descriptionI18n).append("\n");
    sb.append("  textI18n: ").append(textI18n).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  defaultfrequency: ").append(defaultfrequency).append("\n");
    sb.append("  defaultexecutiontype: ").append(defaultexecutiontype).append("\n");
    sb.append("  defaultduration: ").append(defaultduration).append("\n");
    sb.append("  topics: ").append(topics).append("\n");
    sb.append("  qualityFactor: ").append(qualityFactor).append("\n");
    sb.append("  recWeights: ").append(recWeights).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

