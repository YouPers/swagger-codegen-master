package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.I18nString;
import com.youpers.model.AssessmentQuestion;
public class Assessment extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("nameI18n")
  private I18nString nameI18n = null;
  @JsonProperty("questions")
  private List<AssessmentQuestion> questions = new ArrayList<AssessmentQuestion>();
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
  public List<AssessmentQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<AssessmentQuestion> questions) {
    this.questions = questions;
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
    sb.append("  questions: ").append(questions).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

