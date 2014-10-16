package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.I18nString;
import com.youpers.model.ObjectId;
public class AssessmentQuestion extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("titleI18n")
  private I18nString titleI18n = null;
  @JsonProperty("mintextI18n")
  private I18nString mintextI18n = null;
  @JsonProperty("mintextexampleI18n")
  private I18nString mintextexampleI18n = null;
  @JsonProperty("mintextresultI18n")
  private I18nString mintextresultI18n = null;
  @JsonProperty("midtextI18n")
  private I18nString midtextI18n = null;
  @JsonProperty("midtextexampleI18n")
  private I18nString midtextexampleI18n = null;
  @JsonProperty("maxtextI18n")
  private I18nString maxtextI18n = null;
  @JsonProperty("maxtextexampleI18n")
  private I18nString maxtextexampleI18n = null;
  @JsonProperty("maxtextresultI18n")
  private I18nString maxtextresultI18n = null;
  @JsonProperty("exptextI18n")
  private I18nString exptextI18n = null;
  @JsonProperty("category")
  private String category = null;
  @JsonProperty("assessment")
  private ObjectId assessment = null;
  @JsonProperty("type")
  private String type = null;
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
  public I18nString getMintextI18n() {
    return mintextI18n;
  }

  public void setMintextI18n(Object mintextI18n)
  {
      if(mintextI18n instanceof String)
      {
          String strId;
          strId = (String)mintextI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.mintextI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(mintextI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.mintextI18n = obj;
      }
  }
  public I18nString getMintextexampleI18n() {
    return mintextexampleI18n;
  }

  public void setMintextexampleI18n(Object mintextexampleI18n)
  {
      if(mintextexampleI18n instanceof String)
      {
          String strId;
          strId = (String)mintextexampleI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.mintextexampleI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(mintextexampleI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.mintextexampleI18n = obj;
      }
  }
  public I18nString getMintextresultI18n() {
    return mintextresultI18n;
  }

  public void setMintextresultI18n(Object mintextresultI18n)
  {
      if(mintextresultI18n instanceof String)
      {
          String strId;
          strId = (String)mintextresultI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.mintextresultI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(mintextresultI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.mintextresultI18n = obj;
      }
  }
  public I18nString getMidtextI18n() {
    return midtextI18n;
  }

  public void setMidtextI18n(Object midtextI18n)
  {
      if(midtextI18n instanceof String)
      {
          String strId;
          strId = (String)midtextI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.midtextI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(midtextI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.midtextI18n = obj;
      }
  }
  public I18nString getMidtextexampleI18n() {
    return midtextexampleI18n;
  }

  public void setMidtextexampleI18n(Object midtextexampleI18n)
  {
      if(midtextexampleI18n instanceof String)
      {
          String strId;
          strId = (String)midtextexampleI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.midtextexampleI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(midtextexampleI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.midtextexampleI18n = obj;
      }
  }
  public I18nString getMaxtextI18n() {
    return maxtextI18n;
  }

  public void setMaxtextI18n(Object maxtextI18n)
  {
      if(maxtextI18n instanceof String)
      {
          String strId;
          strId = (String)maxtextI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.maxtextI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(maxtextI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.maxtextI18n = obj;
      }
  }
  public I18nString getMaxtextexampleI18n() {
    return maxtextexampleI18n;
  }

  public void setMaxtextexampleI18n(Object maxtextexampleI18n)
  {
      if(maxtextexampleI18n instanceof String)
      {
          String strId;
          strId = (String)maxtextexampleI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.maxtextexampleI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(maxtextexampleI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.maxtextexampleI18n = obj;
      }
  }
  public I18nString getMaxtextresultI18n() {
    return maxtextresultI18n;
  }

  public void setMaxtextresultI18n(Object maxtextresultI18n)
  {
      if(maxtextresultI18n instanceof String)
      {
          String strId;
          strId = (String)maxtextresultI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.maxtextresultI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(maxtextresultI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.maxtextresultI18n = obj;
      }
  }
  public I18nString getExptextI18n() {
    return exptextI18n;
  }

  public void setExptextI18n(Object exptextI18n)
  {
      if(exptextI18n instanceof String)
      {
          String strId;
          strId = (String)exptextI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.exptextI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(exptextI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.exptextI18n = obj;
      }
  }
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
      this.category = category;
  }
  public ObjectId getAssessment() {
    return assessment;
  }

  public void setAssessment(Object assessment)
  {
      if(assessment instanceof String)
      {
          String strId;
          strId = (String)assessment;

          ObjectId obj = new ObjectId();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.assessment = obj;
      }
      else
      {
          ObjectId obj = JsonUtil.getJsonMapper().convertValue(assessment, ObjectId.class);
          obj.setIsLoaded(true);
          this.assessment = obj;
      }
  }
  public String getType() {
    return type;
  }

  public void setType(String type) {
      this.type = type;
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
    sb.append("class AssessmentQuestion {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  titleI18n: ").append(titleI18n).append("\n");
    sb.append("  mintextI18n: ").append(mintextI18n).append("\n");
    sb.append("  mintextexampleI18n: ").append(mintextexampleI18n).append("\n");
    sb.append("  mintextresultI18n: ").append(mintextresultI18n).append("\n");
    sb.append("  midtextI18n: ").append(midtextI18n).append("\n");
    sb.append("  midtextexampleI18n: ").append(midtextexampleI18n).append("\n");
    sb.append("  maxtextI18n: ").append(maxtextI18n).append("\n");
    sb.append("  maxtextexampleI18n: ").append(maxtextexampleI18n).append("\n");
    sb.append("  maxtextresultI18n: ").append(maxtextresultI18n).append("\n");
    sb.append("  exptextI18n: ").append(exptextI18n).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  assessment: ").append(assessment).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

