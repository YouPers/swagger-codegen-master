package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.I18nString;
import com.youpers.model.AssessmentQuestion;
import com.youpers.model.Topic;
public class Assessment extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("nameI18n")
  private I18nString nameI18n = null;
  @JsonProperty("impactQuestionI18n")
  private I18nString impactQuestionI18n = null;
  @JsonProperty("impactQuestionLeftI18n")
  private I18nString impactQuestionLeftI18n = null;
  @JsonProperty("impactQuestionRightI18n")
  private I18nString impactQuestionRightI18n = null;
  @JsonProperty("questions")
  private List<AssessmentQuestion> questions = new ArrayList<AssessmentQuestion>();
  @JsonProperty("topic")
  private Topic topic = null;
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
  public I18nString getNameI18n() {
    return nameI18n;
  }

  public void setNameI18n(Object nameI18n)
  {
      if(nameI18n instanceof String)
      {
          String strId;
          strId = (String)nameI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.nameI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(nameI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.nameI18n = obj;
      }
  }
  public I18nString getImpactQuestionI18n() {
    return impactQuestionI18n;
  }

  public void setImpactQuestionI18n(Object impactQuestionI18n)
  {
      if(impactQuestionI18n instanceof String)
      {
          String strId;
          strId = (String)impactQuestionI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.impactQuestionI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(impactQuestionI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.impactQuestionI18n = obj;
      }
  }
  public I18nString getImpactQuestionLeftI18n() {
    return impactQuestionLeftI18n;
  }

  public void setImpactQuestionLeftI18n(Object impactQuestionLeftI18n)
  {
      if(impactQuestionLeftI18n instanceof String)
      {
          String strId;
          strId = (String)impactQuestionLeftI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.impactQuestionLeftI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(impactQuestionLeftI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.impactQuestionLeftI18n = obj;
      }
  }
  public I18nString getImpactQuestionRightI18n() {
    return impactQuestionRightI18n;
  }

  public void setImpactQuestionRightI18n(Object impactQuestionRightI18n)
  {
      if(impactQuestionRightI18n instanceof String)
      {
          String strId;
          strId = (String)impactQuestionRightI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.impactQuestionRightI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(impactQuestionRightI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.impactQuestionRightI18n = obj;
      }
  }
  public List<AssessmentQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<AssessmentQuestion> questions) {
    this.questions = questions;
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
    sb.append("class Assessment {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nameI18n: ").append(nameI18n).append("\n");
    sb.append("  impactQuestionI18n: ").append(impactQuestionI18n).append("\n");
    sb.append("  impactQuestionLeftI18n: ").append(impactQuestionLeftI18n).append("\n");
    sb.append("  impactQuestionRightI18n: ").append(impactQuestionRightI18n).append("\n");
    sb.append("  questions: ").append(questions).append("\n");
    sb.append("  topic: ").append(topic).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

